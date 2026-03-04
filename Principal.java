import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int n = 0;
        System.out.println("Ingrese la dimension del Almacen");
        n = m.ValidarEntero(sc);
        ObjVendedor[][] vendedor1 = new ObjVendedor[n][n];
        System.out.println("Llene la informacion del vendedor 1:");
        vendedor1 = m.LlenarMatriz(vendedor1, sc);
        m.MostrarMatriz(vendedor1);

    }
    
}
