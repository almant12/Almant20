import java.util.Random;

public class ex15 {
    public static int[] sorted(int length,int[] arrNum){
        for (int i = 0;i < length -1;i++){
            for (int j = 0; j<length -1 - i;j++){

                if (arrNum[j+1] > arrNum[j]){
                    int swap = arrNum[j];
                    arrNum[j] = arrNum[j+1];
                    arrNum[j+1] = swap;
                }
            }
        }
        return arrNum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] num1 = new int[10];
        for (int i= 0; i< num1.length;i++){
            num1[i] = random.nextInt(10);
        }
        int len = num1.length;

        int[] output = sorted(len,num1);
        System.out.println(output);
    }
}
