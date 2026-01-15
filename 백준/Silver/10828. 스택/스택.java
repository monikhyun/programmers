import java.io.*;
import java.util.*;

public class Main{

  public static int N;
  public static void main(String[] args) throws Exception{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());
          Stack stack = new Stack(N);
    
    for(int i =0; i<N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      String method = st.nextToken();

      int X;

      if(method.equals("push"))
      {
          X = Integer.parseInt(st.nextToken());
          stack.push(X);
      }
      else if(method.equals("pop"))
        bw.append(stack.pop() + "\n");
      else if(method.equals("size"))
        bw.append(stack.size() + "\n");
      else if(method.equals("empty"))
        bw.append(stack.empty()+"\n");
      else if(method.equals("top"))
        bw.append(stack.top() + "\n");

    }

    bw.flush();
    bw.close();
  }

  static class Stack{
    int top = -1;
    int size;
    int[] arr;
    
    Stack(int size){
      this.size = size;
      arr = new int[size];
    }

    public void push(int X){
      if(top<size)
        arr[++top] = X;
    }

    public int pop(){
      if(top != -1)
        return arr[top--];
      else
        return -1;
    }

    public int size(){
        return (top+1);
    }

    public int empty(){
      if(top == -1)
        return 1;
      else
        return 0;
    }

    public int top(){
      if(top != -1)
        return arr[top];
      else
        return top;
        
    }
  }
}