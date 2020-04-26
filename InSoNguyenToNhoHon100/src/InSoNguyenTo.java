import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =2;i<100;i++){
            boolean check = true;
            if (i==2){
                System.out.println(i);
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(i);
                }
            }
        }
    }
}
