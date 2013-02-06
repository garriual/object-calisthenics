package theladders.wrappers;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import theladders.entities.Job;


public class AppliedJobs
{
  private ArrayList<Job> appliedJobs;
  private TreeMap<Date,ArrayList<Job>> sortedAppliedJobs;
  
  public AppliedJobs(){
    this.appliedJobs = new ArrayList<Job>();
    this.sortedAppliedJobs = new TreeMap<Date, ArrayList<Job>>();
  }
  
  public void applyJob(Job job){
    this.appliedJobs.add(job);
    
    Date today = new Date();
    ArrayList<Job> applieds = sortedAppliedJobs.get(today);
    if(applieds == null) applieds = new ArrayList<Job>();
    applieds.add(job);
    
    sortedAppliedJobs.put(today, applieds);
  }
  
  public void printJobsOn(Date date){
    ArrayList<Job> applieds = sortedAppliedJobs.get(date);
    for(Job job : applieds){
      System.out.println(job);
    }
  }
  
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(Job job: appliedJobs){
      sb.append(job);
      sb.append("\n");
    }
    return sb.toString();
  }
}
