/*
 * Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package edu.vinni.study.collections;

public interface List<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    void add(E e);

    boolean remove(Object o);

    void clear();

    int indexOf(Object o);

    void add(int index, E element);

    E set(int index, E element);

    E get(int index);

    E remove(int index);
}
