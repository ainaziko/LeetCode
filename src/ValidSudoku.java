import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int i = 0; i < N; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                char val = board[i][j];

                if(val == '.') continue;

                if(rows[i].contains(val)) return false;
                rows[i].add(val);

                if(cols[j].contains(val)) return false;
                cols[j].add(val);

                int index = (i / 3) * 3 + (j / 3);
                if(boxes[index].contains(val)) return false;
                boxes[index].add(val);
            }
        }
        return true;
    }
}
