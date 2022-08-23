package exercism;

public class CarAssemble {
    public double speed_rate(int speed){
        if(1 <= speed && speed <= 4) {return 1.0;}
        if(5 <= speed && speed <= 8) {return 0.9;}
        if( 9 == speed) {return 0.8;}
        if(10 == speed) {return 0.77;}
        return speed;
    }
    public double productionRatePerHour(int speed) {
        int number_of_item_per_hour = 221;
        return number_of_item_per_hour * speed * speed_rate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}
