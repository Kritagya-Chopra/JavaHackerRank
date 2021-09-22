import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(isPalindrome(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        int half = end/2;
         
        for(int i = 0; i < half; i++, start++, end-- ){
            if(str.charAt(start) != str.charAt(end))
                return false;
        }
         
        return true;
    }
}



