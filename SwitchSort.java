// George Williamson

public class SwitchSort {


    static void SwitchSort(int[] x) {

        for (int i = 0; i < x.length - 1; i++) {

            int indexOfMin = i;

            for (int n = i + 1; i < x.length; n++) {
                if (x[n] < x[indexOfMin]) {
                    indexOfMin = n;
                }
            }

            int temp = x[i];
            x[i] = x[indexOfMin];
            x[indexOfMin] = temp;
        }
    }


    static void main(String args[]){

        int [] x = new int[args.length];
        System.out.print("Before Sorting:  ");

        //print initial input & add each element to new vector of INTS
        for(int i = 0; i<args.length; i++){
            System.out.print(args[i] + "  ");
            x[i] = Integer.parseInt(args[i]);
        }
        System.out.println();

        SwitchSort(x);
        System.out.print("After Sorting:  ");

        for(int i =0; i<x.length; i++){
            System.out.print(x[i] + "  ");
        }
        System.out.println();

    }

}
