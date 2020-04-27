import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i =0; i < array.length-1;i++){
            System.out.print("Nhap vao phan tu thu " + (i+1) +" ");
            array[i]= sc.nextInt();
        }
        for (int j = 0; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println("Nhap vao so can chen");
        int k = sc.nextInt();
        System.out.println("So can chen tai vi tri");
        int index = sc.nextInt();
        if (index<=1 || index > array.length-1){
            System.out.println("Khong chen duoc vao mang");
        } else {
            for ( int n = array.length-1;n > index;n--){
                array[n] = array[n-1];
            }
            array[index]= k;
        }
        for (int m = 0; m < array.length;m++){
            System.out.print(array[m] + "\t");
        }

    }
}
