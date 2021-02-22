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
            numeros[i] = Math.abs(randomN.nextInt());
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
/*
gnome sort
 */
    public int[] gnomeSort(int arr[], int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
    /*
    quick sort
     */
    public int[] quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return null;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        /*for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }*/
        quickSort(input, pivotIndex + 1, end);
        return input;
    }

    public int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
/*
merge
 */
public int[] mergeSort(int[] numeros, int start, int end) {

    if (end - start < 2) {
        return numeros;
    }
    int mid = (start + end) / 2;
    mergeSort(numeros, start, mid);
    mergeSort(numeros, mid, end);
    merge(numeros, start, mid, end);
    return numeros;
}

    public static int[] merge(int[] numeros, int start, int mid, int end) {

        if (numeros[mid - 1] <= numeros[mid]) {
            return numeros;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = numeros[i] <= numeros[j] ? numeros[i++] : numeros[j++];
        }

        System.arraycopy(numeros, i, numeros, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, numeros, start, tempIndex);
        return numeros;
    }

}
