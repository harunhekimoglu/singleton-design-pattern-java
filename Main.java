public class Main
{
  public static void main(String[] args)
  {
    System.out.println("------------------------------");

    SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
    SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

    System.out.println("singletonLazy1 ==> " + singletonLazy1);
    System.out.println("singletonLazy2 ==> " + singletonLazy2);

    System.out.println(singletonLazy1 == singletonLazy2);

    System.out.println("------------------------------");

    SingletonEager singletonEager11 = SingletonEager.getInstance1();
    SingletonEager singletonEager12 = SingletonEager.getInstance1();

    System.out.println("singletonEager11 ==> " + singletonEager11);
    System.out.println("singletonEager12 ==> " + singletonEager12);

    System.out.println(singletonEager11 == singletonEager12);

    System.out.println("------------------------------");

    SingletonEager singletonEager21 = SingletonEager.getInstance2();
    SingletonEager singletonEager22 = SingletonEager.getInstance2();

    System.out.println("singletonEager21 ==> " + singletonEager21);
    System.out.println("singletonEager22 ==> " + singletonEager22);

    System.out.println(singletonEager21 == singletonEager22);

    System.out.println("------------------------------");
  }
}
