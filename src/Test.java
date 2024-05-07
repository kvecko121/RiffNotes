public class Test
{
  public static void main(String[] args)
  {
    Riff r = new Riff();
    r.pickD(14);
    r.strumFin();

    r.pickD(2);
    r.strumFin();

    r.pickG(0);
    r.strumFin();

    r.pickA(3);
    r.pickD(16);
    r.strumFin();

    r.pickE(20);
    r.strumFin();

    r.end();
    System.out.println(r.tabToString());

    RiffTxtWriterLog writer = RiffTxtWriterLog.getInstance();
    writer.addToFile(r,"Ovlov_Strokes");

  }
}
