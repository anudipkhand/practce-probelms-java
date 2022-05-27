public class ReverseNum {
    public static void main(String[] args) {
        int x=310;
        int reverse=0;
        System.out.println("Before reversing value  "+x);
        while (x!=0){
            int remainder=x%10;
            reverse = (reverse * 10) + remainder;
            x=x/10;
        }
        System.out.println("After reverse value  "+reverse);
    }
}
