package exercism;

public class ElonsToyCar {

    private static int bat = 100;
    private static int distanceTravel ;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceTravel);
    }

    public String batteryDisplay() {
        if(bat == 0){
            return "Battery empty";
        }
        return String.format("Battery at %d%%", bat);
    }

    public void drive() {
        if(bat !=0){
            bat-=1;
            distanceTravel+=20;
        }
    }
    public static void main(String [] args){
        ElonsToyCar car1 = ElonsToyCar.buy();
        ElonsToyCar car2 = ElonsToyCar.buy();
        for (int i = 0 ; i <50; i++){
            car2.drive();
        }

        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());
        System.out.println(car2.distanceDisplay());
        System.out.println(car2.batteryDisplay());

//        ElonsToyCar car = new ElonsToyCar();
//        car.drive();
//        System.out.println(car.distanceDisplay());
//        System.out.println(car.batteryDisplay());

    }
}
