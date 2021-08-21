public class SingletonMain
{
    public static void main(String[] args) {
        SystemOptions systemOptions = SystemOptions.getInstance();
        systemOptions.print();
    }
}
