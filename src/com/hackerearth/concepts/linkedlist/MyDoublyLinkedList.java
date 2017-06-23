package com.hackerearth.concepts.linkedlist;

/**
 * Created by Sai Upadhyayula on 4/3/2017.
 */
public class MyDoublyLinkedList<T> implements MyListADT<T> {

    private int currentSize;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public boolean remove(T e) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public void print() {

    }

    public void printBackwards(){

    }
}
