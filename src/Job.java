import java.util.Date;

public abstract class Job implements Comparable<Job>
{
  protected Name name;
  protected Date postedDate;
  protected boolean requireResume;
  
  public Job(String name, Date postedDate)
  {
    this.name = new Name(name);
    this.postedDate = postedDate;
    this.requireResume = false;
  }
  
  @Override
  public String toString()
  {
    return name.toString();
  }
  
  public boolean requiredResume()
  {
    return this.requireResume;
  }

  @Override
  public int compareTo(Job arg0)
  {
    return this.postedDate.compareTo(arg0.postedDate);
  }

}


