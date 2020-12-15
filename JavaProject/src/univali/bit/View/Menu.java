package univali.bit.View;

import java.util.Scanner;

public class Menu {
    private String input;

    public void show(){
        System.out.println("what do you want to do?");
        System.out.println("A) New Game");
        System.out.println("B) Exit");
        System.out.println("-> ");
        Scanner reader = new Scanner(System.in);
        input = reader.nextLine().toUpperCase();
    }

    public String getInput() {
        return input;
    }
}
