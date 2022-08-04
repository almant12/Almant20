public class ex16 {
    public static void main(String[] args) {
     int output =    mesatarja(new int[]{9,9,9,9,9,9,9,9,9});
        System.out.println(output);
    }

    public static int mesatarja(int[] num){
        int rezult = 0;
        for (int i = 0; i < num.length;i++){
            rezult += num[i];
        }
        rezult = rezult / num.length;
        return rezult;
    }
}
