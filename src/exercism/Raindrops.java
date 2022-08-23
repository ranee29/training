package exercism;

import java.util.ArrayList;
import java.util.List;


public class Raindrops {
    String convert(int number) {
        ArrayList<Integer> factor = new ArrayList<Integer>();

        for(int a = 1; a<=number; a++){
            if(number % a == 0){
                factor.add(a);
            }
        }

        if(factor.contains(3) || factor.contains(5) || factor.contains(7)){
            String result= "";
            for (Integer f: factor) {

                if(f == 3){
                     result+="Pling";
                }
                if(f == 5){
                     result += "Plang";
                }
                if(f == 7){
                     result += "Plong";
                }

            }
            return result;
        }
        return String.valueOf(number);
    }
    public static void main(String []args){
        Raindrops r = new Raindrops();
        System.out.println(r.convert(30));
    }
}
