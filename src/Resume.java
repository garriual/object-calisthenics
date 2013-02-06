
public class Resume
{
  private String content;

  public boolean isOwnResume(Jobseeker jobseeker){
    return (content.indexOf(jobseeker.toString()) > -1);
  }

}
