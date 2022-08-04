package ATM1;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        AtmService atmService = new AtmImp();
        Scanner scanner = new Scanner(System.in);
        int email = 123456;
        int pass = 123;

        System.out.println("vendos  emailin");
        int atmnumber = scanner.nextInt();
        System.out.println("vendos pass");
        int atmpass = scanner.nextInt();
        if ((email== atmnumber)&&(pass == atmpass)){
            while (true){
                System.out.println("1 view Balance \n 2 depositeAmount \n 3 withdrawAmount");
                System.out.println("Enter choise");
                int ch = scanner.nextInt();
                if (ch == 1){
                    atmService.viewBalance();
                }
                if (ch == 2){
                    System.out.println("vendos leket qe do te debozitosh");
                    double depositeAmount = scanner.nextDouble();
                    atmService.depositeAmount(depositeAmount);

                }
                if (ch == 3){
                    System.out.println("vendos shume qe do te terheqesh");
                    int withdrawAmount = scanner.nextInt();
                    atmService.withdrawAmount(withdrawAmount);
                }
            }
        }else {
            System.out.println("emaili ose passwordi qe i pasakt");
            System.exit(0);
        }

    }
}
