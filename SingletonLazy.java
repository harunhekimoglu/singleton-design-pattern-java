public class SingletonLazy
{
  private static SingletonLazy instance;

  private SingletonLazy() {}

  public static SingletonLazy getInstance()
  {
    return instance == null 
      ? instance = new SingletonLazy() 
      : instance;
  }
}
