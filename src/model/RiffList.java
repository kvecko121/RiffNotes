package model;

import java.util.ArrayList;

public class RiffList
{
  ArrayList<Riff> riffs;

  public RiffList(){
    this.riffs = new ArrayList<>();
  }

  public ArrayList<Riff> getRiffs() {
    return riffs;
  }

  public void addRiff(Riff riff){
    this.riffs.add(riff);
  }
}
