package exercism;

public class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        int sumOfSquare = 0;
        for(int i = 1; i <=input;i++){
            sumOfSquare +=i;
        }
        return (int) Math.pow(sumOfSquare,2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare = 0;
        for(int i = 1; i <=input;i++){
            sumOfSquare +=Math.pow(i,2);
        }
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
    public static void main(String [] args){
        DifferenceOfSquaresCalculator d = new DifferenceOfSquaresCalculator();
        System.out.println(d.computeSquareOfSumTo(10));
        System.out.println(d.computeSumOfSquaresTo(10));
        System.out.println(d.computeDifferenceOfSquares(10));
    }
}
