
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RiffTxtWriterLog
{
  private ArrayList<Riff> riffs;
  private static RiffTxtWriterLog instance;
  private static Object lock = new Object();

  private RiffTxtWriterLog(){
    this.riffs = new ArrayList<>();
  }

  public static RiffTxtWriterLog getInstance(){
    if(instance==null){
      synchronized (lock){
        if (instance==null){
          instance = new RiffTxtWriterLog();
        }
      }
    }
    return instance;
  }

  public ArrayList<Riff> getLogs(){
    return riffs;
  }
  
  public void addToFile(Riff riff, String title){
    if(riff==null){
      return;
    }
    //BufferedWriter out = null;
    try{
      String filename = ".\\Riffs\\Riff-"+title+".txt";
      FileWriter file = new FileWriter(filename);
      PrintWriter output = new PrintWriter(file, true);
      output.println(riff.tabToString());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
