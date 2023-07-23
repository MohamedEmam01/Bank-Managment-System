/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmangmentsystem;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/**
 *
 * @author Mohamed
 */
public class MyArrayList<T>implements List<T> {
    
    T[] items;
    int ic = 1000;
    int size = 0;

    public MyArrayList() {
        items = (T[]) new Object[ic];
        size = 0;
    }

    @Override
    public int size() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return size;
    }

    @Override
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (T e : items) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        T[] copy = Arrays.copyOf(items, size);
        return Arrays.asList(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        T[] copy = Arrays.copyOf(items, size);
        return copy;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(T e) {
        checkcapacty(1);
        items[size] = e;
        size++;
        checkcapacty(1);
        return true;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkcapacty(int i) {
        if (size == ic) {
            ic = ic * 2 > ic + i ? ic * 2 : ic + i;
            T[] run = (T[]) new Object[ic];
            System.arraycopy(items, 0, run, 0, size);
            items = run;
        }
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        } else {
            for (int i = index; i < size; i++) {
                items[index] = items[index + 1];
            }
            size--;
            return true;
        }
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> list) {
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (T e : list) {
            add(e);
        }
        return true;

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> list) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        checkcapacty(list.size());
        for (int i = size - 1; i >= index; i--) {
            items[i + list.size()] = items[i];
        }
        for (T e : list) {
            items[index] = e;
            index++;
        }
        size += list.size();
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean b = false;
        for (Object e : list) {
            b = remove(e);
        }
        return b;
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void replaceAll(UnaryOperator<T> uo) {
        List.super.replaceAll(uo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Comparator<? super T> cmprtr) {
        List.super.sort(cmprtr); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public T get(int i) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return i < size ? items[i] : null;

    }

    @Override
    public T set(int i, T e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        T last = items[i];
        if (i < size) {
            items[i] = e;
        } else {
            checkcapacty(i - size);
            items[i] = e;
            size += i;
        }
        return last;

    }

    @Override
    public void add(int index, T e) {
        for (int i = size - 1; i >= i; i--) {
            items[i + 1] = items[i];
            items[index] = e;
            size++;
        }

//   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < size) {
            T r = items[index];
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            size--;
            return r;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < size; i++) {
            if (o.equals(items[i])) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public int lastIndexOf(Object o) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = size - 1; i > 0; i--) {
            if (o.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        T[] copy = Arrays.copyOf(items, size);
        return Arrays.asList(copy).listIterator(i);

    }

    @Override
    public List<T> subList(int i, int i1) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (i > 0 && i1 < size) {
            T[] copy = Arrays.copyOfRange(items, i, i1);
            return Arrays.asList(copy);
        }
        throw new ArrayIndexOutOfBoundsException();

    }

}
