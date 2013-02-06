import java.util.ArrayList;
import java.util.Date;


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
