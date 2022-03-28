package Others2;

public class Main2 {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
        }catch (ArithmeticException e){}
        catch (Exception e){}
        finally{
            System.out.println("This is finally");
        }
    }
}
