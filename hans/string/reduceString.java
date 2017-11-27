import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function

        int foundIndex = -1;

        for(int i=0; i < s.length() - 1; i++) {

            if(s.charAt(i) == s.charAt(i+1)) {
                // found same adjacent letters with same value
                String foundString = String.valueOf(s.charAt(i));
                s = s.replace(foundString+foundString, "");
                // start loop from the beginning of modified string
                i = -1;
            }
        }

        return s.length() == 0 ? "Empty String" : s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}