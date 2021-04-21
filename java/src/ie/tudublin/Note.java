package ie.tudublin;


public class Note extends PApplet 
{

    private char note;
    private int duration; 

  // Create class constructor for Note class
  public Note() {

  }

public int getDuration()
{
    return duration;
}

public void setDuration(int duration)
{
    this.duration = duration;
}

}

public char getNote()
{
    return note;
}

public void setNetoe(char note)
{
    this.note = note;
}

// toString() method
@Override
public String toString()
{
    return "Note [duration=" + duration + ", note=" + note +  "]";
}

