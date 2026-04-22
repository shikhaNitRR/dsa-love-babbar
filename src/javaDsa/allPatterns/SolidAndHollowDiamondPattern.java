package javaDsa.allPatterns;

public class SolidAndHollowDiamondPattern {
    public static void main(String[] args) {
        System.out.println(" Solid Diamond Pattern ");
        int n=5;
        //first half
        for(int i=1;i<=n;i++){//4 rows
            for(int j=1;j<=n-i;j++){ //3,2,1,0 spaces
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-3;j++){//1,3,5,7 stars
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=1;i<=n-1;i++){//3 rows
            for(int j=1;j<=i;j++){//1,2,3,4 spaces
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)-3;j++){ //5,3,1 star
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ================Hollow Diamond Pattern=============================== ");
        n=4;
        //first half
        for(int i=1;i<=4;i++){
            for(int j=1;j<=n-i;j++){//3,2,1 space
                System.out.print("  ");
            }
            if(i==1){
                System.out.print("* ");//1 star in first row
            }
            else{
                System.out.print("* ");
                for(int j=1;j<=2*i-3;j++){//1,3,5 spaces
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=1;i<=n-1;i++){//3 rows
            for(int j=1;j<=i;j++){//1,2,3 spaces
                System.out.print("  ");
            }
            if(i==n-1){
                System.out.print("* ");//1 star in last row
            }
            else{
                System.out.print("* ");
                for(int j=1;j<=2*(n-i)-3;j++)  {//3,1 spaces
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}


