import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Sort sort = new Sort();
        sort.llenarNumeros();
        sort.leerDocu();
        //sort.bubbleSort(sort.leerDocu());

        sort.bubbleSort(sort.leerDocu());
        sort.bubbleSort(sort.arregloDe10(sort.leerDocu()));
        sort.bubbleSort(sort.arregloDe100(sort.leerDocu()));
        sort.bubbleSort(sort.arregloDe500(sort.leerDocu()));
        sort.bubbleSort(sort.arregloDe1000(sort.leerDocu()));
        sort.bubbleSort(sort.arregloDe2000(sort.leerDocu()));

      /*for (int i = 0; i<sort.leerDocu().length; i++){
            System.out.println(sort.bubbleSort(sort.leerDocu())[i]);
        }*/




    }
}
