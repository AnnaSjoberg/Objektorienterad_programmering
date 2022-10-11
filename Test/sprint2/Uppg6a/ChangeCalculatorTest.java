package sprint2.Uppg6a;

import org.junit.jupiter.api.Test;

public class ChangeCalculatorTest {
    ChangeCalculator cc = new ChangeCalculator(137,1000);
    @Test
    public void calculateReturnMoneyTest() {

        assert (cc.calculateReturnMoney(price, moneyPaid) == 863);
        assert (cc.calculateReturnMoney(price, moneyPaid) != 500);
    }

    @Test
    public void getListOfChangeTest() {
        assert (cc.getListOfChange().size()==7);
        assert (cc.getListOfChange().size()!=3);
        assert (cc.getListOfChange().get(0)==500);
        assert (cc.getListOfChange().get(1)==200);
        assert (cc.getListOfChange().get(2)==100);
        assert (cc.getListOfChange().get(3)==50);
        assert (cc.getListOfChange().get(4)==10);
        assert (cc.getListOfChange().get(5)==2);
        assert (cc.getListOfChange().get(6)==1);
        assert (cc.getListOfChange().get(0)!=50);
    }
}

/*
Ledtrådar:
Innan du sätter igång, fundera över vad som måste hända:
• Du måste räkna ut växeln (utifrån pris och lämnade pengar)
• Du måste hålla reda på vilka valörer som finns
• Rekommendation är att lägga dessa värden i en lista som du itererar över när du räknar ut
hur mycket av varje valör som ska ges tillbaka
• Du måste räkna ut hur många enheter av en valör som ska ges i växeln
• När du har räknat ut hur många antal (y) av valör x som ska ges i växel måste du subtrahera
dessa från växeln inför nästa iteration Ex: antag att växeln är 654, då ska du ge 6st 100-
lappar, sen måste du dra av 600 innan du räknar ut hur många 50-lappar som ska ges

Beräkna hur många 1000-lappar, 500-lappar, 200-lappar, 100-lappar, 50-lappar, 20-lappar, 10-kronor,
5-kronor, 2-kronor och enkronor man ska få tillbaka utifrån, av användaren, givna belopp.
Växeln ska alltid innehålla så mycket som möjligt av högsta möjliga valörer



Alla dessa punkter lämpar sig väl för att skriva enhetstester på!!!
 */