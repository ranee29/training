package exercism;
import java.math.BigInteger;
public class Grains {
    BigInteger bigInteger = new BigInteger("2");
    BigInteger grainsOnSquare(final int square) {
        if( square <= 0 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        return bigInteger.pow(square - 1);
    }
    BigInteger grainsOnBoard() {
        BigInteger total = new BigInteger("0");
        for (int i = 1; i <= 64; i++){
            total = total.add(grainsOnSquare(i));
        }
        return total;
    }
    public static void main(String[]args){
        BigInteger.valueOf(2).pow(64-1);
        Grains grains = new Grains();
        System.out.println(grains.grainsOnBoard());
        System.out.println(grains.grainsOnSquare(12));
        System.out.println(BigInteger.valueOf(2).pow(64-1));
        System.out.println(BigInteger.ONE.shiftLeft(64));
    }
}
