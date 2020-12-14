import java.util.ArrayList;
public class NoNullArrayList,T> extends ArrayList<T> {

  public void add(int index, T element) {
    try {
      if (element == null) {
        throw new IllegalArgumentException("Null, Error");
      }
      super.add(index, element);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Null, Error");
    }

  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Null, Error")
    }
    super.add(element);
    return true;
  }

  public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Null, Error");
    }
    T temp = element;
    super.add(index, element);
    return temp;
  }

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(T startingCapacity) {
    super();
    if (startingCapacity == null) {
      throw new IllegalArgumentException("Null, Error");
    }
  }

}
