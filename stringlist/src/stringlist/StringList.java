package stringlist;

import java.util.Arrays;
import java.util.Iterator;

public class StringList implements Iterable<String>
{
    private String[] _array = new String[10];
    private int _length;

    @Override
    public Iterator<String> iterator()
    {
        return new StringListIterator();
    }

    private class StringListIterator implements Iterator<String>
    {
        private int _index = 0;

        @Override
        public boolean hasNext()
        {
            return _index < _length;
        }

        @Override
        public String next()
        {
            return _array[_index++];
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }

    public int length()
    {
        return _length;
    }

    public String get(int index)
    {
        checkIndex(index);
        return _array[index];
    }

    public void add(String element)
    {
        ensureCapacity();
        _array[_length] = element;
        ++_length;
    }

    public void remove(int index)
    {
        checkIndex(index);
        int next = index + 1;
        System.arraycopy(_array, next, _array, index, _length - next);
        --_length;
        _array[_length] = null;
    }

    private void ensureCapacity()
    {
        if (capacityExhausted())
        {
            doubleCapacity();
        }
    }

    private boolean capacityExhausted()
    {
        return _length == _array.length;
    }

    private void doubleCapacity()
    {
        _array = Arrays.copyOf(_array, 2 * _length);
    }

    private void checkIndex(int index)
    {
        if (index < 0) throw new IndexOutOfBoundsException(index + " < 0");
        if (index >= _length)
            throw new IndexOutOfBoundsException(index + " >= " + _length);
    }
}
