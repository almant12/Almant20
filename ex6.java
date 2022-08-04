public class ex6 {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4};
        Integer[] output = new Integer[input.length];

        Integer sum = 0;
        for (int i = 0; i < input.length;i++){
            sum+= input[i];
            output[i] = sum;
        }
        for (Integer s : output){
            System.out.println(s);
        }

    }
}
