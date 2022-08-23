package exercism;

public class BlackJack {
    public int parseCard(String card) {
        switch (card){
            case "ace":
                return 11;
            case "jack":
            case "queen":
            case "king":
            case "ten":
                return 10;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        switch (card1){
            case "ace":
                switch (card2){
                    case "queen":
                    case "king":
                    case "jack":
                    case "ten":
                        return true;
                }
        }
        switch (card2){
            case "ace":
                switch (card1){
                    case "queen":
                    case "king":
                    case "jack":
                    case "ten":
                        return true;
                }
        }
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack == true){
            switch (dealerScore){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return "W";
                default:
                    return "S";
            }
        }
        else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >=17){
            return "S";
        }
        else if(handScore >= 12 && handScore <=16){
            if(dealerScore <7){
                return "S";
            }else {
                return "H";
            }
        }
        else {
            return "H";
        }
    }

}
