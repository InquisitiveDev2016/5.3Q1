import java.util.*;

// 1 .) //
    
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


// 2. //

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(4);
        set.add(5);

        int lastElement = 0;
        for(Integer value: set)
        {
            lastElement = value;
        }
        System.out.println(lastElement);
        // the foor loop at the bottom is better set iterator sets i to first element, the loop runs until hasnext is false; and i.next() is equivalent to i++
        for(Iterator i = set.iterator(); i.hasNext(); i.next())
        {
            //i.next() is equal to the value of the indice of a set //
        }

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
