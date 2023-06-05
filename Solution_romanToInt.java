import java.util.Scanner;
import java.util.Stack;


public class Solution_romanToInt {
    static int romanToInt(String s) {
        char []arr = s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && arr[i]=='I' && (arr[i+1]=='V'||arr[i+1]=='X') ){
              if(arr[i+1]=='V'){
                  sum+=4;
                  i++;
              }
              else{
                  sum+=9;
                  i++;
              }
            }
            else if(i<s.length()-1 && arr[i]=='X' && (arr[i+1]=='L'||arr[i+1]=='C')){
              if(arr[i+1]=='L'){
                  sum+=40;
                  i++;
              }
              else{
                  sum+=90;
                  i++;
              }
            }
            else if(i<s.length()-1 && arr[i]=='C' && (arr[i+1]=='D'||arr[i+1]=='M')){
              if(arr[i+1]=='D'){
                  sum+=400;
                  i++;
              }
              else{
                  sum+=900;
                  i++;
              }
            }
            else {
                sum+=getChar(arr[i]);
            }
        }
         return sum;
    }
    private static int getChar(char c){
        if(c=='I'){
            return 1;
        }
        else if (c=='V'){
            return 5;
        }
        else if (c=='X'){
            return 10;
        }
        else if (c=='L'){
            return 50;
        }
        else if (c=='C'){
            return 100;
        }
        else if (c=='D'){
            return 500;
        }
        else if (c=='M'){
            return 1000;
        }
        else{
            throw new IllegalArgumentException("invalid Roman numeral "+ c);
        }
    }
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        int integer = romanToInt(s);
        System.out.println("total " + integer);
    }
}




