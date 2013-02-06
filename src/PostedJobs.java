import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PostedJobs
{
  Set<Job> jobs;
  public PostedJobs()
  {
    this.jobs = new TreeSet<Job>();
  }

  public void addjob(Job job)
  {
    jobs.add(job);
  }

  public void print()
  {
    Iterator<Job> keys = jobs.iterator();
    while(keys.hasNext()){
      System.out.println(keys);
      keys.next();
    }
  }
  
  public void viewApplicantsByJob()
  {
    print();
  }

  public void viewApplicantsByDay()
  {
    ArrayList<Job> list = new ArrayList<Job>(jobs);
    Collections.sort(list);
    for(Job job : list){
      JobApplicationController.printApplicantsBy(job);
    }
  }
  
  public void viewApplicantsByJobAndDay(){
    Iterator<Job> keys = jobs.iterator();
    while(keys.hasNext()){
      Job current = keys.next();
      JobApplicationController.printApplicantsBy(current);
    }
  }
  
  public void printTotalApplicants()
  {
    int total = 0;
    Iterator<Job> keys = jobs.iterator();
    while(keys.hasNext()){
      Job current = keys.next();
      total += JobApplicationController.getTotalApplicantsBy(current);
    }
    System.out.println(total);
  }
  
}
