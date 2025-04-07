import javax.swing.*;
import java.util.Scanner;

public class Agentecontagioso
{  protected String formaPropagacion;
    Scanner lec=new Scanner(System.in);
    public Agentecontagioso()
    {
        formaPropagacion="Aire";
    }
    public Agentecontagioso(String f)
    {
        formaPropagacion=f;
    }
    public void leer()
    {
        System.out.println("Int, forma de propagacon al virus");
    }
    public void mostrar()
    {
        System.out.println("forma de propagar:"+formaPropagacion);
    }

}
