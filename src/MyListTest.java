import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(10);
        listInteger.add(7);
        listInteger.add(6);
//        System.out.println(listInteger.remove(2));
//        System.out.println(listInteger.size());
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println(listInteger.get(i));
//        }
        listInteger.clear();
        System.out.println(listInteger);

    }
}
