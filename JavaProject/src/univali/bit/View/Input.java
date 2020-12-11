package univali.bit.View;

import java.util.Scanner;

public class Input {
    private String input;

    private boolean isValidInput(){
        if(input == null || input.isEmpty())
            return false;

        return true;
    }

    public void read(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter letter or word ->");
        input = reader.nextLine();

        while (isValidInput() == false){
            System.out.println("Invalid input, please insert valid: ");
            input = reader.nextLine();
        }

        this.input = input.toUpperCase();
    }

    public String getInput() {
        return input;
    }
}
