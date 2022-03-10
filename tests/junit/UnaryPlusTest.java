package junit;

import junit.framework.TestCase;
import pass.UnaryPlus;

public class UnaryPlusTest extends TestCase {
    private UnaryPlus up;

    protected void setUp() throws Exception {
        super.setUp();
        up = new UnaryPlus();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testUnaryPLus() {
        this.assertEquals(up.Get(3), 3);
        this.assertEquals(up.Get(-4), 4);
        this.assertEquals(up.Get(7), 7);
        this.assertEquals(up.Get(0), 0);
    }
}