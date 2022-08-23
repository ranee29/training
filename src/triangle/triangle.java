package triangle;

public class triangle {
    float a,b,c, semiPerimeter;
    public triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getSemiPerimeter(){
        this.semiPerimeter = (a+b+c)/2;
        return  this.semiPerimeter;
    }

    public float getArea(){
        return (float) Math.sqrt(this.semiPerimeter*(this.semiPerimeter-a)*(this.semiPerimeter - b)*(this.semiPerimeter - c));
    }

}
