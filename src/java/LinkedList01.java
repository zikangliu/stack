import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("1");
        arr.add("2");
        arr.addLast("1997");
        arr.add("3");
        arr.add("4");
        arr.add("5");

//        for (int size = arr.size(), i = 0; i < size; i++) {
//            System.out.print(arr.get(i) + " ");
//        }

        for (String i :
                arr) {
            System.out.print(i + " ");
        }
    }
}
