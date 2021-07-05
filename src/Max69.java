public class Max69 {
    public int maximum69Number(int num){
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '6'){
                sb.append('9' + s.substring(i + 1, s.length()));
                break;
            }else {
                sb.append('9');
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
