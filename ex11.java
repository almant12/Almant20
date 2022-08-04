import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        /*System.out.print("Vendos n: ");

        int n = sk.nextInt();*/

        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

