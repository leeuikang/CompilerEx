package gahang;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
	boolean 	add(String e){return false;}
	void 	add(int index, String element){}
	boolean 	addAll(Collection<? extends String> c){return false;}
	boolean 	addAll(int index, Collection<? extends String> c){return false;}
	void 	clear(){}
	boolean 	contains(Object o){return false;}
	boolean 	containsAll(Collection<?> c){return false;}
	public boolean 	equals(Object o){return false;}
	String 	get(int index){return null;}
	public int 	hashCode()	{return 0;}
	int 	indexOf(Object o){return 0;}
	boolean 	isEmpty(){return false;}
	Iterator<String> 	iterator() {return null;}
	int 	lastIndexOf(Object o)	{return 0;}
	ListIterator<String> 	listIterator() {return null;}
	ListIterator<String> 	listIterator(int index) {return null;}
	String 	remove(int index)	{return null;}
	boolean 	remove(Object o) {return false;}
	boolean 	removeAll(Collection<?> c) {return false;}
	boolean 	retainAll(Collection<?> c) {return false;}
	String 	set(int index, String element) {return null;}
	int 	size() {return 0;}
	List 	subList(int fromIndex, int toIndex) {return null;}
	Object[] 	toArray() {return null;}
	<T> T[] 	toArray(T[] a) {return null;}
}
