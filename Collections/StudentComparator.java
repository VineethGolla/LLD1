package Collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Studentqueues> {

    //custom ordering, takes 2 arguments from cien
    @Override
    public int compare(Studentqueues a, Studentqueues b)
    {
        return a.name.compareTo(b.name);
    }
}
