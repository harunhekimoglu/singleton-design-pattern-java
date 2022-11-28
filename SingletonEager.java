public class SingletonEager
{
  private static SingletonEager instance1 = new SingletonEager();
  private static SingletonEager instance2;

  static {
    instance2 = new SingletonEager();
  }

  private SingletonEager() {}

  public static SingletonEager getInstance1()
  {
    return instance1;
  }

  public static SingletonEager getInstance2()
  {
    return instance2;
  }
}
