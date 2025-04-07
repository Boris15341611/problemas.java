public class VirusBiologico extends Virus {
    private String sintomas;

    public VirusBiologico()
    {
        super();
        sintomas="tos seca, fiebre";
    }
    public VirusBiologico(String f,String n,String e,String s)
    {
        super(f,n,e);
        sintomas=s;
    }
    public void leer()
    {
    super.leer();
    System.out.println("Int, sintomas");
    sintomas=lec.next();
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.println("sintomas");
    }

}
