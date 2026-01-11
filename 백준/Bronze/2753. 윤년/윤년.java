import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int year = Integer.parseInt(br.readLine());

    if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
      bw.append("1");
    else
      bw.append("0");

    bw.flush();
    bw.close();
  }
}