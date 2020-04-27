import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("input size array");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);
        array = new int[size];
        for (int i =0; i< array.length;i++){
            System.out.println("Enter Element " + i);
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array:","");
        for (int j =0; j< array.length;j++){
            System.out.print(array[j]+"\t");
        }
        // Dao nguoc phan tu mang
        for (int k =0; k< array.length/2;k++){
            int temple;
            temple= array[k];
            array[k] = array[array.length-k-1];
            array[array.length-k-1] = temple;
        }
        System.out.printf("%-20s%s","Elements in array:","");
        for (int m =0; m< array.length;m++){
            System.out.print(array[m]+"\t");
        }
    }
}
