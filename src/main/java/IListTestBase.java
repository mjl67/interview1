import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class IListTestBase {

    private IList<Integer> instance;

    // Returns empty list
    abstract protected IList<Integer> getInstance();

    @Before
    public void setUp() {
        instance = getInstance();
    }

    @Test
    public void testEmptyList() {
        // Test everything about an empty list.
        fail();
    }

    @Test
    public void testOneElementList() {
        // Add 1 element to the list and test everything about it.
        fail();
    }

    @Test
    public void test10ElementList() {
        // Add 10 elements to the list and test everything about it.
        fail();
    }
}
