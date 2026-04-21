package javaDsa.allPatterns;

public class SolidAndHollowDiamondPattern {
    public static void main(String[] args) {
        System.out.println(" Solid Diamond Pattern ");
        int row = 4;
        //first half
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
//second half
        for (int i = 1; i <= row; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println(" ================Hollow Diamond Pattern=============================== ");
        int n=4;
        //first half
        for(int i=1;i<=4;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            if(i==1){
                System.out.print("* ");
            }
            else{
                System.out.print("* ");
                for(int j=1;j<=2*i-3;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            if(i==n-1){
                System.out.print("* ");
            }
            else{
                System.out.print("* ");
                for(int j=1;j<=2*(n-i)-3;j++)  {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}


