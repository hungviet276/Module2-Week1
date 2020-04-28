import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {System.out.print("Nhap vao so luong sinh vien: ");
            size = sc.nextInt();
        } while (size>30);
        int[] point = new int[size];
        for (int i =0; i< point.length;i++){
            point[i]= (int)Math.floor(Math.random()*10);
        }
        int count = 0;
        for (int j =0; j< point.length;j++){
            System.out.print(point[j] + "\t");
            if (point[j]<=10&& point[j]>=5){
                count++;
            }
        }
        System.out.println("\n");
        System.out.println("Count ="+count);


    }
}
