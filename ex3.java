import java.util.LinkedList;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList1 = new LinkedList<>();
        integerLinkedList1.add(2);
        integerLinkedList1.add(4);
        integerLinkedList1.add(3);

        LinkedList<Integer> integerLinkedList2 = new LinkedList<>();
        integerLinkedList2.add(5);
        integerLinkedList2.add(6);
        integerLinkedList2.add(4);

        int sum1 = 0;
        int sum2 = 0;

        int faktor = 1;

        for(int i = 0; i<integerLinkedList1.size(); i++){
            sum1 += integerLinkedList1.get(i)*faktor;
            faktor=faktor*10;
        }

        faktor=1;

        for(int i = 0; i<integerLinkedList2.size(); i++){
            sum2 += integerLinkedList2.get(i)*faktor;
            faktor=faktor*10;
        }

        int sum = sum1 + sum2;

        System.out.println(sum);

    }

}
