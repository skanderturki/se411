
public class Pair<T> {

	private T first;
	private T second;
	
	public Pair() {};
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() { return first; }
	
	public T getSecond() { return second; }
	
	public void setFirst(T newValue) { this.first = newValue; }
	
	public void setSecond(T newValue) { this.second = newValue; }
	
	
}
