
public interface Collection<T> {

	public void add(T element);
	public void addAll(Collection<T> elements);
	
	public boolean remove(T element);
	
	public void clear();
	public boolean has(T element);
	
	public boolean isEmpty();
	public int size();
	
}
