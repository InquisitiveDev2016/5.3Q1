import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        array.add("6");
        array.add("7");
        System.out.println(array.toString());
        System.out.println(allButLast(array));

    }

    public static List<String> allButLast(List<String> list) {

        for(;list.size() > 1;)
        {
            System.out.println(list);
            list.remove(0);
        }
        return list;
    }


}
