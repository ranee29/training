package Animals;

public class Dog {
    String name;
    Dog(String name){
        this.name = name;
    }
    @Override
    public  void finalize(){
        System.out.println("Animals Dog");
    }
}
