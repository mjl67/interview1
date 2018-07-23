/**
 * Created by LESSACHM on 15/09/2016.
 */
public interface IList<E> {
    void add(E e);
    E first();
    int size();
    IIterator<E> iterator();

}
