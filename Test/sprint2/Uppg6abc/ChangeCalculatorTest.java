package sprint2.Uppg6abc;

import org.junit.jupiter.api.Test;

public class ChangeCalculatorTest {
    ChangeCalculator cc = new ChangeCalculator(364,10000);
    @Test
    public void calculateReturnMoneyTest() {

        assert (cc.getReturnAmount() == 9636);
        assert (cc.getReturnAmount() != 500);
    }

    @Test
    public void getListOfChangeTest() {
        System.out.println(cc.getListOfChange().get(5));
        assert (cc.getListOfChange().size()==15);
        assert (cc.getListOfChange().size()!=3);
        assert (cc.getListOfChange().get(0)==1000);
        assert (cc.getListOfChange().get(5)==1000);
        assert (cc.getListOfChange().get(8)==1000);
        assert (cc.getListOfChange().get(9)==500);
        assert (cc.getListOfChange().get(10)==100);
        assert (cc.getListOfChange().get(11)==20);
        assert (cc.getListOfChange().get(12)==10);
        assert (cc.getListOfChange().get(13)==5);
        assert (cc.getListOfChange().get(14)==1);
        assert (cc.getListOfChange().get(0)!=50);
    }

    @Test
    void getEachUnitToStringTest() {
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(0)).equals("\nAntal 1-kronor: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(1)).equals("\nAntal 2-kronor: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(2)).equals("\nAntal 5-kronor: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(3)).equals("\nAntal 10-kronor: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(4)).equals("\nAntal 20-lappar: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(5)).equals("\nAntal 50-lappar: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(6)).equals("\nAntal 100-lappar: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(7)).equals("\nAntal 200-lappar: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(8)).equals("\nAntal 500-lappar: "));
        assert (cc.getEachUnitToString(cc.currencyUnitsList.get(9)).equals("\nAntal 1000-lappar: "));
    }
}

/*
Ledtr??dar:
Innan du s??tter ig??ng, fundera ??ver vad som m??ste h??nda:
??? Du m??ste r??kna ut v??xeln (utifr??n pris och l??mnade pengar)
??? Du m??ste h??lla reda p?? vilka val??rer som finns
??? Rekommendation ??r att l??gga dessa v??rden i en lista som du itererar ??ver n??r du r??knar ut
hur mycket av varje val??r som ska ges tillbaka
??? Du m??ste r??kna ut hur m??nga enheter av en val??r som ska ges i v??xeln
??? N??r du har r??knat ut hur m??nga antal (y) av val??r x som ska ges i v??xel m??ste du subtrahera
dessa fr??n v??xeln inf??r n??sta iteration Ex: antag att v??xeln ??r 654, d?? ska du ge 6st 100-
lappar, sen m??ste du dra av 600 innan du r??knar ut hur m??nga 50-lappar som ska ges

Ber??kna hur m??nga 1000-lappar, 500-lappar, 200-lappar, 100-lappar, 50-lappar, 20-lappar, 10-kronor,
5-kronor, 2-kronor och enkronor man ska f?? tillbaka utifr??n, av anv??ndaren, givna belopp.
V??xeln ska alltid inneh??lla s?? mycket som m??jligt av h??gsta m??jliga val??rer



Alla dessa punkter l??mpar sig v??l f??r att skriva enhetstester p??!!!
 */