package September;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for(String el : patterns){
            if(word.contains(el))counter++;
        }
        return counter;
    }
}
