package sprint1.Harry.MedI;

public class Main {
}
/*
Extrauppgift: Hederlige Harrys Bilar (med interfaces)
• Istället för att GetAnnonsText ärvs från super-annons-klassen, skapa ett interface, Publishable,
som annonsklasserna får implementera
• Publishable innehåller 2 metoder:
• PrintHeader (ska printa rubrik och pris, typ: ”Fantastisk husbil, 25000 kr”)
• PrintCompleteAd (ska printa all info för en annons)
• (vi tänker oss att PrintHeader är den metod som anropas när vi vill lista alla fordon på
Hederlige Harrys hemsida, PrintCompleteAd är den som anropas när en användare har
klickat på en annons-header)
• Lägg till ytterligare ett interface, Revenuable, som innehåller en metod calcuateRevenue som
räknar ut hur mycket Harry kan tjäna på en annons (förutsatt att nån köper). Vi måste dra av
25% av alla priser pga moms och sen är det dessutom 10% rea på motorcyklar.
 */