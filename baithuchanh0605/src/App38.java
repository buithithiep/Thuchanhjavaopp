import java.util.LinkedList;
public class App38{
    public static void main(String[] args ) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("JAVA");
    list.add("C++");
    list.add("PHP");
    list.add("JAVA");
    System.out.println("ví dụ sử dụng phương thức addAll()");
    System.out.println("-----------------------------------");
    LinkedList<String> listA = new LinkedList<String>();
    listA.addAll(list);
    System.out.print("listA: ");
    showList(listA);
    System.out.println("\nVí dụ sử dụng phương thức retainAll()");
    System.out.println("-----------------------------------");
    LinkedList<String> listB = new LinkedList<String>();
    listB.add("Java");
    listA.retainAll(listB);
    System.out.print("listA:");
    showList(listA);
    System.out.println("\nVí dụ nhập vào phương thức removeAll()");
    System.out.println("------------------------------------");
    list.removeAll(listB);
    System.out.print("list:");
    showList(list);
}
public static void showList(LinkedList<String> list) {
    for (String obj : list) {
        System.out.print("\t" + obj + ", ");
    }
    System.out.println();
}
}







