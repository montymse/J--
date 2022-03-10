package junit;

import junit.framework.TestCase;
import pass.RightShiftUnsigned;

public class RightShiftUnsignedTest extends TestCase {
    private RightShiftUnsigned rshift;

    protected void setUp() throws Exception {
        super.setUp();
        rshift = new RightShiftUnsigned();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testRIGHTUSHIFT() {
        this.assertEquals(rshift.GetURS(1, 3), 0);
        this.assertEquals(rshift.GetURS(74, 5), 2);
        this.assertEquals(rshift.GetURS(0, 0), 0);
    }
}