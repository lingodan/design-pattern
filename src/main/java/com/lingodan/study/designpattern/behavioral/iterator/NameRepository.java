package com.lingodan.study.designpattern.behavioral.iterator;

/**
 * @author lingodan
 * Created on 2020/6/2 22:48.
 */
public class NameRepository implements Container {

    private String[] names = {"Robert", "Kobe", "James", "Jordan", "Bird"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
