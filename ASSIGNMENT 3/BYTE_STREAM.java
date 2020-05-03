import java.io.*;

public class BYTE_STREAM
{
  public static void main(String[] args) throws IOException
  {
    FileInputStream f_in = null;
    FileOutputStream f_out = null;
    try
    {
      f_in = new FileInputStream("F:/java_practice/java io stream/input-file1.txt");
      f_out = new FileOutputStream("F:/java_practice/java io stream/output-file2.txt");
      int dk;
      while((dk = f_in.read()) != -1)
      {
        f_out.write(dk);
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
