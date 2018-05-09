package repositoryREPOSITORYpattern.copy;

/**
 * @author Renjith
 * Note
https://medium.com/@krzychukosobudzki/repository-design-pattern-bc490b256006
 *
 */
public interface Repository<T> {
    void add(T item);

    void update(T item);

    void remove(T item);

   // List<T> query(Specification specification);
}
