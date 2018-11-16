package controller;

import java.util.List;

public interface Controller<T> {
    void add(T t);

    T get(long id);

    List<T> getAll();

    void update(T t);

    void remove(T t);
}