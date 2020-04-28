import java.util.Scanner;

public class FindMaxOfArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array = new double[5][5];
        double max = array[0][0];
        for (int i =0; i< array.length;i++){
            for (int j =0; j< array[i].length;j++){
                array[i][j]= Math.floor(Math.random()*100);
            }
        }
        for (int m = 0; m < array.length;m++){
            for (int n =0;n< array[m].length;n++){
                System.out.print(array[m][n] + "\t");
            }
            System.out.print("\n");
        }
        for (int e =0; e < array.length;e++){
            for (int f =0; f < array[e].length;f++){
                if (array[e][f]>max){
                    max = array[e][f];
                }
            }
        }
        System.out.println("Max of Array is: " + max);
    }
}
