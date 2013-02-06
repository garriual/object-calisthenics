package theladders.entities;

public class Resume
{
  private ResumeContent content;


  public Resume(String content)
  {
    this.content = new ResumeContent(content);
  }


  public boolean isOwnResume(Jobseeker jobseeker)
  {
    return content.contains(jobseeker.toString());
  }

  class ResumeContent
  {
    private String content;


    public ResumeContent(String content)
    {
      this.content = content;
    }


    public boolean contains(String name)
    {
      return (content.indexOf(name) > -1);
    }
  }
}
