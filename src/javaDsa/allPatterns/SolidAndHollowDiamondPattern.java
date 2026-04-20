package javaDsa.allPatterns;

public class SolidAndHollowDiamondPattern {
    public static void main(String[] args) {
        System.out.println(" Solid Diamond Pattern ");
        int row = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println(" =============================================== ");

    }

}


