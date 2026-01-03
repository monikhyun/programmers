import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main{
  public static String input;
  public static int format;
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        format = sc.nextInt();

        char[] numbers = input.toCharArray();

        long solution = 0;
        for(int i = 0; i<input.length(); i++){
          int num;
          if(numbers[i] >= 'A')
          {
            num = numbers[i] - 55;
          }
          else
          {
            num = numbers[i] - '0';
          }
          solution += num * Math.pow(format, (input.length()-(i+1)));
        }

      System.out.println(solution);
	}
}