package classes;

public class methodsAndConstructor {
    public static void main(String[] args){
        int a= 10, b=a;

        maths obj = new maths(20,30);
        car carObj = new car();

        carObj.objParamExample(obj);

        System.out.println(carObj.objReturnExample().addition());

        int binary = 68<<1;
        System.out.println(Integer.toBinaryString(binary)+" "+binary);
    }
}
