package sprint4.uppg14;

import java.awt.*;

public class PropConverter {


    public Color setColorFromString(String input) {
        Color color = Color.WHITE;
        switch (input.toLowerCase().trim()) {
            case "black" -> color = Color.BLACK;
            case "blue" -> color = Color.BLUE;
            case "cyan" -> color = Color.cyan;
            case "darkgray" -> color = Color.darkGray;
            case "gray" -> color = Color.gray;
            case "green" -> color = Color.green;
            case "lightgray" -> color = Color.lightGray;
            case "magenta" -> color = Color.magenta;
            case "orange" -> color = Color.orange;
            case "pink" -> color = Color.pink;
            case "red" -> color = Color.red;
            case "yellow" -> color = Color.yellow;
        }
        return color;
    }

    public int setFontStyleFromString(String input) {
        int fontStyle = Font.PLAIN;
        if (input.equalsIgnoreCase("bold")) {
            fontStyle = Font.BOLD;
        } else if (input.equalsIgnoreCase("italic")) {
            fontStyle = Font.ITALIC;
        }
        return fontStyle;
    }


}
