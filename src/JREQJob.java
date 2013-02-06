import java.util.Date;


public class JREQJob extends Job
{

  public JREQJob(String name,
                 Date postedDate)
  {
    super(name, postedDate);
    requireResume = true;
  }

}
