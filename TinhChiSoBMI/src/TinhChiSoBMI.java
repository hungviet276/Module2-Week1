import java.util.Scanner;

public class TinhChiSoBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Weight:");
        float weight = sc.nextFloat();
        System.out.print("Input height:");
        float height = sc.nextFloat();
        float bmi = weight/(height*height);
        String result ="";
        if (bmi<18.5){
            result = "Underweight";
        } else if (bmi<25){
            result = "Normal";
        } else if (bmi<30){
            result ="OverWeight";
        } else { result = "Obese";}
        System.out.printf("Weight %f Height %f is %s",weight,height,result);


    }
}
