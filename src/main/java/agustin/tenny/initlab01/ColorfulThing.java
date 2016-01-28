package agustin.tenny.initlab01;

/**
 * Created by Tenny on 1/27/16.
 */

enum Color {
    CAFEMOCHA, ORANGINA, MOUNTAINDEWGREEN
}
public class ColorfulThing {

    Color color; //instance variable

    //constructor is public even without "public" because it defaults to the class it is in
    public ColorfulThing(Color color) {
        this.color = color;

    }

    public Color getColor() {
        return color;
    }
}

//Test-driven way to approach class:
