package agustin.tenny.initlab01;

/**
 * Created by Tenny on 1/27/16.
 */
public class ColorfulThing {

    String color; //instance variable

    //constructor is public even without "public" because it defaults to the class it i
    public ColorfulThing(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;

    }
}

//Test-driven way to approach class:
