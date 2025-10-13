package com.example.AdivinaMiNumero.app;

import com.example.AdivinaMiNumero.domain.model.Game;
import com.example.AdivinaMiNumero.domain.model.Player;
import org.springframework.stereotype.Component;

@Component
public class GuessNumberUseCase {
    private Game game;
    private Player player;
    private String answer;

    public String tellRules() {
        Game g = new Game();
        return g.tellRules();
    }

    public String startGame (String playerName){
        player = new Player();
        player.setPlayerName(playerName);

        game = new Game();
        game.startGame();

        return "¡Hola " + playerName + "! He pensado un número entre " + game.getMin() + " y " + game.getMax() +
                ".¡Adivínalo!";

    }

    public String makeGuess(int number){
        player.setGuessNumber(number);

        if (number == game.getSecretNumber()){
            game.setFinished(true);
            answer = "¡¡¡Lo has conseguido!!! El número era " + game.getSecretNumber();
        } else if (number < game.getSecretNumber()){
            answer = "Estás cerca, pero el número es mayor...";
        } else {
            answer = "Estás cerca, pero el número es menor...";
        }
        return answer;
    }

}
