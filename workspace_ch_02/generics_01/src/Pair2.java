
public class Pair2<T, S> {

	private T first;
	private S second;
	
	public Pair2() {};
	
	public Pair2(T first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() { return first; }
	
	public S getSecond() { return second; }
	
	public void setFirst(T newValue) { this.first = newValue; }
	
	public void setSecond(S newValue) { this.second = newValue; }
	
}
