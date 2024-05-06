public class Test
{
  public static void main(String[] args)
  {
    RiffModelManager r = new RiffModelManager();
    r.strumEm();
    r.strumAm();
    r.pickE(3);
    r.pickE(3);
    r.pickE(7);
    r.pickE(3);

    r.pickB(2);
    r.pickB(2);

    r.pickEE(9);

    r.strumFin();
    System.out.println(r.tabToString());


  }
}
