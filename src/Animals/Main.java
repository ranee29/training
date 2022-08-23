package Animals;

public class Main {
    public static void main(String []args){
        Dog d1 = new Dog("1");
        d1 = null;
        Dog d2 = new Dog("2");
        Dog d3 = new Dog("3");
        d2 = d3;
        new Dog("4");

        System.gc();
    }
}
