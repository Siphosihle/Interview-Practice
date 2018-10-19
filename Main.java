class Main
{
  public static void main(String[] args)
  {
    int max = 12;

    for(int i = 1; i <= max; i++)
    {
      for(int s = 1; s <= max; s++)
      {
        System.out.print(String.format("%4d", i * s));
      }
      System.out.println();
    }
  }
}