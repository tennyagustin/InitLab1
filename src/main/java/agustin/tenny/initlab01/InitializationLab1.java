package agustin.tenny.initlab01;

import agustin.tenny.initlab01.*;


import java.awt.*;

/**
 * Created by Tenny on 1/27/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();
        /*
        ColorfulThing colorfulThing1 = new ColorfulThing("blue");
        ColorfulThing colorfulThing2 = new ColorfulThing("blue");
        ColorfulThing colorfulThing3 = new ColorfulThing("blue");
        ColorfulThing colorfulThing4 = new ColorfulThing("blue");
        ColorfulThing colorfulThing5 = new ColorfulThing("blue");
        */

        ColorfulThing enumColorfulThing1 = new ColorfulThing(agustin.tenny.initlab01.Color.CAFEMOCHA);
        ColorfulThing enumColorfulThing2 = new ColorfulThing();
        ColorfulThing enumColorfulThing3 = new ColorfulThing();

        System.out.println(enumColorfulThing1.getColor());
        System.out.println(enumColorfulThing2.getColor());
        System.out.println(enumColorfulThing3.getColor());
    }

}
