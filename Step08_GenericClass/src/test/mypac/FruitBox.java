 package test.mypac;

public class FruitBox<T> {
	
	public T item;
	
	public void setItem(T item) {
		this.item=item;
	}
	
	public T getItem() {
		
		return this.item;
	}
}
