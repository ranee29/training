package exercism;

import java.util.Scanner;

public class Scrabble {
    String word;
    Scrabble(String word){
        this.word = word.toUpperCase();
    }
    int getScore() {
        int score = 0;
        char[] arrayWord = this.word.toCharArray();
        for (int a = 0; a< arrayWord.length;a++){
            score += getValueLetter(arrayWord[a]);
        }
        return score;
    }
    int getValueLetter(char letter){
        switch (letter){
            case 'G':
            case 'D': return 2;
            case 'B':
            case 'C':
            case 'M':
            case 'P': return 3;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y': return 4;
            case 'K': return 5;
            case 'J':
            case 'X': return 8;
            case 'Q':
            case 'Z': return 10;
            default: return 1;
        }
    }
    public static  void main(String [] args){
        Scrabble s = new Scrabble("Cabbage");
        System.out.println(s.getScore());
    }
}
