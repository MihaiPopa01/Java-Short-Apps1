package homeworkJava_1_18_;

import java.util.Comparator;

public class SortByGrade implements Comparator<Student> {
    // Used for sorting in ascending order of grade
    public int compare(Student s1, Student s2)
    {
        return s1.getGrade() - s2.getGrade();
    }
}