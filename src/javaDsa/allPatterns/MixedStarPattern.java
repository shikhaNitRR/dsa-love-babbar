package javaDsa.allPatterns;

public class MixedStarPattern {
    public static void main(String[] args) {
        int r = 4;
        //upper portion
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {//part1
                System.out.print("* ");
            }
            //6,4,2 spaces
            for (int j = 1; j <=2*( r-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {//part2
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower portion
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i+1; j++) {//part1
                System.out.print("* ");
            }
          //,2,4,6 spaces
            for (int j = 1; j<=2*i-2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= r-i+1; j++) {//part2
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
