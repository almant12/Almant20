import java.util.LinkedList;

public class ex7 {

    public static Integer sumOfLinkedListNumbers(LinkedList<Integer> integerLinkedList){
        Integer sum = 0;
        int con = 1;

        for(Integer i:integerLinkedList){
            sum += (i * con);
            con = con*10;
        }
        return sum;
    }

    public static LinkedList<Integer> output(Integer nr1, Integer nr2){

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Integer sum = nr1 + nr2;

        while (sum > 0) {
            integerLinkedList.push( sum % 10 );
            sum = sum / 10;
        }

        return  integerLinkedList;
    }
    public static void main(String[] args)  {
        LinkedList<Integer> integerLinkedList1 = new LinkedList<>();
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);
        integerLinkedList1.add(9);

        LinkedList<Integer> integerLinkedList2 = new LinkedList<>();
        integerLinkedList2.add(9);
        integerLinkedList2.add(9);
        integerLinkedList2.add(9);
        integerLinkedList2.add(9);

        System.out.println(output(sumOfLinkedListNumbers(integerLinkedList1), sumOfLinkedListNumbers(integerLinkedList2)));
    }
}