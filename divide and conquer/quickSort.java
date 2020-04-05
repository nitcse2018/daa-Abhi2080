import java.util.Random;
public class quickSort
{
  static void swap(int a, int b)
  {
    int temp = a;
    a =b;
    b= temp;
  }
  static int partition(int numbers[], int low, int high)
  {
    int pivot = numbers[low];
    int i = low+1;
    for(int j = (low+1); j<=high; j++)
    {
      if(numbers[j]<pivot)
      {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        i++;
      }
    }
    int temp1 = numbers[low];
    numbers[low] = numbers[i-1];
    numbers[i-1] = temp1;
    return i-1;
  }
  static void quickSort(int numbers[], int low, int high)
  {

    if(low<high)
    {
      int pi = partition(numbers, low, high);
      quickSort(numbers,low,pi-1);
      quickSort(numbers,pi+1,high);
    }
  }
  public static void main(String args[])
  {
    Random rd = new Random();
    int[] numbers = new int[10000];
    for(int i =0; i<numbers.length; i++)
    {
      numbers[i] = rd.nextInt();
      System.out.println(numbers[i]);
    }
    System.out.println();
    int n = numbers.length;
    long start = System.currentTimeMillis();
    quickSort(numbers,0,(n-1));
    long end = System.currentTimeMillis();
    for(int i = 0; i<n; i++)
    {
    System.out.println(numbers[i]);}
    System.out.println("Total execution time in millis: " + (end - start));

  }

}
