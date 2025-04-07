public class Main {
    public static void main(String[] args) {
        VirusBiologico a=new VirusBiologico();
        a.mostrar();

        VirusBiologico b=new VirusBiologico("sangre","ebola","muerte","hemorragia interna");
        VirusBiologico c=new VirusBiologico();
        c.leer();

        System.out.println("*****Virsu 1**********");
        a.mostrar();
        System.out.println("*****Virsu 2**********");
        b.mostrar();
        System.out.println("*****Virsu 3**********");
        c.mostrar();

    }
}