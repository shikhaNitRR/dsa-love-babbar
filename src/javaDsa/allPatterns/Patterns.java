package javaDsa.allPatterns;

public class Patterns {

    public static void main(String[] args) {
        //Pattern1
        System.out.println("======Pattern1=====Solid Rectangle ");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Pattern2
        System.out.println("======Pattern2=====Right Angled Triangle ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        //Pattern3
        System.out.println("======Pattern3=====Solid Rhombus ");
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            //move to next line
            System.out.println();
        }

        System.out.println("======Pattern4=====Inverted Right angled triangle");
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            //move to next line
            System.out.println();
        }
    }
}
