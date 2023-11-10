package hw6_21000705_nguyenbathang.ex1.unsortedlinkedpriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;
import hw6_21000705_nguyenbathang.ex1.interface_ex1.PriorityQueueInterface;


public class UnsortedLinkedPriorityQueue <K extends Comparable, E> implements PriorityQueueInterface {
    protected class NodeEntry<K, E> implements Entry<K, E> {
        private K key;
        private E element;
        private NodeEntry<K, E> next;
        public NodeEntry (K k, E e) {
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public E getValue() {
            return this.element;
        }
    }
    private NodeEntry<K, E> head;
    private NodeEntry<K, E> tail;
    int n = 0;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void insert(Entry entry) {
        NodeEntry<K, E> newNode = new NodeEntry<>((K) entry.getKey(), (E) entry.getValue());
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        insert(new NodeEntry(o, o2));
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        } else if (n == 1) {
            Entry<K, E> min = head;
            head = null;
            tail = null;
            n--;
            return min;
        } else {
            NodeEntry<K, E> current = head;
            NodeEntry<K, E> prev = null;
            NodeEntry<K, E> minNode = head;

            while (current != null) {
                if (current.getKey().compareTo(minNode.getKey()) < 0) {
                    minNode = current;
                    prev = prev;
                }
                prev = current;
                current = current.next;
            }
            if (minNode == head) {
                head = head.next;
            } else {
                prev.next = minNode.next;
            }

            minNode.next = null;
            n--;

            return minNode;
        }
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        } else {
            NodeEntry<K, E> current = head;
            NodeEntry<K, E> minNode = head;

            while (current != null) {
                if (current.getKey().compareTo(minNode.getKey()) < 0) {
                    minNode = current;
                }
                current = current.next;
            }

            return minNode;
        }
    }
}
