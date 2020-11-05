/*
        // George Williamson, ID: 201904754

class Matrix {

    static int[][] randomMatrix (int n, int m, int max) {

        int[][] rand_matrix = new int[n][m];

        for (int k = 0; k <n; k++) {
            for (int i = 0; i < m; i++) {
                rand_matrix[k][i] = (int)(Math.random() * (max+1));
            }
        }

        return rand_matrix;
    }

    static int[][] product ( int[][] a, int[][] b) {

        int[][] matrix_prod = new int[a.length][b[0].length];

        for(int i=0; i<a.length; i++){
            for(int j =0; j<b[0].length; j++){
                for(int k=0; k<a[0].length; k++){
                    matrix_prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return matrix_prod;
    }

    static void transpose (int[][] matrix) {

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return;
    }

    static void printMatrix ( String name, int[][] matrix) {

        System.out.println( name + " = " );
        if (matrix == null) {
            System.out.println( "null" );
            return;
        }
        // print the matrix
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                String entry = Integer.toString( matrix[i][j] );
                System.out.print(entry + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        if (args.length<3) {
            return;
        }
        int n = Integer.parseInt( args[0] );
        int m = Integer.parseInt( args[1] );
        int max = Integer.parseInt( args[2] );
        int[][] a = randomMatrix(n,m,max);
        int[][] b = randomMatrix(m,m,max);
        printMatrix("a", a );
        System.out.println();
        printMatrix( "b", b );
        System.out.println();
        printMatrix( "a*b", product(a,b) );
        System.out.println();
        transpose(b);
        printMatrix( "b^T", b );
    }

}
*/