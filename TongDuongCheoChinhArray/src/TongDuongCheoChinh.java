import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong va dai cua ma tran vuong ");
        int size = sc.nextInt();
        double[][] array = new double[size][size];
        for (int i = 0; i< array.length;i++){
            for (int j =0; j< array[i].length;j++){
                array[i][j]= Math.floor(Math.random()*100+10);
            }
        }
        for (int m =0; m< array.length;m++){
            for (int n =0; n < array[m].length;n++){
                System.out.print(array[m][n] + "\t");
            }
            System.out.print("\n");
        }
        double sum = SumDuongCheo(array);
        System.out.println(sum);

    }
    public static double SumDuongCheo(double[][] array){
        double sum=0 ;
        for (int i =0;i< array.length;i++){
            for (int j =0; j< array[i].length;j++){
                if (i==j){sum += array[i][j];}
            }
        }
        return sum;
    }
}
