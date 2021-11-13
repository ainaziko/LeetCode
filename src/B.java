import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void solve1(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] people = new int[n];
        for(int i = 0; i < n; i++){
            people[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] viruses = new int[m];
        for(int j = 0; j < m; j++){
            viruses[j] = in.nextInt();
        }
        int dist = in.nextInt();

        Arrays.sort(people);
        Arrays.sort(viruses);
        int pV = 0;
        int pP = 0;
        int count = 0;
        for(int v = 0; v < viruses.length; v++){
            if(canKill(viruses[pV], people[pP], dist)){
                count++;
                pV++;
                pP++;
            }else {
                pV++;
            }
        }
        System.out.println(count);
    }

    public static boolean canKill(int virus, int person, int dist){
        if(virus == person){
            return true;
        }else if(person < virus){
            if(person >= virus - dist){
                return true;
            }
        }else if(person > virus){
            if(virus + dist >= person){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solve1();
    }
}


