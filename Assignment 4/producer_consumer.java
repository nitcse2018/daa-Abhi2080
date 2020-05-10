public class producer_consumer
{
  public static void main(String[] args)
  {
    producer p = new producer();
    p.setName("producer-1");
    p.start();

    consumer c1 = new consumer(p);
    c1.setName("consumer-1");
    c1.start();

    consumer c2 = new consumer(p);
    c2.setName("consumer-2");
    c2.start();

    consumer c3 = new consumer(p);
    c3.setName("consumer-2");
    c3.start();
  }
}
