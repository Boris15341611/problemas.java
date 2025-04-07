import java.util.Scanner;

public class Virus extends Agentecontagioso
{
    protected String nombre;
    protected String efectos;
   // Scanner lec=new Scanner(System.in);

    public Virus()
    {
        super();
        nombre="Covid";
        efectos="mortal";
    }
    public Virus(String f, String n,String e)
    {
        super(f);
        nombre=n;
        efectos=e;
    }
    public void leer()
    {
        super.leer();
        System.out.println("INT, nombre y efectos del viurs");
        nombre= lec.next();
        efectos= lec.next();
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.println(nombre+efectos);
    }
}
