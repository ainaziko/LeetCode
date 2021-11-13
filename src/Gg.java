import java.util.Scanner;

public class Gg {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner in = new Scanner(System.in);
        //int k = in.nextInt();
        double d = 1.0/27.0;
        System.out.println((int)(((Math.pow(3, 1) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 2) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 3) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 4) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 5) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 6) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 7) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 8) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 9) + 1)/2)%8));
        System.out.println((int)(((Math.pow(3, 10) + 1)/2)%8));


        //System.out.println(Math.pow(3, 100000));
        //System.out.println((((Math.pow(3,k)+1)/2.0)%8) + " " + (((d+1)/2.0)%8));
        //System.out.println((int)(((Math.pow(3, k) + 1)/2)%8));
    }
}
