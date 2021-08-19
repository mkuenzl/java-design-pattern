public class SystemOptions {

    private static SystemOptions instance;

    private SystemOptions(){}

    public static SystemOptions getInstance()
    {
        if (instance == null)
        {
            instance = new SystemOptions();
        }
        return instance;
    }

    public void print()
    {
        System.out.println("Option 1 is checked, Option 2 is not checked");
    }
}
