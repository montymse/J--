package junit;

import junit.framework.TestCase;
import pass.ExclusiveOr;

public class ExclusiveOrTest extends TestCase {
    private ExclusiveOr xor;

    protected void setUp() throws Exception {
        super.setUp();
        xor = new ExclusiveOr();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testXOR() {
        this.assertEquals(xor.XOR(0, 0), 0);
        this.assertEquals(xor.XOR(5, 7), 2);
        this.assertEquals(xor.XOR(127, 3), 124);
    }
}