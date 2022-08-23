package StaticMethod;

public class StaticNonstatic {
    public static int staticAverageArray(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum +=array[i];

        }

        return sum/array.length;
    }
    public int averageArray(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum +=array[i];

        }
        return sum/array.length;
    }
}
