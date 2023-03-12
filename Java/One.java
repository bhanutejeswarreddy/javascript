import java.util.*;

class one {
    public static void main(String[] args) {
        String[] names = { "srinivas", "girish", "Tendul", "bhanu" };
        List<String> ls = Arrays.asList(names);
        ArrayList al = new ArrayList(ls);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(Arrays.asList(al));
        System.out.println(Arrays.asList(al));

    }
}
