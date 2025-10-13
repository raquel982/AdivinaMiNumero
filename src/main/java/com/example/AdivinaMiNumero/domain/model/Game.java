package com.example.AdivinaMiNumero.domain.model;

import lombok.Data;

@Data
public class Game {
    private int min = 1;
    private int max = 5;
    private int secretNumber;
    private Boolean finished = false;

    public String tellRules() {
        return "🎮 REGLAS DE ADIVINA MI NÚMERO\n" +
                "1️⃣ Escribe tu nombre para comenzar.\n" +
                "2️⃣ Intenta adivinar el número entre " + min + " y " + max + ".\n" +
                "3️⃣ Te diré si mi número es mayor o menor que el tuyo.\n" +
                "¿Te atreves?";
    }


    public void startGame() {
        this.secretNumber = (int) (Math.random() * (max - min + 1)) + min;
        this.finished = false;
    }
}
