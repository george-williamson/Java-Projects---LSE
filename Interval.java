// George Williamson, ID: 201904754

//Please give 4 command line arguments before running.
//The first pair should be the first interval, the second pair should be the other interval.
public class Interval {

    public double a;
    public double z;

    public Interval(double left, double right){
        if(right > left) {
            a = left;
            z = right;
        }else{
            System.out.println("Error: First interval argument must be smaller than the second.");
            System.exit(0);
        }
    }

    public boolean contains(double x){

        if(x< z && x> a){
            return true;
        }else{
            return false;
        }
    }

    public boolean intersects(Interval b){

        if(b.a >= a && b.a <= z || b.z >= a && b.z <= z){
            return true;
        }else{
            return false;
        }

    }

    public double length(){
        return Math.abs(z-a);
    }

    public String toString(){

        return "[" + a + "," + z + "]";
    }

    public static void main(String[] args){

        Interval a = new Interval(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Interval b = new Interval(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

        System.out.println( "Interval 1: " + a.toString() + "\n " +
                            "Length:\t" + a.length() +
                            "\n Contains 0?\t"  + a.contains(0) +
                            "\n\nInterval 2: " + b.toString() + "\n " +
                            "Length:\t" + b.length() +
                            "\n Contains 0?\t" + b.contains(0) +"\n");
        System.out.println("Do the intervals overlap?\t" + a.intersects(b));

    }
}


