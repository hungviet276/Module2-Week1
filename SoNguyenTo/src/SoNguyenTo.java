import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int n = sc.nextInt();
        boolean check = true;
        if (n<2){
            System.out.println(n + " Khong la so nguyen to");
        }else {for (int i =2;i<=n/2;i++){
            if (n%i==0){
                check = false;
                break;
            }
        }} if (check){
            System.out.println(n +" la so nguyen to");
        } else System.out.println(n + " khong la so nguyen to");
    }
}
