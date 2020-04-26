import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác can");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1;i<=3;i++){
                        for (int j =1; j<=7;j++){
                            System.out.print("*");
                        }System.out.print("\n");
                    }
                case 2:
                    for (int a =1;a<=5;a++){
                        for (int b = 1; b<=a;b++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 3:
                    for (int c =5; c>= 1;c--){
                        for (int d = 1; d<=c;d++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 4 :
                    for (int e =1;e<=5;e++){
                        for (int f=1;f<=(5-e);f++){
                            System.out.print(" ");
                        }
                        for (int g =1;g<=(e*2-1);g++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
            }
        }
    }
}
