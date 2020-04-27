public class MinElementArray {
    public static void main(String[] args) {
        int[] array = {9,3,5,49,6,2};
        System.out.println("The smallest element in the array is: "+ minArr(array));

    }
    public static int minArr(int[] array){
        int min = array[0];
        for (int i = 0; i< array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
