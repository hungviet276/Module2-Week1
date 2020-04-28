import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu ");
        String demo = sc.nextLine();
        System.out.print("Nhap vao ky tu ");
        char kyTu =  sc.next().charAt(0);
        int count =0;
        for (int i =0; i < demo.length();i++){
           if (kyTu == demo.charAt(i)){
               count++;
            }
        }
        System.out.println(demo);
        System.out.println(count);
    }
}
