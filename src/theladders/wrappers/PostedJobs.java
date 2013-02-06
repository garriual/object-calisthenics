package theladders.wrappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import theladders.controllers.JobApplicationController;
import theladders.entities.Job;

public class PostedJobs
{
  ArrayList<Job> jobs;


  public PostedJobs()
  {
    this.jobs = new ArrayList<Job>();
  }


  public String toString()
  {
    return jobs.toString();
  }


  public void addjob(Job job)
  {
    jobs.add(job);
  }


  public void print()
  {
    System.out.println(jobs);
  }


  public void viewApplicantsByJob()
  {
    print();
  }


  public void viewApplicantsByDay()
  {
    Collections.sort(jobs);
    for (Job job : jobs)
    {
      JobApplicationController.printApplicantsBy(job);
    }
  }


  public void viewApplicantsByJobAndDay()
  {
    Iterator<Job> keys = jobs.iterator();
    while (keys.hasNext())
    {
      Job current = keys.next();
      JobApplicationController.printApplicantsBy(current);
    }
  }


  public void printTotalApplicants()
  {
    int total = 0;
    Iterator<Job> keys = jobs.iterator();
    while (keys.hasNext())
    {
      Job current = keys.next();
      total += JobApplicationController.getTotalApplicantsBy(current);
    }
    System.out.println(total);
  }

}
