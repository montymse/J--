package junit;

import junit.framework.TestCase;
import pass.LeftShiftSigned;

public class LeftShiftSignedTest extends TestCase {
    private LeftShiftSigned lshift;

    protected void setUp() throws Exception {
        super.setUp();
        lshift = new LeftShiftSigned();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLEFTSHIFT() {
        this.assertEquals(lshift.GetLS(1, 3), 8);
        this.assertEquals(lshift.GetLS(5, 7), 640);
        this.assertEquals(lshift.GetLS(127, 3), 1016);
    }
}