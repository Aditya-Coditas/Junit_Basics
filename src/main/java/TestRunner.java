import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args)
    {
        Result result= JUnitCore.runClasses(FirstTestClass.class);
        for(Failure failure:result.getFailures())     //Prints the information about failed test cases
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
