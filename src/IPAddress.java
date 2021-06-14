public class IPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char curr : address.toCharArray()){
            if(curr != '.'){
                sb.append(curr);
            }else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
