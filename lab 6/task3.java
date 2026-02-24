import java.util.Scanner;

public class task3 {
    public static int max(int a,int b){return a>b?a:b;}
    public static double max(double a,double b){return a>b?a:b;}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Int a b: "); int ai=sc.nextInt(), bi=sc.nextInt();
        System.out.println("Макс int: " + max(ai,bi));
        System.out.print("Double a b: "); double da=sc.nextDouble(), db=sc.nextDouble();
        System.out.println("Макс double: " + max(da,db));
        sc.close();
    }
}