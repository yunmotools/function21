//  **Reverse String**
//    Write a function to reverse a (using loop). `String`

public class Main {
    public static String reverse(String s){
        String rev = "" ;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            // need to take the index and make it go backwards
             char c = s.charAt(i) ;
             rev = rev + c ;
        }

        return rev;

    }

    public static void main(String [] args){
        System.out.println(reverse("booty")) ;
    }

}
