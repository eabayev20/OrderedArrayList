public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList (int startingCapacity) {
    super(startingCapacity);
  }
  public int findIndex(T newVal) {
    for (int i = 0; i < size(); i++) {
      if (newVal.compareTo(this.get(i)) < 0) {
        return i;
      }
    }
    return size();
  }



}
