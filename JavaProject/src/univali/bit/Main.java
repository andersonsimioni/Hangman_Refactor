package univali.bit;

import univali.bit.View.Doll;

public class Main {
    public static void main(String[] args) {
        univali.bit.View.Doll doll = new Doll();
        doll.setWrongErrors(3);
        doll.Execute();
    }
}
