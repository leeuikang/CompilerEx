package lib;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<String>{
	boolean	add(String e) { return false;}
	
	void add(int index, String element) {}
	
	boolean	addAll(Collection<? extends String> c) { return false;}
	
	boolean	addAll(int index, Collection<? extends String> c) { return false;}
	
	void clear() {}
	
	protected Object	clone() { return null;}
	
	boolean	contains(Object o) { return false;}
	
	void ensureCapacity(int minCapacity) {}
	
	String get(int index) { return null;} 
	
	int	indexOf(Object o) { return 0;}
	
	boolean	isEmpty() { return false;}
	
	Iterator<String> iterator() { return null;}
	
	int	lastIndexOf(Object o) { return 0;}
	
	ListIterator<String> listIterator() {return null;}
	
	ListIterator<String> listIterator(int index) { return null;}
	
	String	remove(int index) { return null;}
	
	boolean	remove(Object o) { return false;}
	
	boolean	removeAll(Collection<?> c) { return false;}
	
	protected void	removeRange(int fromIndex, int toIndex) {}
	
	boolean	retainAll(Collection<?> c) { return false;}
	
	String	set(int index, String element) { return element;}
	
	int	size() { return 0;}
	
	List<String>	subList(int fromIndex, int toIndex) { return null;}
	Object[]	toArray() { return null;}

	<T> T[]	toArray(T[] a) { return a;}
	
	void	trimToSize() {}
}
