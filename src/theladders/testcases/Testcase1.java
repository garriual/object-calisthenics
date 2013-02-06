package theladders.testcases;

import theladders.beans.JobType;
import theladders.entities.Recruiter;

public class Testcase1
{
  public static void main(String[] args)
  {
    Recruiter recruiter = new Recruiter("Sean");
    recruiter.postJob("Software Engineer", JobType.ATSJOB);
  }
}
