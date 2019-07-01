import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTestClass{
    private static Calculation cal;
    private static int c,e;

    @BeforeClass
    public static void initClass()
    {
          c=0;
          e=0;
         cal=new Calculation();
         System.out.println("Creating the object of calculation");
    }

    @Test
    public void sumOfDigit()
    {
        e++;
        cal.setNum(12389);
        assertEquals(cal.sumOfDigit(),23);
        System.out.println("The Sum of digit is "+cal.sumOfDigit());
        c++;
    }

    @Test
    public void checkString()
    {
        e++;
        assertEquals("abcd","abcd");
        System.out.println("Both the strings are equals");
        c++;
    }

    @Test
    public void checkNum()
    {
        e++;
        String str="20";
        assertTrue(str.matches(".*\\d.*"));
        System.out.println("The given String is digit");
        c++;
    }

    @Test
    public void checkNotNull()
    {
        e++;
        String str="  ";
        assertNotNull(str);
        System.out.println("The String is not null");
        c++;
    }

    @Test
    public void MaxNum()
    {
        e++;
        int a[]={1,2,88,19,96,123};
        assertNotEquals(cal.maxNum(a),123);
        System.out.println("The maimum no is "+cal.maxNum(a));
        c++;
    }

    @Test
    public void isNumPositive()
    {
        e++;
        assertTrue(cal.isPositive(-10));
        System.out.println("no is Positive");
        c++;
    }

    @Test
    public void isNumNegative()
    {
        e++;
        assertFalse(cal.isPositive(11));
        System.out.println("no is negative");
        c++;
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("there are "+e+" Test cases");
        System.out.println("Passed Test Cases are "+c);
        System.out.println("Failed Test Cases are "+(e-c));
    }
}
