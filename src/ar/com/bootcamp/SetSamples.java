package ar.com.bootcamp;

import java.util.*;

public class SetSamples {

    public enum Color {
        RED, YELLOW, GREEN, BLUE, BLACK, WHITE
    }

    private static void setOperations() {
        Set<Integer> s1 = Set.of(1, 2, 3, 4, 5);

        Set<Integer> s2 = Set.of(4, 5, 6, 7);

        Set<Integer> s11 = new HashSet<>(s1);

        System.out.println(s1 + " INTERSECCION " + s2 + " ( " + s11.retainAll(s2) + " ) --> " + s11);

        s11 = new HashSet<>(s1);

        System.out.println(s1 + " UNION " + s2 + " ( " + s11.addAll(s2) + " ) --> " + s11);

        s11 = new HashSet<>(s1);

        System.out.println(s1 + " DIFERENCIA " + s2 + " ( " + s11.removeAll(s2) + " ) --> " + s11);

    }

    private static void setComparative() {
        int[] array = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};

        Set<Integer> s = new HashSet<>();

        Set<Integer> linked = new LinkedHashSet<>();

        for (int a : array) {
            s.add(a);
            linked.add(a);
        }

        System.out.println("HASHSET -> " + s);
        System.out.println("TREESET -> " + new TreeSet<>(s));
        System.out.println("LINKED -> " + linked);

        Set<Color> enumSet = EnumSet.allOf(Color.class);

        System.out.println("COLORS -> " + enumSet);
    }

    public static void main(String[] args) {
        setOperations();

        setComparative();
    }
}
