package exercism;

public class ReverseString {
    String reverse(String inputString) {
        String rev = "";
        char ch;
        for(int a = inputString.length()-1; a>=0; a--){
            ch = inputString.charAt(a);
            rev += ch;
        }
        return rev;
    }
    public static void main(String [] args){
        ReverseString r = new ReverseString();
        System.out.println(r.reverse("bobo"));
    }
}
