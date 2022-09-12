import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import main.ExpressionSolver;
import UI.DisplayHelper;
public class CalcTest {


    private DisplayHelper Dis;

    @BeforeEach
    public void DisSetup() {Dis = new DisplayHelper();}

    private void assertDisplayIs(){
        String actual = Dis.getValue();
        Assertions.assertEquals("", actual);
    }

    //Quaternary Input, output should be base 10 for tests
    private void assertSumIs(){
        Integer actual = ExpressionSolver.sum("10","1");
        Assertions.assertEquals((Integer) 5, actual);
    }

    private void assertDiffIs(){
        Integer actual = ExpressionSolver.subtraction("10","1");
        Assertions.assertEquals((Integer) 3, actual);
    }

    private void assertMultIs(){
        Integer actual = ExpressionSolver.multiply("10","1");
        Assertions.assertEquals((Integer) 4, actual);
    }

    private void assertDivIs(){
        Integer actual = ExpressionSolver.divide("20","1");
        Assertions.assertEquals((Integer) 8, actual);
    }

    @Test
    public void testInitialValue_getDisplayIsEmpty()
    {
        assertDisplayIs();
    }

    @Test
    public void testSum(){
       assertSumIs();
    }

    @Test
    public void testDiff(){
        assertDiffIs();
    }

    @Test
    public void testMult(){
        assertMultIs();
    }

    @Test
    public void testDiv(){
        assertDivIs();
    }
}
