
class SampleClass {
    int age;
 
    SampleClass(int age) {
    }
}
 
 
public class ExcepEight {
    public static void main(String[] args) {
        try {
            String propertyName = "name";
            SampleClass.class.getDeclaredField(propertyName);
        } catch (NoSuchFieldException e) {
            System.out.println("No such Field" + e);
        }
    }
}