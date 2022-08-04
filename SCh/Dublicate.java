package SCh;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class Dublicate {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("Almant");
        names.add("Ari");
        names.add("doko");
        System.out.println(names.poll().length());
        System.out.println(names);
    }

}
