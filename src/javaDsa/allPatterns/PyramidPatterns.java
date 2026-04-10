package javaDsa.allPatterns;

public class PyramidPatterns {
    public static void main(String[] args) {
        System.out.println("======PyramidPatterns======");
        //PyramidPattern1
        System.out.println("======PyramidPattern1=====triangle :WAY1 divide in 3 patterns");
        int n=5;
        //way1 -spaces,star half1,star half2
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //divide the star triangle into two halves
            //star first half pattern
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //star second half pattern
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("======PyramidPattern1=====triangle : WAY2  divide in 2 patterns , EFFICIENT way");
        //way2-spaces,star triangle as wholw
        for(int i=1;i<=n;i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //treating triangle of stars as one
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("======PyramidPattern2=====inverted triangle :");
        System.out.println(" ");
        for(int i=1;i<=n;i++) {
            //spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            // stars as one
            for (int j = 1; j <= 2*n-2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
