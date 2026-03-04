import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjVendedor[][] LlenarMatriz(ObjVendedor[][] m, Scanner sc){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjVendedor o = new ObjVendedor();
                System.out.println("\n Ingrese el nombre del vendedor: ");
                o.setNombre(sc.next());
                System.out.println("\n Ingrese sus ventas por cada mes: ");
                System.out.println("Enero: ");
                o.setEnero(sc.nextInt());
                System.out.println("Febrero: ");
                o.setFebrero(sc.nextInt());
                System.out.println("Marzo: ");
                o.setMarzo(sc.nextInt());
                System.out.println("Abril: ");
                o.setAbril(sc.nextInt());
                System.out.println("Mayo");
                o.setMayo(sc.nextInt());
                System.out.println("Junio: ");
                o.setJunio(sc.nextInt());
                System.out.println("Julio: ");
                o.setJulio(sc.nextInt());
                System.out.println("Agosto: ");
                o.setAgosto(sc.nextInt());
                System.out.println("Septiembre: ");
                o.setSeptiembre(sc.nextInt());
                System.out.println("Octubre: ");
                o.setOctubre(sc.nextInt());
                System.out.println("Noviembre");
                o.setNoviembre(sc.nextInt());
                System.out.println("Diciembre: ");
                o.setDiciembre(sc.nextInt());
                System.out.println("Ventas del año totales: ");
                o.setVentaMes(o.getEnero()+o.getFebrero()+o.getMayo()+o.getAbril()+o.getMarzo()+o.getJunio()+o.getJulio()+o.getAgosto()+o.getSeptiembre()+o.getOctubre()+o.getNoviembre()+o.getDiciembre());
                System.out.println(o.getVentaMes());

                System.out.println("\n Ingrese su numero de contacto: ");
                o.setNumeroCell(sc.nextInt());
                m[i][j] = o;
            }
        }

        return m;
    }

    public void MostrarMatriz(ObjVendedor[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) {

                    System.out.println("----------------------------------------- ");
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Ventas: " + m[i][j].getVentaMes());
                    System.out.println("Numero de contacto: " + m[i][j].getNumeroCell());
                    System.out.println("'----------------------------------------- '\n");
                }
            }
        }
    }

     public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor ingrese un número valido");
            sc.next();
        }
        return sc.nextInt();
    }

    public int ValidarDecimal(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor ingrese un número valido");
        }
        return sc.nextInt();
    }
    
}
