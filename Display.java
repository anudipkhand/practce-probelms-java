public class Display {
    public static void main(String[] args) {
        int one = 1;
        int ten = 10;
        int hundred = 100;
        int thousand = 1000;

        switch (one) {
            case 1:
                System.out.println("one");
            case 10:
                System.out.println("ten");
            case 100:
                System.out.println("hundred");
            case 1000:
                System.out.println("thousand");
            default: System.out.println("Invalid Input");
        }
    }
}

