public class consumer extends Thread
{
  private producer p;
  public consumer(producer p)
  {
    this.p = p;
  }
  public void run()
  {
    try
    {
      while(true)
      {
        String data = p.consume();
        System.out.println("consumed by " + Thread.currentThread().getName() + " data "+data);
        Thread.sleep(500);
      }
    }
    catch(Exception ex)
    {

    }
  }
}
