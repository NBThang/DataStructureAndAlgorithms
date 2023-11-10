package hw6_21000705_nguyenbathang.ex1.sortedlinkpriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;
import hw6_21000705_nguyenbathang.ex1.interface_ex1.PriorityQueueInterface;

public class SortedLinkPriorityQueue <K extends Comparable<K>, E> implements PriorityQueueInterface<K, E> {
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
    private int n;

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
        K key = (K) entry.getKey();
        E value = (E) entry.getValue();

        if (isEmpty()) {
            NodeEntry<K, E> newNode = new NodeEntry<>(key, value);
            head = newNode;
            tail = newNode;
        } else {
            NodeEntry<K, E> newNode = new NodeEntry<>(key, value);
            NodeEntry<K, E> currNode = head;
            NodeEntry<K, E> prevNode = null;

            while (currNode != null && key.compareTo(currNode.getKey()) > 0) {
                prevNode = currNode;
                currNode = currNode.next;
            }

            if (prevNode == null) {
                newNode.next = head;
                head = newNode;
            } else {
                prevNode.next = newNode;
                newNode.next = currNode;
            }

            if (currNode == null) {
                tail = newNode;
            }
        }
        n++;
    }

    @Override
    public void insert(K k, E e) {
        insert(new NodeEntry<>(k, e));
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }

        NodeEntry<K, E> minNode = head;
        head = head.next;
        minNode.next = null;
        n--;

        return minNode;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }

        return head;
    }
}
