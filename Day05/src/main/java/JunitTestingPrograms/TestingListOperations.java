package JunitTestingPrograms;
import java.util.ArrayList;
import java.util.List;
public class TestingListOperations {
    public static void addElementToList(List<Integer> list, int value) {
        list.add(value);
        System.out.println(list.toString());
    }
    public static void removeElementFromList(List<Integer> list, int value) {
        list.remove(value);
        System.out.println(list.toString());
    }
    public static void sizeOfList(List<Integer> list) {
        System.out.println(list.size());
    }

   public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
        list.add(9);
       int value = 10;
       addElementToList(list, value);
       removeElementFromList(list, 4);
       sizeOfList(list);
   }
}
