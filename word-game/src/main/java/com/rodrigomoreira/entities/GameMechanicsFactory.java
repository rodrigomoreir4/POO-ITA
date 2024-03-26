package com.rodrigomoreira.entities;

public class GameMechanicsFactory {
    
    public static GameMechanics createGameMechanics(WordBank bank, boolean mechanics){
        Scrambler scrambler = ScramblerFactory.createScrambler();     
        if (mechanics){
            return new AlteredMechanics(bank, scrambler);
        }
        return new SimpleMechanics(bank, scrambler);
    }
    
}
