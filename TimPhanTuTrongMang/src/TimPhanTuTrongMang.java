import java.util.Scanner;

public class TimPhanTuTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        String inputName ;
        System.out.print("Nhap vao ten can tim: ");
        inputName = sc.nextLine();
        boolean check = false;
        for (int i =0; i < students.length;i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the students in the list " + inputName + " is: " + (i + 1));
                check = true;
                break;
            }

        }
        if (!check){
            System.out.println("Not found " + inputName + " in the list.");
        }
    }
}
