import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2,6,4,7,5,8,6};
        System.out.print("Nhap vao so k: ");
        int k = sc.nextInt();
        int index=0;
        boolean check = false;
        for (int i =0; i< array.length;i++){
            if (array[i] == k){
              index = i;
              check = true;
            }
        }
        if (check) {
            for (int j = index; j < array.length-1; j++) {
                array[j]= array[j+1];
            }
        }
        for (int f =0; f< array.length-1;f++){
            System.out.print(array[f] + "\t");
        }
    }
}
