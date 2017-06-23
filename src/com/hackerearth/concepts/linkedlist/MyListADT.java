package com.hackerearth.concepts.linkedlist;

/**
 * Created by Sai Upadhyayula on 4/3/2017.
 */
public interface MyListADT<T> {
    int size();
    boolean isEmpty();
    boolean add(T e);
    boolean remove(T e);
    void clear();
    T remove(int index);
    void add(int index, T element);
    void print();
}
