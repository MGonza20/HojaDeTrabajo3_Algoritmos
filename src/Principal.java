import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Sort sort = new Sort();
        sort.llenarNumeros();
        sort.leerDocu();

        System.out.println(sort.leerDocu().length);

        //System.out.println(sort.leerDocu().get(0));
      for (int i = 0; i<sort.leerDocu().length; i++){
            System.out.println(sort.bubbleSort(sort.leerDocu())[i]);
        }





    }
}
