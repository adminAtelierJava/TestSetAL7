import java.util.Comparator;

public class TriId implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.getId()-o2.getId();
    }
}
