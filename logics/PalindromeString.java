package logics;

public class PalindromeString {
    public static void main(String[] args) {
        String str="GKG";
        String t="";
        for(int i=str.length()-1;i>=0;i--){
            t=t+str.charAt(i);
        }
        if(str.equals(t)){
            System.out.println(str+" is a palindrome string");
        }
        else{
            System.out.println(str+" is not a palindrome string");
        }
    }
}
