package univali.bit.View;

import java.util.Scanner;

public class Input {
    private String input;

    public void read(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter letter or word ->");
        input = reader.nextLine();

        this.input = input.toUpperCase();
    }

    public String getInput() {
        return input;
    }
}
