package theladders.entities;

import java.util.Date;

import theladders.beans.ATSJob;
import theladders.beans.Filter;
import theladders.beans.JREQJob;
import theladders.beans.JobType;
import theladders.wrappers.Name;
import theladders.wrappers.PostedJobs;

public class Recruiter
{
  private PostedJobs jobs;
  private Name       name;

  public Recruiter(String name)
  {
    this.jobs = new PostedJobs();
    this.name = new Name(name);
  }


  @Override
  public String toString()
  {
    return name.toString();
  }

  public void viewTotalApplicants(){
    jobs.printTotalApplicants();
  }
  
  
  // 1. recruiter can post job
  public void postJob(String title, JobType type)
  {
    Job newJob = (type.ATSJOB == type) ? new ATSJob(title) : new JREQJob(title);
    jobs.addjob(newJob);
  }


  // 2. recruiter can see a list of hobs that have posted
  public void viewPostedJobs()
  {
    
    jobs.print();
  }


  // 7. recruiter can see jobseekers who have applied to their jobs by both day and job
  public void viewApplicantsBy(Filter type)
  {
    switch (type)
    {
    case DAY:
      jobs.viewApplicantsByDay();
      return;
    case JOB:
      jobs.viewApplicantsByDay();
      return;
    case BOTH:
      jobs.viewApplicantsByJobAndDay();
      return;
    }
  }

}
