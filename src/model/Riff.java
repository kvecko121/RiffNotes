package model;

import java.util.Arrays;

public class Riff
{
  private String E;
  private String A;
  private String D;
  private String G;
  private String B;
  private String e;

  public Riff(){
    this.E = "E | ";
    this.A = "A | ";
    this.D = "D | ";
    this.G = "G | ";
    this.B = "B | ";
    this.e = "e | ";
  }

  public void strumMute(){
    E+=" x ";
    A+=" x ";
    D+=" x ";
    G+=" x ";
    B+=" x ";
    e+=" x ";
  }

  public void strumMute(String note){
    switch (note){
      case "E":
        E+=" x ";
        break;
      case "A":
        A+=" x ";
        break;
      case "D":
        D+=" x ";
        break;
      case "G":
        G+=" x ";
        break;
      case "B":
        B+=" x ";
        break;
      case "e":
        e+=" x ";
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
          E+=" x ";
          break;
        case "A":
          A+=" x ";
          break;
        case "D":
          D+=" x ";
          break;
        case "G":
          G+=" x ";
          break;
        case "B":
          B+=" x ";
          break;
        case "e":
          e+=" x ";
          break;
      }

      switch (note2){
        case "E":
          E+=" x ";
          break;
        case "A":
          A+=" x ";
          break;
        case "D":
          D+=" x ";
          break;
        case "G":
          G+=" x ";
          break;
        case "B":
          B+=" x ";
          break;
        case "e":
          e+=" x ";
          break;
      }
    }
  }

  public void pickE(int n)
  {
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        E += " " + picked + " ";
        break;
      case 2:
        E += picked + " ";
        break;
    }
  }
  public void pickA(int n){
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        A += " " + picked + " ";
        break;
      case 2:
        A += picked + " ";
        break;
    }
  }
  public void pickD(int n){
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        D += " " + picked + " ";
        break;
      case 2:
        D += picked + " ";
        break;
    }
  }
  public void pickG(int n){
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        G += " " + picked + " ";
        break;
      case 2:
        G += picked + " ";
        break;
    }
  }
  public void pickB(int n){
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        B += " " + picked + " ";
        break;
      case 2:
        B += picked + " ";
        break;
    }
  }
  public void picke(int n){
    String picked = String.valueOf(n);
    switch (picked.length()){
      case 1:
        e += " " + picked + " ";
        break;
      case 2:
        e += picked + " ";
        break;
    }
  }
  public void strumPause(){
    E+=" - ";
    A+=" - ";
    D+=" - ";
    G+=" - ";
    B+=" - ";
    e+=" - ";
  }

  public void strumPause(String note){
    switch (note){
      case "E":
        E+=" - ";
        break;
      case "A":
        A+=" - ";
        break;
      case "D":
        D+=" - ";
        break;
      case "G":
        G+=" - ";
        break;
      case "B":
        B+=" - ";
        break;
      case "e":
        e+=" - ";
        break;
    }
  }


  public void strumEm(){
    E+=" 0 ";
    A+=" 2 ";
    D+=" 2 ";
    G+=" 0 ";
    B+=" 0 ";
    e+=" 0 ";
  }

  public void strumE(){
    E+=" 0 ";
    A+=" 2 ";
    D+=" 2 ";
    G+=" 1 ";
    B+=" 0 ";
    e+=" 0 ";
  }

  public void strumAm(){
    E+=" 0 ";
    A+=" 0 ";
    D+=" 2 ";
    G+=" 2 ";
    B+=" 1 ";
    e+=" 0 ";
  }

  public void strumC(){
    E+=" x ";
    A+=" 3 ";
    D+=" 2 ";
    G+=" 0 ";
    B+=" 1 ";
    e+=" 0 ";
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
    int finSize = arr[5];

    int todoE = (finSize - E.length())/3;
    for (int i = 0; i < todoE; i++)
    {
      strumPause("E");
    }

    int todoA = (finSize - A.length())/3;
    for (int i = 0; i < todoA; i++)
    {
      strumPause("A");
    }

    int todoD = (finSize - D.length())/3;
    for (int i = 0; i < todoD; i++)
    {
      strumPause("D");
    }

    int todoG = (finSize - G.length())/3;
    for (int i = 0; i < todoG; i++)
    {
      strumPause("G");
    }

    int todoB = (finSize - B.length())/3;
    for (int i = 0; i < todoB; i++)
    {
      strumPause("B");
    }

    int todoe = (finSize - e.length())/3;
    for (int i = 0; i < todoe; i++)
    {
      strumPause("e");
    }
  }

  public void end(){
    E+="|";
    A+="|";
    D+="|";
    G+="|";
    B+="|";
    e+="|";

  }

  public String tabToString(){
    return E+"\n"+A+"\n"+D+"\n"+G+"\n"+B+"\n"+e;
  }


}
