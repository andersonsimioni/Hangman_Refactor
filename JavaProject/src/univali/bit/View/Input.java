package univali.bit.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private String input;
    private List<String> PlayedLetters;

    private boolean isValidInput(){
        if(input == null || input.isEmpty()){
            System.out.println("invalid input!");
            return false;
        }

        if(PlayedLetters != null && PlayedLetters.contains(input)){
            System.out.println("letter already played");
            return false;
        }

        return true;
    }

    public void read(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter letter or word ->");
        input = reader.nextLine().toUpperCase();

        while (isValidInput() == false){
            System.out.println("please insert valid value: ");
            input = reader.nextLine().toUpperCase();
        }
    }

    public void addRangePlayedLetters(List<String> playedLetters) {
        if(PlayedLetters == null)
            PlayedLetters = new ArrayList<String>();

        for (String s:playedLetters)
            if(PlayedLetters.contains(s) == false)
                PlayedLetters.add(s);
    }

    public String getInput() {
        return input;
    }
}
