public class Polindrome {
    public static void main(String[] args) {
        int remainder=0;
        int x=45;
        int temp;
        int reverse=0;
        temp=x;
        for (; x !=0 ;x=x/10) {
            remainder=x%10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println(reverse);
        if(temp==reverse){
            System.out.println("It is a Polindrome");
        }else{
            System.out.println("It is not a polindrome number");
        }
    }
}
