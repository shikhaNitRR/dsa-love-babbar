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
    }


//        System.out.println(" Hollow Right Angled Triangle ");
//        int row = 5;
//        int col = 5;
//        for (int i = 1; i <= row; i++) {
//                if (i == 1 || i == 2 || i == row) {
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("* ");
//                    }
//                }
//                else {
//                    System.out.println();
//                         if (j == 1 || j == col) {
//                         System.out.print("* ");
//                                            }
//                         else {
//                                for (int k = 3; k < col; k++) {
//                                   for (int l = 1; l <= k - 2; l++) {
//                                     System.out.print("  ");
//                                   }
//                                }
//                        }
//                }
//            }
//           System.out.println();
//        }
//    }
}
