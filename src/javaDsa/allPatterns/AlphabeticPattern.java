package javaDsa.allPatterns;

public class AlphabeticPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int h = 'A' - 1;
                System.out.print((char) (h + j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        //OR

        int a=65;
        for(int i=65;i<=70;i++) {

            for(int j=a;j<=i;j++) {

                System.out.print((char)(j)+" ");
            }

            System.out.println();
        }

        System.out.println("=================");
        System.out.println();

        int n=5;
        for(int i=1;i<=5;i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print((char) (n - j + 'A') + " ");
            }
            System.out.println();
        }
        System.out.println();

        //OR

        a=69;
        for(int i=1;i<=5;i++) {
            for(int j=69;j>=a;j--) {
                System.out.print((char)j +" ");
            }
            a--;
            System.out.println();
        }
    }


}
