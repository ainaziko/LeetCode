import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        r = r/10;
        if(dist <= r){
            System.out.println(10);
        }else if(dist <= r*2){
            System.out.println(9);
        }else if(dist <= r*3){
            System.out.println(8);
        } else if(dist <= r*4){
            System.out.println(7);
        }else if(dist <= r*5){
            System.out.println(6);
        }else if(dist <= r*6){
            System.out.println(5);
        }else if(dist <= r*7){
            System.out.println(4);
        }else if(dist <= r*8){
            System.out.println(3);
        }else if(dist <= r*9){
            System.out.println(2);
        }else if(dist <= r*10){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
