import java.util.*;

class Demo {
    public static void main(String[] args) {
        HashSet hs = new HashSet(200, (float) 0.60);
        hs.add(100);
        hs.add(100);
        hs.add(100);
        hs.add(100);
        hs.add(null);

        System.out.println(hs.isEmpty());
    }

}
