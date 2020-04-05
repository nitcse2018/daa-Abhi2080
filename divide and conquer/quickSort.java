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
    int[] numbers = {12,45,67,8,9,34,56,87,90};

    int n = numbers.length;
    quickSort(numbers,0,(n-1));
    for(int i = 0; i<n; i++)
    {
    System.out.println(numbers[i]);}
  }
}
