public class Mystery {
    public static void main(String [] args) {
        int someNum = mystery(10, 2);
        System.out.println(someNum);
    }

    public static int mystery(int m, int n) {
        if (m <= 0) {
            return n;
        }
        int output = m + n + mystery(m - 2, n + 1);
        System.out.println("m(" + m + ","+n+") = " + output);
        return output;
    }
}
