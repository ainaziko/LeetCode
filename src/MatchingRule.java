import java.util.List;

public class MatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int counter = 0;
        switch (ruleKey) {
            case "color" -> index = 1;
            case "name" -> index = 2;
        }

        for(List<String> item : items){
            if(ruleValue.equals(item.get(index))) counter++;
        }
        return counter;
    }
}
