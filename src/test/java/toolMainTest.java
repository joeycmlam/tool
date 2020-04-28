import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class toolMainTest {

    final toolMain a = new toolMain();
    @Before
    public void setup() {

    }

    @Test
    public void calcParenthesesCase1() {
        final String input = "()()";
        final int expValue = 0;


        final int actValue = a.calcParentheses(input);
        Assert.assertEquals(expValue, actValue);


    }

    @Test
    public void calcParenthesesCase2() {
        final String input = "()))";
        final int expValue = 2;


        final int actValue = a.calcParentheses(input);
        Assert.assertEquals(expValue, actValue);
    }
}