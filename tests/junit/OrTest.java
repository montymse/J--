package junit;

import junit.framework.TestCase;
import pass.Orpass;

public class OrTest extends TestCase {
    private Orpass or;

    protected void setUp() throws Exception {
        super.setUp();
        or = new Orpass();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAnd() {
        this.assertEquals(or.GetOr(0, 0), 0);
        this.assertEquals(or.GetOr(5, 7), 7);
        this.assertEquals(or.GetOr(127, 3), 127);
    }
}