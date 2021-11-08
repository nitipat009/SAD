package behavior;
import java.util.Comparator;
import java.util.List;

public class NameSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    @Override
    public void customSort(List<Person> people) {
        people.sort((a,b) -> a.getName().compareTo(b.getName())); // Lambda Expression
        // people.sort(new Comparator<Person>() {
        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });
    }
}
