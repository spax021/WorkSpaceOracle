package l12Generics;

import java.util.ArrayList;
import java.util.List;

public class Pair <K, V> {

	private K key;
	private V value;
	
	public Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
	
	public static <K, V> boolean compare(Pair <K, V> p1, Pair <K, V> p2){
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
//	 --------------------------------------------------------------------
	
	
	public interface Comparable<T>{
		public int compareTo(T o);
	}
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem){
		int brojac = 0;
		for(T e : anArray){
			if(e.compareTo(elem) > 0)
				++brojac;
		}
		return brojac;
	}
	
	
	public static void main(String[] args) {
 
		Pair<Integer, String> p1 = new Pair<>(2, "Apple");
		Pair<Integer, String> p2 = new Pair<>(1, "Apple");
//		p1.setKey(1); //ako bi se nesto dodatno menjalo
		
		if(Pair.compare(p1, p2)){
			System.out.println("Jednaki su");
		}else{
			System.out.println("Nesto se razlikuje");
		}
		
	}

}
