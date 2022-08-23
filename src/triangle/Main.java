package triangle;

public class Main {
    public static void main(String [] args){
        triangle t = new triangle(3,6,7);
        t.getSemiPerimeter();
        System.out.println(t.semiPerimeter);
        System.out.println(t.getArea());
    }
}
