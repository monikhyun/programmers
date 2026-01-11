import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true){
      String input = br.readLine();
      int cnt = 0;
      if(input.equals("#"))
        break;
      for(char c : input.toCharArray()){
        switch(Character.toLowerCase(c)){
          case 'a' : cnt++; break;
          case 'e' : cnt++; break;
          case 'i' : cnt++; break;
          case 'o' : cnt++; break;
          case 'u' : cnt++; break;
        }
      }
      bw.append(cnt+" ");
      bw.newLine();

      bw.flush();
    }

    bw. close();
  }
}