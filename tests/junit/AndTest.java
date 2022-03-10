package junit;

import junit.framework.TestCase;
import pass.ANDpass;

public class AndTest extends TestCase {
    private ANDpass and;

    protected void setUp() throws Exception {
        super.setUp();
        and = new ANDpass();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAnd() {
        this.assertEquals(and.GetAnd(0, 0), 0);
        this.assertEquals(and.GetAnd(5, 7), 5);
        this.assertEquals(and.GetAnd(127, 3), 3);
    }
}