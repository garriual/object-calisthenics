package theladders.entities;
import java.util.Date;


public class JobApplication
{
  private Jobseeker applicant;
  private Date date;
  
  public JobApplication(Jobseeker applicant){
    this.applicant = applicant;
    this.date = new Date();
  }
  
  public boolean isSameDate(Date date){
    return (this.date.equals(date));
  }
  
  public String toString(){
    return applicant.toString();
  }
}
