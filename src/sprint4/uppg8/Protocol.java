package sprint4.uppg8;

public class Protocol {
    private final int STARTUP = 0;
    private final int LOOPING = 1;
    private int state = STARTUP;

    private Database db = new Database();
    private Buddy soughtAfter;

    public Object processInput(String input) {
        if (state == STARTUP){
            state= LOOPING;
            return (new Introduction());
        }else if (state == LOOPING){

            soughtAfter= db.getBuddy(input.trim());

            if (soughtAfter == null){
                return (new Response(false));
            }else {
                return (new Response(true,soughtAfter));
            }
        }
        return null;
    }

}
/*
Bryt ut program-logiken till en ny protokoll-klass som håller reda på de states som applikationen
befinner sig i, och genererar korrekta objekt att skicka till klienten, beroende på state


• Låt server-klassen bara ha hand om sändande och mottagande
• De mottagna objekten från klienten skickas till Protokoll-klassen, som returnerar ett
lämpligt Objekt att skicka till klienten
 */