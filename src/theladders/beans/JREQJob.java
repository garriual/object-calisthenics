package theladders.beans;

import theladders.entities.Job;


public class JREQJob extends Job
{

  public JREQJob(String name)
  {
    super(name);
    requireResume = true;
  }

}
