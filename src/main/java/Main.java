import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Jewelry ring = new Jewelry("wedding band", 1000);

        House mansion = new House("Utsav's palace",100000.00,2019,1890,6);

        CreditCard appleCard = new CreditCard();

        appleCard.charge(2500);

        BankAccount myAccount = new BankAccount("Checking", "CBN2924",100_000_000);

        List<Valuable> allMyValuables = new ArrayList<>();

        allMyValuables.add(ring);
        allMyValuables.add(mansion);
        allMyValuables.add(appleCard);
        allMyValuables.add(myAccount);

        double networth = 0;
        for(Valuable u : allMyValuables){
            networth += u.getValue();
        }

        System.out.println("The networth is $" + networth);
    }
}
