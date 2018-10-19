import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    ArrayList <Integer> list = new ArrayList<Integer>();

    System.out.println("Enter the numbers to Search from: ");
    String val = kb.nextLine();

    String[] arr = val.split(" ");
    for(int i = 0; i < arr.length; i++)
    {
      list.add(Integer.parseInt(arr[i]));
    }
    System.out.println(Collections.max(list));
  }
}