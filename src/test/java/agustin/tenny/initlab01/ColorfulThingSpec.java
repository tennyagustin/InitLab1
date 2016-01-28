package agustin.tenny.initlab01;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tenny on 1/27/16.
 */
public class ColorfulThingSpec {
    @Test
    public void getColorTest(){
        ColorfulThing myColorfulThing = new ColorfulThing(Color.CAFEMOCHA); //send string into it to test
        String result = myColorfulThing.getColor().toString();
        assertEquals("test color","CAFEMOCHA", result);  //put in error message, what you are expecting, and method with new object
    }
}
