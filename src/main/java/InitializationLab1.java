import agustin.tenny.initlab01.BoringThing;
import agustin.tenny.initlab01.ColorfulThing;

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

        ColorfulThing colorfulThing1 = new ColorfulThing("blue");
        ColorfulThing colorfulThing2 = new ColorfulThing("blue");
        ColorfulThing colorfulThing3 = new ColorfulThing("blue");
        ColorfulThing colorfulThing4 = new ColorfulThing("blue");
        ColorfulThing colorfulThing5 = new ColorfulThing("blue");

        System.out.println(colorfulThing1.getColor());
    }

}
