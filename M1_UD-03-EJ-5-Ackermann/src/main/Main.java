package main;


public class Main {

    public static int A(int m, int n) {
        if (m == 0) {
            return n++;
        }
        if (m > 0 && n == 0) {
            return A(m-1, 1);
        }
        if (m > 0 && n > 0) {
            return A(m-1, A(m, n-1));
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(A(1,0));
    }

}
