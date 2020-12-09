import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import univali.bit.View.Doll;


public class TestDoll {
    @Test
    public void testEmptyDoll()
    {
        Doll doll = new Doll();
        String assertDoll = "+=====+" +
                "\n||    |"+
                "\n||    " + " "+
                "\n||   " +
                 " "+
                " "+
                " "+
                "\n||   "+
                " "+
                " "+
                "\n------------\n";

        assertEquals(assertDoll, doll.render());
    }

    @Test
    public void testFullDoll()
    {
        Doll doll = new Doll();
        doll.setWrongErrors(6);
        String assertDoll = "+=====+" +
                "\n||    |"+
                "\n||    " + "o" +
                "\n||   " +
                "/"+
                "|"+
                "\\"+
                "\n||   "+
                "/"+
                " \\"+
                "\n------------\n";

        assertEquals(assertDoll, doll.render());
    }
}
