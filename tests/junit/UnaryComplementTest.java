package junit;

import junit.framework.TestCase;
import pass.UnaryComplement;

public class UnaryComplementTest extends TestCase {
    private UnaryComplement uc;

    protected void setUp() throws Exception {
        super.setUp();
        uc = new UnaryComplement();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testNOT() {
        this.assertEquals(uc.Get(3), -3);
        this.assertEquals(uc.Get(7), -7);
        this.assertEquals(uc.Get(0), 0);
    }
}