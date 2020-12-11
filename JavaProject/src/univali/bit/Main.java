package univali.bit;

import univali.bit.Controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        GameController.gameLoop();
    }
}
