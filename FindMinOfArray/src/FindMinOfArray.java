import java.util.Scanner;

public class FindMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i =0; i < array.length; i++){
            array[i]= (int)Math.floor(Math.random()*100);
        }
        int min = array[0];
        for (int j =0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        for (int e =0; e< array.length;e++){
            if (array[e]<min){
                min = array[e];
            }
        }
        System.out.println("Min of Array is: " + min);
    }
}
