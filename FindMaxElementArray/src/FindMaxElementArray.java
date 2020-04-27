import java.util.Scanner;

public class FindMaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter size array");
            size =sc.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20");
            }
        } while (size>20);
        array = new int[size];
        for (int i =0; i< array.length;i++){
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j< array.length;j++){
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index =0;
        for (int k =0; k < array.length;k++){
            if (array[k]>max){
                max = array[k];
                index = k +1;
            }
        }
        System.out.println("Max of Array is"+ max+" index " + index);
    }
}
