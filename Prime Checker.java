import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
    public void checkPrime(int... arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<2){
                
            }else if(arr[i]==2){
                System.out.print(arr[i]+" ");
            }
            else{
                int logic = 1;
                for(int j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        logic = 0;
                        break;
                    }
                }
                if(logic==1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();
    }
}
public class Solution {
