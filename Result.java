//Convert 12 hour clock to 24 hour given input in format hh:mm:ssAM or hh:mm:ssPM
import java.util.*;
public class Result {

    static String timeConversion(String s) {
    
    char []arr = s.toCharArray();
    StringBuilder sb = new StringBuilder(s);
     
    if(arr[8]=='P'&& arr[9]=='M') {
      int num = Character.getNumericValue(arr[1]);
      num+=2;
      if (arr[0]== '1'&& arr[1]=='2'){
        return s.substring(0,8);
      }
      else if(num>9){
          num=num%10;
          arr[1]=Character.forDigit(num, 10);
          sb.setCharAt(1, arr[1]);
          num=Character.getNumericValue(arr[0]);
          num+=2;
          arr[0]=Character.forDigit(num, 10);
          char ch0= arr[0];
          sb.setCharAt(0, ch0);
          s=sb.toString();
      }
      else{
          arr[1]=Character.forDigit(num, 10);
          sb.setCharAt(1, arr[1]);
          num=Character.getNumericValue(arr[0]);
          num+=1;
          arr[0]=Character.forDigit(num, 10);
          char ch0= arr[0];
          sb.setCharAt(0, ch0);
          s=sb.toString();
      } 
    }
    else if(arr[8]=='A'&& arr[9]=='M'){
        if(arr[0]=='1'&& arr[1]=='2'){
        char ch='0';
        sb.setCharAt(0, ch);
        sb.setCharAt(1, ch);
        s=sb.toString();
        }
        else{
             return s.substring(0,8);
        }
    }
    return s.substring(0,8);
    }
    
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Result r = new Result();
		String str = Result.timeConversion(s);
		System.out.print(str);
	}
   
}

	

