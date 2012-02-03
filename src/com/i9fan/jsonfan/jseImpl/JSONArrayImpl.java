package com.i9fan.jsonfan.jseImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.i9fan.jsonfan.interfaces.JSONArray;

@SuppressWarnings("rawtypes")
public class JSONArrayImpl extends JSONValueImpl implements List, JSONArray {

	List lista = new ArrayList();
	
	
	@Override
	public JSONArray isArray() {
		return this;
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return lista.contains(o);
	}

	@Override
	public Iterator iterator() {
		return lista.iterator();
	}

	@Override
	public Object[] toArray() {
		return lista.toArray();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(Object[] a) {
		return lista.toArray(a);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object e) {
		return lista.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return lista.remove(o);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean containsAll( Collection c) {
		return lista.containsAll(c);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean addAll( Collection c) {
		return lista.addAll(c);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean addAll(int index, Collection c) {
		return lista.addAll(index, c);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean removeAll(Collection c) {
		return lista.removeAll(c);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean retainAll(Collection c) {
		return lista.removeAll(c);
	}

	@Override
	public void clear() {
		lista.clear();
	}

	@Override
	public Object get(int index) {
		return lista.get(index);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(int index, Object element) {
		return lista.set(index, element);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, Object element) {
		lista.add(index, element);
		
	}

	@Override
	public Object remove(int index) {
		return lista.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return lista.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return lista.lastIndexOf(o);
	}

	@Override
	public ListIterator listIterator() {
		return lista.listIterator();
	}

	@Override
	public ListIterator listIterator(int index) {
		return lista.listIterator(index);
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		return lista.subList(fromIndex, toIndex);
	}


}
