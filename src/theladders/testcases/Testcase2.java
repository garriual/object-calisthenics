package theladders.testcases;

import theladders.beans.JobType;
import theladders.entities.Recruiter;

public class Testcase2
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Recruiter recruiter = new Recruiter("Sean");
    recruiter.postJob("Software Engineer", JobType.ATSJOB);
    recruiter.postJob("Senior Software Engineer", JobType.JREQJOB);
    recruiter.postJob("Data Engineer", JobType.JREQJOB);
    recruiter.postJob("UI Engineer", JobType.ATSJOB);
    
    recruiter.viewPostedJobs();
  }

}
