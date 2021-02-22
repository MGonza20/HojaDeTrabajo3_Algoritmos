import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

     /*   String i = "n";

        while (i.equals("n")) {
            Scanner teclado = new Scanner(System.in);
            CalcuPila calcu = new CalcuPila();
            System.out.println("*********Calculadora*********");
            System.out.println("Ingrese la ubicacion del archivo");
            String s = teclado.nextLine();
            calcu.leerDocu(s);
            System.out.println("La operacion en el documento es: " + calcu.leerDocu(s));
            System.out.println("El resultado es: " + calcu.operar(calcu.leerDocu(s)));

            System.out.println("Desea salir del programa? ");
            i = teclado.nextLine();
        }*/

        Sort sort = new Sort();
        sort.llenarNumeros();
        /*System.out.println(sort.leerDocu());
        for (int i = 0; i<Radix.radixsort(sort.leerDocu(), sort.leerDocu().length).length; i++) {
            System.out.println(Radix.radixsort(sort.leerDocu(), sort.leerDocu().length)[i]);
        }*/
        /*for (int i = 0; i<sort.leerDocu().length; i++){
            System.out.println(sort.leerDocu()[i]);
        }
        //sort.bubbleSort(sort.leerDocu());
        /*
        sort.gnomeSort(sort.arregloDe2000(sort.leerDocu()) ,sort.arregloDe2000(sort.leerDocu()).length);
      for (int i = 0; i<sort.gnomeSort(sort.arregloDe2000(sort.leerDocu()) ,sort.arregloDe2000(sort.leerDocu()).length).length; i++){
            System.out.println(sort.gnomeSort(sort.arregloDe2000(sort.leerDocu()) ,sort.arregloDe2000(sort.leerDocu()).length)[i]);
        }*/

        /*for (int i = 0; i<sort.quickSort(sort.arregloDe2000(sort.leerDocu()), 1, 10).length; i++){
            System.out.println(sort.gnomeSort(sort.arregloDe2000(sort.leerDocu()) ,sort.arregloDe2000(sort.leerDocu()).length)[i]);
        }*/


    }
}
