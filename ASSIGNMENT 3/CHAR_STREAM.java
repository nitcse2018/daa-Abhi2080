import java.io.*;

public class CHAR_STREAM
{
  public static void main(String[] args) throws IOException 
  {
    FileReader f_in = null;
    FileWriter f_out = null;
    try
    {
      f_in = new FileReader("F:/java_practice/java io stream/input-file1.txt");
      f_out = new FileWriter("F:/java_practice/java io stream/output-file2.txt");
      int abhi;
      while((abhi = f_in.read()) != -1)
      {
        f_out.write(abhi);
      }
    }

    finally
    {

      if(f_in!=null)
      {
        f_in.close();
      }
      if(f_out!=null)
      {
        f_out.close();
      }

    }
  }
}
