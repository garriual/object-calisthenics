package theladders.wrappers;

public class Name implements Comparable<Name>
{
  private String name;

  public Name(String name)
  {
    this.name = name;
  }

  public String toString()
  {
    return name;
  }

  @Override
  public int compareTo(Name arg0)
  {
    return this.name.compareTo(arg0.name);
  }

}
