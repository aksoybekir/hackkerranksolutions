import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number = s.nextInt();
        s.nextLine();

        List<String> names = new ArrayList<String>();
        List<String> first_letters = new ArrayList<String>();
        String participate = "";

        for( int i = 0 ; i < number; i++){
            names.add(s.nextLine());
        }
        Collections.sort(names);
        for( int i = 0 ; i < number; i++){
            first_letters.add(String.valueOf(names.get(i).charAt(0)));
        }
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(int i = 0; i<26; i++) {
            int a = Collections.frequency(first_letters, String.valueOf(alphabet[i]));
            if(a >= 5) {
                participate += (String.valueOf(alphabet[i]));
            }
        }
        if(participate != "") {
            System.out.println(participate);
        }
        else 
            System.out.println("inzva");
        
    }
}
