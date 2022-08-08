import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(55);
        arrayList.add(18);
        arrayList.add(10);
        arrayList.add(294);

        arrayList.forEach(e -> System.out.println(e));


    }

}
