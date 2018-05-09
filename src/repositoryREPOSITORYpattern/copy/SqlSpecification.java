package repositoryREPOSITORYpattern.copy;

/**
 * @author Renjith
 * Note
https://medium.com/@krzychukosobudzki/repository-design-pattern-bc490b256006
 *
 */
public interface SqlSpecification extends Specification {
    String toSqlQuery();
}