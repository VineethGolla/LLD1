package LambdasStreams;

import java.util.Comparator;

public class StudentComparator implements Comparator<Studentqueues> {
    @Override
    public int compare(Studentqueues a, Studentqueues b)
    {
        return a.name.compareTo(b.name);
    }
}
