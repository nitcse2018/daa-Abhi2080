import java.util.PriorityQueue;


public class optimal_merge
{
 static int minComputation(int n, int size[])
{
  PriorityQueue<Integer> Q  = new PriorityQueue<>();
  for(int i =0; i<n;i++)
  {
    Q.add(size[i]);
  }
  int count = 0;
  while(Q.size()>1)
  {
    int z = Q.poll() + Q.poll();
    count = count + z;
    Q.add(z);
  }
  return count;
}
public static void main(String args[])
{
  int n=6;
  int[] size = {21,30,46,56,69,73};
  System.out.println("Minimum number of Computations = " + minComputation(n, size));

}
}
