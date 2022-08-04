public class ex12 {

    public static int calculate(int x){
        int output = 0;
        int constant = 100;
        while (x > 0){
            output += (x%10)*constant;
            constant = constant/10;
            x = x/10;
        }

        return output;
    }

    public static int outputs(int x){

        if(x<0){
            return calculate(x*(-1))*(-1);
        }else{
            return calculate(x);
        }

    }
    public static void main(String[] args) {

        System.out.println(outputs(-123));
    }
}
