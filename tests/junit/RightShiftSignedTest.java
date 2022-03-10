package junit;

import junit.framework.TestCase;
import pass.RightShiftSigned;

public class RightShiftSignedTest extends TestCase {
    private RightShiftSigned rshift;

    protected void setUp() throws Exception {
        super.setUp();
        rshift = new RightShiftSigned();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testRIGHTSHIFT() {
        this.assertEquals(rshift.GetRS(1, 3), 0);
        this.assertEquals(rshift.GetRS(74, 5), 2);
        this.assertEquals(rshift.GetRS(0, 0), 0);
    }
}