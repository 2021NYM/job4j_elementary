package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean bcSmaller = (ab + ac) > bc;
        boolean abSmaller = (ac + bc) > ab;
        boolean acSmaller = (ab + bc) > ac;
        return bcSmaller && abSmaller && acSmaller;
    }

    public static void main(String[] args) {
        boolean triangle1 = Triangle.exist(1, 1, 3);
        System.out.println(triangle1);
    }
}
