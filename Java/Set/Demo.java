import java.util.HashSet;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(400);
        hs.add(null);
        /*
         * Iterator it = hs.iterator(); while (it.hasNext()) {
         * System.out.println(it.next());
         * 
         * }
         * 
         * for (Object obj : hs) { System.out.println(obj); }
         */
        System.out.println(hs.get(1));
    }

}
