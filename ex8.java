public class ex8 {

    public static int[] bubbleSort(int [] sort_arr, int len){

        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }


        return sort_arr;
    }

    public static double median(int[] sortedOutput){
        if (sortedOutput.length % 2 == 0) {
            return (double) (sortedOutput[sortedOutput.length/2] + sortedOutput[(sortedOutput.length/2)-1])/2;
        }else {
            return sortedOutput[(sortedOutput.length-1)/2];
        }
    }

    public static int[] mergedArray( int[] num1, int[] num2){
        int[] output = new int[num1.length+ num2.length];

        for(int i = 0; i < num1.length;i++){
            output[i] = num1[i];
        }
        for (int i = 0; i< num2.length; i++){
            output[num1.length+i] = num2[i];
        }

        return output;
    }
    public static void main(String[] args) {


        int[] num1 = {4,1};
        int[] num2 = {3,2};

        int[] output = mergedArray(num1, num2);


        System.out.println(median(bubbleSort(output, output.length)));

    }
}
