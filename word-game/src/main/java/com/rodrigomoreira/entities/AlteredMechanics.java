package com.rodrigomoreira.entities;

public class AlteredMechanics implements GameMechanics{

    private static final int numberOfWords = 10;
    private int wordsCounter = 0;
    private int score = 0;

    private WordBank bank;
    private Scrambler scrambler;
    private String currentWord;

    public AlteredMechanics(WordBank bank, Scrambler scrambler) {
        this.bank = bank;
        this.scrambler = scrambler;
    }

    @Override
    public boolean gameOver() {
        wordsCounter++;
        if (wordsCounter <= numberOfWords && score >= 0){
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public void correctWord(String word, String attempt) {
        if (currentWord.equalsIgnoreCase(attempt)){
            score++;
        } else {
            score--;
        }
    }

    @Override
    public int calculateScore(){
        return score;
    }

    @Override
    public String currentWord() {
        return currentWord;
    }

    @Override
    public String scramblerWord(){
        currentWord = bank.getRandomWord();
        return scrambler.shuffle(currentWord);
    }

}
