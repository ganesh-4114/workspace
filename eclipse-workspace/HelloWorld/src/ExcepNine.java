public class ExcepNine {
    public static void main(String[] args) {
        try {
            Class.forName("sample.tool.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + e);
        }
    }
}