package com.ynm.gms.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther Yogesh Manware
 */
public class LRUCache2<K, V> {

    private int capacity;
    private Map<K, Node<K, V>> map;

    private Node<K, V> head;
    private Node<K, V> tail;

    public boolean containsKey(K a) {
        return this.map.containsKey(a);
    }

    public int size() {
        return this.map.size();
    }

    class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node<K, V> previous;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache2(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException("invalid capacity");
        }
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
    }

    // getter
    // move element at the end of list
    public Node<K, V> get(K key) {
        if (map.containsKey(key)) {
            Node node = removeElement(key);
            aadElement(node);
        }
        return null;
    }

    public void put(K key, V value) {
        Node<K, V> node = new Node(key, value);
        if (map.isEmpty()) {
            head = node;
            tail = node;
            map.put(node.key, node);
            return;
        }
        if (map.containsKey(key)) {
            removeElement(key);
        }
        if (map.size() > capacity - 1) {
            removeElement(head.key);
        }
        aadElement(node);
    }


    protected void aadElement(Node<K, V> node) {
        node.previous = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        map.put(node.key, node);
    }

    protected Node removeElement(K key) {
        Node node = map.remove(key);
        if (node.equals(head)) {
            node.next.previous = null;
            head = node.next;
        } else if (node.equals(tail)) {
            //do nothing
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        return node;
    }
}
