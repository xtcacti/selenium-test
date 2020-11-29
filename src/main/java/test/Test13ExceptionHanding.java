package test;

public class Test13ExceptionHanding {

/*    public static void main(String[] args) {
        try{
            System.out.println("Hello World...");
            int i = 1/0;
            System.out.println("Completed");
        }catch (Exception e){
            System.out.println("inside catch block");
            System.out.println("Message is:" + e.getMessage());
            System.out.println("Cause is:" + e.getCause());
            e.printStackTrace();
        }finally {
            System.out.println("inside finally block");
        }
    }*/

    /*public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo() throws Exception{
        System.out.println("Hello World...");
        int i = 1 / 0;
        System.out.println("Completed");
    }*/

    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo() throws Exception {
        System.out.println("Hello World...");
        throw new ArithmeticException("not a valid opration");
//        int i = 1 / 0;
//        System.out.println("Completed");
    }
}
