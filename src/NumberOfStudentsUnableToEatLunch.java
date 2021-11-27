import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int iWantCircle = 0;
        int iWantSquare = 0;

        for (int student: students) {
            if(student == 1) iWantCircle++;
            else iWantSquare++;
        }

        for (int sandwich: sandwiches) {
            if(sandwich == 1 && iWantCircle > 0){
                iWantCircle--;
            }else if(sandwich == 0 && iWantSquare > 0){
                iWantSquare--;
            }else break;
        }
        return iWantCircle + iWantSquare;
    }
}
