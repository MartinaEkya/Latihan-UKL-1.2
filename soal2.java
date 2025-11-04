import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1;

        System.out.print("input bilangan : ");
        bilangan1 = input.nextInt();

        if (bilangan1 == 0) {
            System.out.println("Input bilangan nol");
        } else if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan genap");
            System.out.println("bilangan ini dapat dibagi 2");
        } else {
            System.out.println("Bilangan ganjil");
            System.out.println("bilangan ini tidak dapat dibagi 2");
            System.out.println("karena hasil bagi = sisa 1");
        }

        input.close();
    }
}
