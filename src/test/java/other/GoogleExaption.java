package other;

public class GoogleExaption extends RuntimeException{
    public GoogleExaption (String massege, Throwable e) {
        System.out.println("HI, tut oshibka");
        System.out.println(e.getMessage());
    }
}
