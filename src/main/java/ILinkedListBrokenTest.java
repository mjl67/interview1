/**
 * Created by LESSACHM on 16/09/2016.
 */
public class ILinkedListBrokenTest extends IListTestBase {
    @Override
    protected IList<Integer> getInstance() {
        return new ILinkedListBroken<Integer>();
    }
}
