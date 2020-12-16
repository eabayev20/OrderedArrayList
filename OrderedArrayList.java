public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList (T startingCapacity) {
    super( startingCapacity);
  }
  public int findIndex(T ne) {
    for (int i = 0; i < size(); i++) {
      if (ne.compareTo(this.get(i)) < 0) {
        return i;
      }
    }
    return size();
  }
  public void add(int index, T ne) {
    int index1 = findIndex(ne);
    super.add(index1, ne);

  }
  public boolean add(T ne) {
    int index = findIndex(ne);
    super.add(index, ne);
    return this.get(index) == ne;
  }
  public T set(int index, T value) {
    T ans = get(index);
    super.remove(index);
    super.add(index, value);
    return ans;
  }



}
