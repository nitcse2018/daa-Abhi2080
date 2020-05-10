import java.time.*;
import java.util.*;
import java.util.concurrent.locks.*;
public class producer extends Thread
{
  private static int max_size  = 3; // producer can store maximum three items in the queue.
  private final List<String> messages = new ArrayList<>();
  private static Lock lck = new ReentrantLock(true);

  public void run(){
    try
    {
      while(true)
      {
        produce();
      }
    }
    catch(Exception ex)
    {

    }
  }

  public void produce() throws Exception
  {
  lck.lock();
    try{
      System.out.println("Lock aquired by "+Thread.currentThread().getName());

    while(messages.size() == max_size)
    {
      System.out.println("queue limit is reached waiting for consumer");
      wait();
      System.out.println("producer get notification from consumer");
    }
    messages.add(LocalDateTime.now().toString());
    System.out.println("producer produced data");
    notify();
  }
  finally{
    lck.unlock();
    System.out.println("Lock unlocked by "+Thread.currentThread().getName());
  }
  }
  public String consume() throws Exception
  {
    lck.lock();
      try{
        System.out.println("Lock aquired by "+Thread.currentThread().getName());

    notify();
    while(messages.isEmpty())
    {
      wait();
    }
    String data = messages.get(0);
    messages.remove(data);
    return data;
  }
  finally{
    lck.unlock();
    System.out.println("Lock unlocked by "+Thread.currentThread().getName());
  }
}
}
