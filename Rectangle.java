// George Williamson, ID: 201904754

public class Rectangle {

    Interval x;
    Interval y;

    public Rectangle(Interval x_int, Interval y_int){
       x = x_int;
       y = y_int;
    }

    //gets area of rectangle
    public double area(){
        double width = x.length();
        double length = y.length();

        return width*length;
    }

    //gets the perimeter of rectangle
    public double perimeter(){

        double base = x.length();
        double height = y.length();

        return base*2 + height*2;
    }

    //does the rectangle object given as argument intersect with the one calling this method
    public boolean intersects(Rectangle b){

        //if(B to the left of A || B to the right of A || B below A || B above A)

        if(b.x.z <= x.a || b.x.a >= x.z || b.y.a + b.y.length() <= y.a || b.y.a >= y.a + y.length()){
            return false;
        }else{
            return true;
        }
    }

    //is the rectangle object given as argument contained with the one calling this method
    public boolean contains(Rectangle b){

        if(b.x.a + b.x.length() <= x.z && b.x.a >= x.a && b.y.a >= y.a &&
                b.y.a + b.y.length() <= y.a + y.length()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        //please give inputs with left smaller than right
        // or you will receive an error message
        Interval x1 = new Interval(0.0, 20.0);
        Interval y1 = new Interval(0.0, 20.0);

        Interval x2 = new Interval(0.0, 10.0);
        Interval y2 = new Interval(0.0, 10.0);

        Rectangle A = new Rectangle(x1, y1);
        Rectangle B = new Rectangle(x2, y2);

        System.out.println("Rectangle A: \n" +
                            "Area: \t" + A.area() + "\n" +
                            "Perimeter: \t" + A.perimeter() +"\n\n" +

                            "Rectangle B: \n" +
                            "Area: \t" + B.area() + "\n" +
                            "Perimeter: \t" + B.perimeter() + "\n\n" +

                            "Do A and B intersect? \t" + A.intersects(B) + "\n" +
                            "Does A contain B?\t" + A.contains(B));
    }
}
