package theladders.controllers;
import java.util.Date;

import theladders.entities.Job;
import theladders.entities.Recruiter;


public class TheLadders
{
  public void showAllApplicantsOn(Date date){
    /*ArrayList<Jobseeker> allJobseekers = new ArrayList<Jobseeker>();
    
    for(Jobseeker jobseeker: allJobseekers){
      jobseeker.printAppliedJobOn(date);
    }*/
    JobApplicationController.printApplicantsBy(date);
  }
  
  public void showJobApplicationByJob(Job job){
    JobApplicationController.getTotalApplicantsBy(job);
  }
  
  public void showJobApplicationByRecruiter(Recruiter recruiter){
    recruiter.viewTotalApplicants();
  }
}
