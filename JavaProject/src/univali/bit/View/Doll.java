package univali.bit.View;

import univali.bit.Command;

public class Doll extends Command {
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

    @Override
    public void Execute(){
        boolean head = this.wrongErrors >= 1;
        boolean body = this.wrongErrors >= 2;
        boolean leftArm = this.wrongErrors >= 3;
        boolean rightArm = this.wrongErrors >= 4;
        boolean leftLeg = this.wrongErrors >= 5;
        boolean rightLeg = this.wrongErrors >= 6;

        String doll = "+=====+" +
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

        System.out.println(doll);
    }
}
