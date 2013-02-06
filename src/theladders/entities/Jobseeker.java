package theladders.entities;
import java.util.Date;

import theladders.controllers.JobApplicationController;
import theladders.wrappers.AppliedJobs;
import theladders.wrappers.Name;
import theladders.wrappers.SavedJobs;
public class Jobseeker implements Comparable<Jobseeker>
{
  private Name name;
  private Resume resume;
  
  //group jobs to 1 object
  private SavedJobs savedJobs;
  private AppliedJobs appliedJobs;
  
  public Jobseeker(String name, Resume resume)
  {
    this.name = new Name(name);
    this.resume = resume;
    this.savedJobs = new SavedJobs();
  }

  //3. jobseeker can save job
  public void saveFor(Job job){
    savedJobs.addJob(job);
  }
  
  //4. jobseekers can apply to jobs posted by recruiters
  public void applyFor(Job job){
    if(job.requiredResume() && resume == null){
      throw new RuntimeException("This job requires resume.");
    }
    else if(!isOwnResume()){
      throw new RuntimeException("Please include your own resume.");
    } 
    JobApplicationController.registerFor(job, this);
    appliedJobs.applyJob(job);
  }
 
  //5. jobseekers can see a listing of jobs they have saved for later viewing
  public void printAppliedJobOn(Date date){
    appliedJobs.printJobsOn(date);
  }
  
  //6. jobseekers can see a listing of jobs for which they have applied
  public void printSavedJobs(){
    System.out.println(savedJobs);
  }
  
  public boolean isOwnResume(){
    if(resume == null) return false;
    return resume.isOwnResume(this);
  }
  
  @Override
  public int compareTo(Jobseeker o)
  {
    return this.name.compareTo(o.name);
  }

}
