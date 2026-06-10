package javaDsa.allPatterns;

public class NumericPatterns {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
//pattern2
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();

        }
        System.out.println();
//Pattern3
        int k = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(k + j + " ");

            }
            k++;
            System.out.println();

        }
//Pattern4
        System.out.println();
        int count = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
