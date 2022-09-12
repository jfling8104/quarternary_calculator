import UI.Application;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import main.ExpressionSolver;
import UI.DisplayHelper;
import UI.Application;
public class CalcTest {

    private ExpressionSolver calculate;
    private DisplayHelper Dis;

    @BeforeEach
    public void DisSetup() {Dis = new DisplayHelper();}

    private void assertDisplayIs(String expected){
        String actual = Dis.getValue();
        Assertions.assertEquals(expected, actual);
    }

    //Quaternary Input, output should be base 10 for tests
    private void assertSumIs(Integer expected){
        Integer actual = calculate.sum("10","1");
        Assertions.assertEquals(expected, actual);
    }

    private void assertDiffIs(Integer expected){
        Integer actual = calculate.subtraction("10","1");
        Assertions.assertEquals(expected, actual);
    }

    private void assertMultIs(Integer expected){
        Integer actual = calculate.multiply("10","1");
        Assertions.assertEquals(expected, actual);
    }

    private void assertDivIs(Integer expected){
        Integer actual = calculate.divide("20","1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInitialValue_getDisplayIsEmpty()
    {
        assertDisplayIs("");
    }

    @Test
    public void testSum(){
       assertSumIs(5);
    }

    @Test
    public void testDiff(){
        assertDiffIs(3);
    }

    @Test
    public void testMult(){
        assertMultIs(4);
    }

    @Test
    public void testDiv(){
        assertDivIs(8);
    }
}
