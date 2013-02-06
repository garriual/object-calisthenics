import java.util.ArrayList;


public class SavedJobs
{
  private ArrayList<Job> savedJobs;
  public SavedJobs(){
    this.savedJobs = new ArrayList<Job>();
  }
  
  public void addJob(Job job){
    this.savedJobs.add(job);
  }
  
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(Job job: savedJobs){
      sb.append(job);
      sb.append("\n");
    }
    return sb.toString();
  }
}
