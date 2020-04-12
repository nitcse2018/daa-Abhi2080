//matrix chain multiplication implementation in java
// for 4 matrices m1(10x100), m1(100x20), m3(20x5), m4(5x80)
public class matrix_chain_mult
{
  public static int matrixChainMult(int p[], int n)
  {
    int[][] m = new int[n+1][n+1];
    for(int i =1; i<=n; i++)
    {
      m[i][i] = 0;
    }
    for(int l =2; l<=n; l++)//herre l is chain length
    {
      for(int i=1; i<=(n-l+1); i++)
      {
        int j = i+l-1;
        m[i][j] = Integer.MAX_VALUE;
        for(int k =i; k<j; k++)
        {
          int value = m[i][k] + m[k+1][j] + (p[i-1]*p[k]*p[j]);
          if(value<m[i][j])
          {
            m[i][j] = value;
          }
        }
      }
    }
    return m[1][n];
  }
  public static void main(String args[])
  {
    int[] p ={10,100,20,5,80};
    int n = p.length-1;
    System.out.println("minimum number of multiplications is " + matrixChainMult(p,n));
  }
}
