package univali.bit.View;

public class Doll {
    private int wrongErrors = 0;

    public void setWrongErrors(int wrongErrors) {
        this.wrongErrors = wrongErrors;
    }

    public String render(){
        boolean head = this.wrongErrors >= 1;
        boolean body = this.wrongErrors >= 2;
        boolean leftArm = this.wrongErrors >= 3;
        boolean rightArm = this.wrongErrors >= 4;
        boolean leftLeg = this.wrongErrors >= 5;
        boolean rightLeg = this.wrongErrors >= 6;

        return "+=====+" +
                "\n||    |"+
                "\n||    " + (head ? "o" : " ")+
                "\n||   " +
                (leftArm ? "/" : " ")+
                (body ? "|" : " ")+
                (rightArm ? "\\" : " ")+
                "\n||   "+
                (leftLeg ? "/" : " ")+
                (rightLeg ? " \\" : " ")+
                "\n------------\n";
    }
}
