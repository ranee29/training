package exercism;

public class Darts {
    private double x,y;
    Darts(double x, double y) {
        this.x= x;
        this.y = y;
    }

    int score() {
       double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
       if(distance<=1){
            return 10;
       }
       else if (distance<=5){
           return 5;
       }else if (distance<=10){
           return 1;
       }else {
           return 0;
       }
    }
    public static void main(String []args){
        Darts darts = new Darts(1,1);
        System.out.println(darts.score());
    }
}
