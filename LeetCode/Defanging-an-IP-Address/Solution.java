1class Solution {
2    public String defangIPaddr(String address) {
3        var sb=new StringBuilder("");
4        for(int i=0;i<address.length();i++){
5            if(address.charAt(i)=='.') sb.append("[.]");
6            else sb.append(address.charAt(i));
7        }
8        return sb.toString();
9    }
10}