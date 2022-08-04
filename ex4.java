import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("vendos piket e provimit e provimit");
        int notat = scanner.nextInt();
       if (100 > notat && notat >90){
           System.out.println("10");
       }
       if (89 > notat && notat > 80){
           System.out.println("9");
       }
    }

}
