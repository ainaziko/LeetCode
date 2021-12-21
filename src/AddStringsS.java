public class AddStringsS {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // 1) reverse
        sb.append(num1).reverse();
        sb2.append(num2).reverse();

        // 2) add up '0's if needed
        if(num1.length() != num2.length()){
            if(num1.length() > num2.length()){
                sb2.append("0".repeat(num1.length() - num2.length()));
            }else {
                sb.append("0".repeat(num2.length() - num1.length()));
            }
        }
        num1 = sb.toString();
        num2 = sb2.toString();

        int carry = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < num1.length(); i++){
            int x = num1.charAt(i) - '0';
            int y = num2.charAt(i) - '0';
            int sum = (carry + x + y) % 10;
            carry = (carry + x + y) / 10;
            res.append(sum);
        }

        if(carry != 0){
            res.append(carry);
        }

        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "999"; //1      //00004
        String num2 = "99"; //5  //77890
        AddStringsS addStringsS = new AddStringsS();
        addStringsS.addStrings(num1, num2);
    }

}
