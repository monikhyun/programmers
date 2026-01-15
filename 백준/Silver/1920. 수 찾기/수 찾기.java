import java.io.*;
import java.util.*;

public class Main{

  public static int N;
  public static int M;

  public static int[] arr;
  public static int[] find;
  
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());

    arr = new int[N];
    
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    for(int i = 0; i<N; i++){
      arr[i] = Integer.parseInt(st1.nextToken());
    }

    M = Integer.parseInt(br.readLine());

    find = new int[M];
    
    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    for(int i = 0; i<M; i++){
      find[i] = Integer.parseInt(st2.nextToken());
    }

    Arrays.sort(arr);

    for(int i = 0 ; i<M; i++){
      bw.append(binarySearch(find[i])+"\n");
    }
    bw.flush();
    bw.close();
  }

  public static int binarySearch(int X){
    int low_idx = 0;
    int high_idx = N-1;
    int mid;

    while(low_idx<=high_idx){
      mid = low_idx + (high_idx - low_idx) / 2;

      if(arr[mid] == X)
        return 1;
      else if(X > arr[mid])
      {
        low_idx = mid + 1;
      }
      else if (X < arr[mid]){
        high_idx = mid-1;
      }
    }

    return 0;
  }


}