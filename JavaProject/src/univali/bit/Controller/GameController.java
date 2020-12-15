package univali.bit.Controller;

import univali.bit.Command;
import univali.bit.Model.SecretWord;
import univali.bit.View.*;

public class GameController extends Command {
    private final GameStatus Status;
    private final SecretWord Word;
    private final Input Input;

    @Override
    public void Execute() {
        Menu menu = new Menu();
        menu.show();
        if(menu.getInput().equals("A")){
            this.newGame();
        } else if(menu.getInput().equals("B")){
            Thank.show();
            System.exit(0);
        }
    }

    private void newGame()
    {
        while (!Word.isEndGame()){
            Input.read();

            try {
                this.Word.kick(Input.getInput());
            } catch (IllegalArgumentException e){
                Messages.show(e.getMessage());
            }

            this.Status.setResult(this.Word.getKickResult());
            this.Status.setSecretWord(this.Word.getSecretWord());
            this.Status.setWrongKicks(this.Word.getWrongKicks());
            this.Status.setCorrectlyKicks(this.Word.getCorrectlyKicks());
            this.Status.render();
        }
    }

    public GameController(){
        this.Status = new GameStatus();
        this.Word = new SecretWord();
        this.Input = new Input();
    }
}
