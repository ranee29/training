package StaticMethod;

public class Main {
    public static void main(String []args){
        int[] array = {5,10,12,23,15};
        int sum = StaticNonstatic.staticAverageArray(array);
        System.out.println(sum);

        StaticNonstatic nonStatic = new StaticNonstatic();
        sum = nonStatic.averageArray(array);
        System.out.println(sum);
    }
}
