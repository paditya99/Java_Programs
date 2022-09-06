class Shape{
    double height;
    double width;
    double side;

    Shape(double a,double b){
        height=a;
        width=b;
    }
    Shape(double s){
        side=s;
    }
}

class Rectangle extends Shape{
    
    Rectangle(double a,double b){
        super(a,b);
    }

    double areaOfRect(){
        return height*width;
    }
}

class Square extends Shape{
   

    Square(double s){
        super(s);  
    }
    double areaOfSquare(){
        return side*side;
    }

}

public class ShapeProg {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(5, 4);
        double ans=rec.areaOfRect();
        System.out.println("Area of rectangle: "+ ans);
        Square sqr=new Square(5);
        double ans2=sqr.areaOfSquare();
        System.out.println("Area of Square: "+ans2);
    }
}
