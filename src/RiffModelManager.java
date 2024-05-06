import java.util.Arrays;

public class RiffModelManager
{
  private String E;
  private String A;
  private String D;
  private String G;
  private String B;
  private String e;

  public RiffModelManager(){
    this.E = "E: ";
    this.A = "A: ";
    this.D = "D: ";
    this.G = "G: ";
    this.B = "B: ";
    this.e = "e: ";
  }

  public void strumMute(){
    E+="x";
    A+="x";
    D+="x";
    G+="x";
    B+="x";
    e+="x";
  }

  public void strumMute(String note){
    switch (note){
      case "E":
        E+="x";
        break;
      case "A":
        A+="x";
        break;
      case "D":
        D+="x";
        break;
      case "G":
        G+="x";
        break;
      case "B":
        B+="x";
        break;
      case "e":
        e+="x";
        break;
    }
  }

  public void strumMute(String note, String note2){
    if (note.equals(note2)){
      System.out.println("Error. Same string muted twice.");
    }
    else {
      switch (note){
        case "E":
          E+="x";
          break;
        case "A":
          A+="x";
          break;
        case "D":
          D+="x";
          break;
        case "G":
          G+="x";
          break;
        case "B":
          B+="x";
          break;
        case "e":
          e+="x";
          break;
      }

      switch (note2){
        case "E":
          E+="x";
          break;
        case "A":
          A+="x";
          break;
        case "D":
          D+="x";
          break;
        case "G":
          G+="x";
          break;
        case "B":
          B+="x";
          break;
        case "e":
          e+="x";
          break;
      }
    }
  }

  public void pickEE(int n){
    E+=n;
  }
  public void pickA(int n){
    A+=n;
  }
  public void pickD(int n){
    D+=n;
  }
  public void pickG(int n){
    G+=n;
  }
  public void pickB(int n){
    E+=n;
  }
  public void pickE(int n){
    e+=n;
  }
  public void strumPause(){
    E+="-";
    A+="-";
    D+="-";
    G+="-";
    B+="-";
    e+="-";
  }

  public void strumPause(String note){
    switch (note){
      case "E":
        E+="-";
        break;
      case "A":
        A+="-";
        break;
      case "D":
        D+="-";
        break;
      case "G":
        G+="-";
        break;
      case "B":
        B+="-";
        break;
      case "e":
        e+="-";
        break;
    }
  }


  public void strumEm(){
    E+="0";
    A+="2";
    D+="2";
    G+="0";
    B+="0";
    e+="0";
  }

  public void strumE(){
    E+="0";
    A+="2";
    D+="2";
    G+="1";
    B+="0";
    e+="0";
  }

  public void strumAm(){
    E+="0";
    A+="0";
    D+="2";
    G+="2";
    B+="1";
    e+="0";
  }

  public void strumC(){
    E+="x";
    A+="3";
    D+="2";
    G+="0";
    B+="1";
    e+="0";
  }




  public void strumFin(){
    int sizeE = E.length();
    int sizeA = A.length();
    int sizeD = D.length();
    int sizeB = G.length();
    int sizeG = B.length();
    int sizee = e.length();

    int arr[] = {sizeE,sizeA,sizeD,sizeG,sizeB,sizee};
    for (int i=0;i<arr.length;i++){
      for (int j = i+1;j<arr.length;j++){
        int temporary = 0;
        if (arr[j]<arr[i]){
          temporary = arr[i];
          arr[i] = arr[j];
          arr[j] = temporary;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    int finSize = arr[5];

    int todoE = finSize - E.length();
    for (int i = 0; i < todoE; i++)
    {
      strumPause("E");
    }

    int todoA = finSize - A.length();
    for (int i = 0; i < todoA; i++)
    {
      strumPause("A");
    }

    int todoD = finSize - D.length();
    for (int i = 0; i < todoD; i++)
    {
      strumPause("D");
    }

    int todoG = finSize - G.length();
    for (int i = 0; i < todoG; i++)
    {
      strumPause("G");
    }

    int todoB = finSize - B.length();
    for (int i = 0; i < todoB; i++)
    {
      strumPause("B");
    }

    int todoe = finSize - e.length();
    for (int i = 0; i < todoe; i++)
    {
      strumPause("e");
    }


  }

  public String tabToString(){
    return E+"\n"+A+"\n"+D+"\n"+G+"\n"+B+"\n"+e;
  }


}
