import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao USD: ");
        usd = sc.nextDouble();
        double quydoi = usd *23000;
        System.out.printf("%f USD = %f VND",usd,quydoi);

    }
}
