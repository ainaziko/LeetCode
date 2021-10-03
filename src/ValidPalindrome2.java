package neocoder.week3;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        ValidPalindrome2 v = new ValidPalindrome2();
        System.out.println(v.validPalindrome("abd"));
    }
    public boolean validPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
        for(; p1 < p2; p1++, p2--){
            if(s.charAt(p1) != s.charAt(p2)){
                int pointer1 = p1 + 1, pointer2 = p2;
                while (pointer1<pointer2 && s.charAt(pointer1)==s.charAt(pointer2)){ pointer1++;pointer2--;}
                int point1=p1, point2=p2-1;
                while (point1 < point2 && s.charAt(point1) == s.charAt(point2)){ point1++;point2--; }
                return (point1 >= point2) || (pointer1 >= pointer2);
            }
        }
        return true;
    }
}
