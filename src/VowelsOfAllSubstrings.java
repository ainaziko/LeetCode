public class VowelsOfAllSubstrings {
    public long countVowels(String word) {
        int n = word.length();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            if (i == 0)
                arr[i] = n;
            else
                arr[i] = (n - i) + arr[i - 1] - i;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                sum += arr[i];
        }
        return sum;
    }

    static int vowel_calc(String s)
    {
        int n = s.length();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                // No. of occurrences of 0th character
                // in all the substrings
                arr[i] = n;

            else
                // No. of occurrences of ith character
                // in all the substrings
                arr[i] = (n - i) + arr[i - 1] - i;
        }

        for(int i : arr){
            System.out.println(i + " ");
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // Check if ith character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                sum += arr[i];
        }

        // Return the total sum
        // of occurrences of vowels
        return sum;
    }

    public long countVowelss(String word) {
        int l = 0;
        int r = 0;
        long counter = 0;
        while (r < word.length()){
            while (l <= r){
                if(r + 1 > word.length()) break;
                counter += vowelCounter(word.substring(l, r + 1));
                r++;
            }
            l++;
            r = l;
        }
        return counter;
    }

    public long vowelCounter(String word){
        long counter = 0;
        for(char ch : word.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        VowelsOfAllSubstrings v = new VowelsOfAllSubstrings();

        System.out.println(vowel_calc("abc"));
    }

    public long countVowels1(String word) {
        int n = word.length();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arr[i] = n;
            }else {
                arr[i] = (n - i) + arr[i - 1] - i;
            }
        }

        long counter = 0;
        for(int i = 0; i < n; i++){
            char curr = word.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u'){
                counter += arr[i];
            }
        }
        return counter;
    }
}
