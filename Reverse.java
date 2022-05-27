public class Reverse {
    public static void main(String[] args) {
        int x=123;
        int reverse=0;
        for (; x!= 0;x=x/10) {
            int remainder=x%10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println(reverse);
    }
}
