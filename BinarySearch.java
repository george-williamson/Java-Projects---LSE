// George Williamson, ID: 201904754

/*Ex 3.1 - The binary search algorithm is O(log(n)) of base 2.
At first we have n elements, then n/2, n/4, n/8, ..., 1. How many times would we need to multiply 1 by 2 to reach n?
Lets say we multiply by an arbitrary amount of times k -- (1 * 2 * 2 * 2 * 2 .... * 2 = n).
Hence 2^k = n which then leads us to the conclusion of k = log(n) -- base 2. Giving us the upper bound.



public class BinarySearch {

    static boolean found;
    static int counter = 0;

    static int binsearch(int key, int x[], int i, int j) {

        counter++;
        found = false;

        if (j - i < 0){
            System.out.print("Please enter and i which is less than j.");
        }

        int med = i + (j-i)/2;

        if (j - i > 0) {

            if (key == x[med]) {
                found = true;
                // now check for duplicates
                 for(int n = med; n>0; n--) {
                     if (x[n - 1] != key) {
                         return med;
                     }
                 }
            } else if (key < x[med]) {
                return binsearch(key, x, i, med - 1);
            } else if (key > x[med]) {
                return binsearch(key, x, med + 1, j);
            }
        }
            if(i == key){
                found = true;
            }

            return i;
    }

    static void find(int key, int a[], int i, int j){

        int index = binsearch(key, a, i, j);
        String size = arraySize(a);
        String identical = arrayIdentical(a);

        if(size == "small") {
            System.out.print("Testing a " + size + " array:  ");
            for(int k = 0; k<a.length; k++){
                System.out.print(a[k]+"  ");
            }
            System.out.println();
        }else{
            System.out.print("Testing a " + size + " array with " + (a.length) + " "+ identical + " entries:  ");
            System.out.println(a[0] + "  " + a[1] + "  " + a[2] + "  " + a[3] + "  ...  " + a[a.length-1]);
        }

        if(found == false) {
            System.out.println("Key " + key + " was not found. Should be at index " + index + ", after " +
                                counter + " binary search iterations.");
        }else{
            System.out.println("Key " + key + " found at index " + index + ", after " +
                               counter + " binary search iterations.");
        }


        counter = 0;
        System.out.println();
    }

    static String arraySize(int a[]) {

        if (a.length > 10) {
            return "large";
        } else {
            return "small";
        }
    }

    static String arrayIdentical(int a[]) {

        int number = a[0];

        for (int i = 1; i < a.length-1; i++) {
            if (a[i] != number) {
                return "";
            }
        }
        return "identical";
    }

    public static void main(String args[]) {

        int[] literalArray = new int[]{1, 3, 6, 7, 7, 7, 9};
        int[] evenArray = new int[(int)1E7];
        int[] tensArray = new int[(int)1E7];

        for(int i =0; i<evenArray.length; i++){
            evenArray[i] = i*2;
            tensArray[i] = 10;
        }

        find(3, literalArray, 0, 7);
        find(22, evenArray, 0, (int)1E7);
        find(10, tensArray, 0, (int)1E7);

    }

}
*/