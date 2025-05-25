package Strategy;


import Strategy.Calator;
import Strategy.CardCalatorie;
import Strategy.IMetodaPlata;
import Strategy.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new CardCalatorie(2);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Maria");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);
    }
}