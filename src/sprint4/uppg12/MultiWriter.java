package sprint4.uppg12;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MultiWriter {

    private List<PrintWriter> allWriters = new ArrayList<>();

    public synchronized List<PrintWriter> getAllWriters() {
        return allWriters;
    }

    public synchronized void addWriterToList(PrintWriter pw){
        allWriters.add(pw);
    }
    public synchronized void removeWriterFromList(PrintWriter pw){
        allWriters.remove(pw);
    }
}
