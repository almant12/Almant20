package ATM1;

import java.util.HashMap;
import java.util.Map;

public class AtmImp implements AtmService {
    Atm atm = new Atm();
    Map<Double,String> doubleStringMap = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Balanca ne llogarin tende eshte" + atm.getBalance());
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        doubleStringMap.put(depositeAmount , "shuma e depozituar");
        System.out.println(depositeAmount + "te depozituar");
        atm.setBalance(atm.getBalance() + depositeAmount);
        viewBalance();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0){
            if (withdrawAmount <= atm.getBalance()){
                doubleStringMap.put(withdrawAmount , " shuma e hequr");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }else {
                System.out.println("llogarija e pa mjaftueshme");
            }
        }else {
            System.out.println("ju lutem vendos nje numer qe eshte shumefisht me 500");
        }

    }
}
