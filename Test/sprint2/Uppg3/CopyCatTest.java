package sprint2.Uppg3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyCatTest {
    CopyCat cc = new CopyCat("Hej hej hallå");
    @Test
    public void printCopyTest(){
        assert (cc.printCopy().equals("Du skrev: Hej hej hallå"));
        assert (!cc.printCopy().equals("Du skrev: Hej då"));
    }

}