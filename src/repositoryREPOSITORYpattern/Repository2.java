package repositoryREPOSITORYpattern;

/**
 * @author Renjith
 * Note
https://medium.com/@krzychukosobudzki/repository-design-pattern-bc490b256006
 *
 */
public interface Repository2<T> {
    void add(T item);

    void add(Iterable<T> items);

    void update(T item);

    void remove(T item);

    void remove(Specification specification);

  //  List<T> query(Specification specification);
}