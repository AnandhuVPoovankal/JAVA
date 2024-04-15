import java.util.*;
public class linked_list {
public static void main(String[] args){
System.out.println(" \nName:ANANDHU V POOVANKAL\nRoll no:23MCA015\nDate:15-April-2024\n");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}

