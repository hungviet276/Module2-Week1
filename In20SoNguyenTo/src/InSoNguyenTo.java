import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so so nguyen to can in ra");
        int number = sc.nextInt();
        int count =0;

        for (int i =2;count<number;i++){
            boolean check = true;
            if (i==2){
                System.out.println(i);
                count++;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    System.out.println(i);
                }
            }
        }
    }
}
