import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Sort sort = new Sort();
        sort.llenarNumeros();
        sort.leerDocu();

        System.out.println(sort.leerDocu().length);



    }
}
