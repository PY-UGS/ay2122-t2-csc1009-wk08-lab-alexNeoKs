public class Main {
    public static void main(String[] args) throws Exception
    {
        CircleWithException newobj = new CircleWithException(2);

        try
        {
            newobj.getRadius();
            newobj.setRadius(-20);
            newobj.setRadius(2000);
            newobj.getArea();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}
