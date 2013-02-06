package theladders.testcases;

import theladders.beans.ATSJob;
import theladders.beans.JREQJob;
import theladders.entities.Job;
import theladders.entities.Jobseeker;
import theladders.entities.Resume;

public class Testcase4
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Jobseeker jobseeker = new Jobseeker("GARY", new Resume(""));
    
    Job job1 = new ATSJob("Software Engineer");
    Job job2 = new JREQJob("Java Developer");
    Job job3 = new ATSJob("Data Engineer");
    
    jobseeker.saveFor(job1);
    jobseeker.saveFor(job2);
    jobseeker.saveFor(job3);
    
    jobseeker.printSavedJobs();
  }

}
