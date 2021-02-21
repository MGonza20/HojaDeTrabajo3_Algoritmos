import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sort {
    public int[] getNumeros() {
        return numeros;
    }

    private int numeros[];
    /**
     *
     */
    public Sort() {
        // TODO Auto-generated constructor stub
        numeros = new int[3000];
    }
    /*
     * se llena el array
     */
    public void llenarNumeros() throws IOException {
        Random randomN = new Random();
        for (int i = 0; i<3000; i++) {
            numeros[i] = randomN.nextInt();
        }
        FileWriter writer = new FileWriter("C:\\Users\\50246\\IdeaProjects\\Sorts\\JavaOut.csv");

        for (int j = 0; j < numeros.length; j++) {
            writer.append(String.valueOf(numeros[j]));
            writer.append("\n");
        }
        writer.close();

    }
    public int[] leerDocu() {
        String path= "C:\\Users\\50246\\IdeaProjects\\Sorts\\JavaOut.csv";


        // TODO Auto-generated method stub

        try {
            FileReader fr = new FileReader(path);// Objeto para que establece origen de los datos
            BufferedReader entrada = new BufferedReader(fr); // buffer para el manejo de los datos
            String s="";
            ArrayList<String> values= new ArrayList<>();
            String[] valores = new String[3000];
            String temp = "";
            while((s = entrada.readLine()) != null) {// leer linea a linea
                valores = s.split(",");
                values.add(valores[0]);
                //System.out.println(values[0]);

            }
            String[] valores2 = new String[3000];
            for (int j = 0; j < values.size(); j++) {

                // Assign each value to String array
                valores2[j] = values.get(j);
            }
            //System.out.println(valores2.length);
            numeros = Arrays.stream(valores2).mapToInt(Integer::parseInt).toArray();
            //System.out.println(values.length);
            entrada.close();
            return numeros;

            // impresion de los datos leidos en pantalla
        }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: ");}
        catch(java.io.IOException ioex) {

        }
        return null;
    }
    public int[] arregloDe10(int[] arreglo){
        int[] arreglo2 = new int[10];
        for(int i=0; i<10;i++){
            arreglo2[i] = arreglo[i];
        }
        return arreglo2;
    }
    public int[] arregloDe100(int[] arreglo){
        int[] arreglo2 = new int[100];
        for(int i=0; i<100;i++){
            arreglo2[i] = arreglo[i];
        }
        return arreglo2;
    }
    public int[] arregloDe500(int[] arreglo){
        int[] arreglo2 = new int[500];
        for(int i=0; i<500;i++){
            arreglo2[i] = arreglo[i];
        }
        return arreglo2;
    }
    public int[] arregloDe1000(int[] arreglo){
        int[] arreglo2 = new int[1000];
        for(int i=0; i<1000;i++){
            arreglo2[i] = arreglo[i];
        }
        return arreglo2;
    }
    public int[] arregloDe2000(int[] arreglo){
        int[] arreglo2 = new int[2000];
        for(int i=0; i<2000;i++){
            arreglo2[i] = arreglo[i];
        }
        return arreglo2;
    }

    /*
     * swap es parte del algoritmo sortbubble
     */
    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    /*
     * bubble sort
     */
    public int[] bubbleSort(int[] numeros) {
        for (int lastUnsortedIndex = numeros.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    swap(numeros, i, i + 1);
                }
            }
        }
        return numeros;
    }


}
