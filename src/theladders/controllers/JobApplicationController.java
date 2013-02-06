package theladders.controllers;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import theladders.entities.Job;
import theladders.entities.JobApplication;
import theladders.entities.Jobseeker;
import theladders.wrappers.JobApplications;

public class JobApplicationController
{
  private static HashMap<Job, JobApplications> applications = new HashMap<Job, JobApplications>();


  public static void registerFor(Job job,
                                 Jobseeker applicant)
  {
    JobApplications apps = applications.get(job);
    if (apps == null)
      apps = new JobApplications();
    JobApplication app = new JobApplication(applicant);
    apps.addApplication(app);
  }

  public static void printApplicantsBy(Date date)
  {
    int total = 0;
    Iterator<Job> apps = applications.keySet().iterator();
    while(apps.hasNext())
    {
      JobApplications current = applications.get(apps.next());
      total += current.countAllApplicantsOn(date);
    }
    System.out.println(total);
  }


  public static void printApplicantsBy(Job job)
  {
    JobApplications apps = applications.get(job);
    apps.print();
  }


  public static int getTotalApplicantsBy(Job job)
  {
    JobApplications apps = applications.get(job);
    if (apps == null)
      return 0;

    return apps.getSize();
  }
}
