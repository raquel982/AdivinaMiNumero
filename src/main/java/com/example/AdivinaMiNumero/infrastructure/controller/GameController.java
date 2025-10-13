package com.example.AdivinaMiNumero.infrastructure.controller;

import com.example.AdivinaMiNumero.app.GuessNumberUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {

    private final GuessNumberUseCase guessNumberUseCase;

    @GetMapping("/rules")
    public String rules() {
        return guessNumberUseCase.tellRules();
    }

    @PostMapping("/start")
    public String start(@RequestParam String name) {
        return guessNumberUseCase.startGame(name);
    }

    @PostMapping("/guess")
    public String guess(@RequestParam int number) {
        return guessNumberUseCase.makeGuess(number);
    }
}
