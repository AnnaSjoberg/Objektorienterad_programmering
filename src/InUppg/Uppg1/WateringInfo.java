package InUppg.Uppg1;
//Om jag vill att alla ska implementera är det bättre att implementera i superklassen.
//Blir bäst om jag vill göra List där jag använder interfacet.
//Om jag däremot vill att det ska vara att man använder en formel för att räkna ut vattnet
//så är det mest logiskt att den bara används för plamer och köttätande, men då måste jag använda Lista på annat sätt
public interface WateringInfo {//Denna ifall jag vill kunna göra Listan på interfacet
    String name();
    double amountToGive();
    String printOut();
}
