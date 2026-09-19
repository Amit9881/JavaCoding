package ExceptionHandling;

public interface defaultMethod {
    void study();
//    void name(){
//        System.out.println("Error");
//    }

    default void age(){
        System.out.println("Default method");
    }


}
