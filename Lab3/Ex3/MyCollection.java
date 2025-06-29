package Ex3;

public interface MyCollection<E> {
    int size();
    boolean isEmpty();
    boolean contains(E element);
    boolean add(E element);
    boolean remove(E element);
    void clear();
}

// Simple implementation using an array
class MyCollectionImpl<E> implements MyCollection<E> {
    private Object[] data = new Object[100];
    private int count = 0;

    public int size() { return count; }
    public boolean isEmpty() { return count == 0; }
    public boolean contains(E element) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(element)) return true;
        }
        return false;
    }
    public boolean add(E element) {
        if (count < data.length) {
            data[count++] = element;
            return true;
        }
        return false;
    }
    public boolean remove(E element) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(element)) {
                for (int j = i; j < count - 1; j++) {
                    data[j] = data[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
    public void clear() { count = 0; }
}