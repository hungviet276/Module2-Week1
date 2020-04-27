import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang 1 ");
        int size1 = sc.nextInt();
        System.out.print("Nhap vao do dai mang 2 ");
        int size2 = sc.nextInt();
        int size3 = size1+size2;
        int[] array1 = new  int[size1];
        int[] array2 = new  int[size2];
        int[] array3 = new  int[size3];
        for (int i =0; i< array1.length;i++){
            System.out.print("Nhap vao phan tu trong mang 1: ");
            array1[i] = sc.nextInt();
        }
        for (int j = 0;j < array2.length;j++){
            System.out.print("Nhap vao phan tu trong mang 2: ");
            array2[j] = sc.nextInt();
        }
        for (int n =0;n < array1.length;n++){
            array3[n] = array1[n];
        }
        for (int m =0;m< array2.length;m++){
            array3[m+size1]=array2[m];
        }
        for (int k =0;k < array3.length;k++){
            System.out.print(array3[k] + "\t");
        }


    }
}
