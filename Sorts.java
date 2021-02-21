import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sorts {

    private int[] numbers = new int[3000];
    Random randomN = new Random();

    public void GENERATErandomNums(){
        for (int i = 0; i < 3000; i = i++) {
            numbers[i] = randomN.nextInt();
        }
    }

    public void MergeSort(){

    }

}
