public class ex2 {
    public static void main(String[] args) {
        Integer[] input = {2,2,4};
        Integer[] output = new Integer[2];
        Integer  target = 6;
        for(int i = 0; i<input.length; i++){
            for(int j = i+1; j<input.length; j++){


                if((input[i] + input[j] )== target){
                    output[0] = i;
                    output[1] = j;

                    break;
                }
                System.out.println(input[j]);
            }

        }

        System.out.println(output[0] + " : " + output[1]);
    }
}
