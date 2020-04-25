import java.sql.SQLOutput;
import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int year = sc.nextInt();
        boolean test = false;
        if (year % 4 ==0){
            if (year%100 != 0){
                test = true;
            }
        }
        if (year %100==0 && year % 400 ==0){
            test = true;
        }
        if (test){
            System.out.printf("Năm %d là năm nhuận",year);
        } else {System.out.printf("Năm %d không là năm nhuận",year);}
    }
}
