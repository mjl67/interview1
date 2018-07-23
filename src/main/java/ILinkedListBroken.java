public class ILinkedListBroken<E> implements IList<E> {

    private static class Node<E> {
        E element;
        Node<E> nextNode;

        Node(E element) {
            this.element = element;
        }
    }

    private Node<E> h = null;
    private Node<E> t = null;
    private int s = 1;

    public ILinkedListBroken() {
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node(e);

        if (t == null) {
            t = h = newNode;
        } else {
            t.nextNode = newNode;
            t = newNode;
        }

    }

    @Override
    public E first() {
        return t == null ? null : t.element;
    }

    @Override
    public int size() {
        return s;
    }

    private class ILinkedListIterator<E> implements IIterator<E> {

        private ILinkedListBroken.Node<E> c = (Node<E>) h;

        @Override
        public boolean hasNext() {
            h = c == null ? null : h;
            return c != null;
        }

        @Override
        public E next() {
            E element = c.element;
            c = c.nextNode;
            ++s;
            return element;
        }
    }

    @Override
    public IIterator<E> iterator() {
        return new ILinkedListIterator();
    }
}
