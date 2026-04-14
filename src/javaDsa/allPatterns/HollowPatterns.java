package javaDsa.allPatterns;

public class HollowPatterns {
    public static void main(String[] args) {
        System.out.println(" Hollow Patterns ");
        System.out.println(" Hollow Rectangle ");
        int r = 5;
        int c = 12;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                //for first and last row print stars
                if (i == 1 || i == r) {
                    System.out.print("* ");
                } else {
                    //for first and last column print star
                    if (j == 1 || j == c) {
                        System.out.print("* ");
                    } else {
                        //in between print spaces
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println(" Hollow Right Angled Triangle ");
        int row = 5;
        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == 2 || i == row) {//first,second and last row
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                //middle rows
                System.out.print("* "); //star at start
                for (int l = 1; l <= i - 2; l++) { //in between spaces (row-2)
                    System.out.print("  ");
                }
                System.out.print("* ");//star at end of the row
            }
            System.out.println();//move to next line
        }
    }
}