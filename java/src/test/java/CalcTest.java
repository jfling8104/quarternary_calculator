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
    public void DisSetup() {Dis = new DisplayHelper(); }

    private void assertDisplayIs(String expected){
        String actual = Dis.getValue();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInitialValue_getDisplayIsEmpty()
    {
        assertDisplayIs("");
    }
}
