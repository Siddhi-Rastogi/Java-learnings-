// by kunal pattern call
public class Patterns {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);

        // pattern3(5);
        pattern7(5);
    }

    // *
    // * *
    // * * *
    // * * * *
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) { // no. of rows in patters(lines)
            // for every row, run the column
            for (int col = 1; col <= i; col++) {
                System.out.print("*" + " ");
            }
            // after evry row we need to print on the next line
            System.out.println();
        }
    }

    // ****
    // ****
    // ****
    // ****
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // *****
    // ****
    // ***
    // **
    // *
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int col = 1; col <= n - i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int col = 1; col <= i; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalcolinrow = i > n ? 2 * n - i : i;
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=1;i<)
    }
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
    static void pattern6(int n){
        for (int row = 0; row< 2*n; row++) {
            int totalnoofstars=row > n ? 2 * n - row : row;
            int numberofspaces = row < n ? n - row : row - n;
            for (int j = 0; j < numberofspaces; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalnoofstars ; col++) {
                   System.out.print("* ");
            }
            System.out.println();
        }
    }
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
    static void pattern7(int n){
        for(int row=0;row<2*n;row++){
            // int stars = row <= n ? row + row : ((2*n)-row)*2;
            // int space=row<=n? ((2*n)-(2*row)) : ((row*2)-(2*n)) ;
         int stars = row < n ? row + 1 : 2*n - row - 1;

        // ✅ adjusted spaces
        // int space = row < n ? (2*(n - row - 1)) : (2*(row - n + 1));
            for(int col=1;col<=stars;col++){
                
                System.out.print("*");      
        }
        for(int spc=1;spc<=space;spc++){
                    System.out.print(" ");
            }
            for(int col=1;col<=stars;col++){
                
                System.out.print("*");      
        }
            System.out.println();
            
        }
    }

}
