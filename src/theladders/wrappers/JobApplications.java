package theladders.wrappers;
import java.util.ArrayList;
import java.util.Date;

import theladders.entities.JobApplication;

public class JobApplications
{
  private ArrayList<JobApplication> applications ;
  
  public JobApplications(){
    applications = new ArrayList<JobApplication>() ;
  }
  
  public void addApplication(JobApplication application){
    applications.add(application); 
  }
  public void print(){
    int i;
    int size = applications.size();
    for(i = 0 ; i < size; i++){
      System.out.println(applications.get(i));
    }
  }
  
  public int countAllApplicantsOn(Date date){
    int i;
    int size = applications.size();
    int count = 0;
    for(i = 0 ; i < size; i++){
      if(applications.get(i).isSameDate(date)){
        count++;
      }
    }
    return count;
  }
  
  public int getSize(){
    return applications.size();
  }
  
}
