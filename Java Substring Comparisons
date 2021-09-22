import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String[] x = new String[s.length()-k+1];
        for(int i =0 ; i<s.length()-k+1;i++){
            x[i]=s.substring(i,i+k);
        }
        String smallest = x[0];
        String largest = x[0];
        for(String i : x){
            if(largest.compareTo(i)<=0){
                largest=i;
            }
            if(i.compareTo(smallest)<=0){
                smallest = i;
            }
        }
        
        return smallest + "\n" + largest;
    }

