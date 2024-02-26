import java.util.Arrays;
public class StringSort
 {
  public static void main(String[] args) 
  {
   System.out.println("Name:Anandhu V Poovankal \nRollno:23mca015\nTitle:String Sorting\nDate:26-02-2024\n");
   String[] strings = {"banana", "apple", "cherry", "date"};
   System.out.println("Original array: " + Arrays.toString(strings));
   Arrays.sort(strings);
   System.out.println("Sorted array: " + Arrays.toString(strings));
  }
}


