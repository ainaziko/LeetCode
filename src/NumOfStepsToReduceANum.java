public class NumOfStepsToReduceANum {
    public int numberOfSteps(int num) {
        int counter = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else {
                num--;
            }
            counter++;
        }
        return counter;
    }
}
