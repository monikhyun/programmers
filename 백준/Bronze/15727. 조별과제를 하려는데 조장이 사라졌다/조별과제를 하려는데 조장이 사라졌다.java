import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int L = Integer.parseInt(br.readLine());

    if( L % 5 == 0)
      bw.append(L/5+" ");
    else
    {
      int a = L / 5 + 1;
      bw.append(a+ " ");
    }

    bw.flush();
    bw.close();
  }
}