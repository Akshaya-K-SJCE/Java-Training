import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    public int compareTo(Student s)
    {
        return s.mark=this.mark;
    }
    public String toString()
    {
        return name+" "+mark;
    }
}
public class ComparableExample  {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student("A", 70));
        s.add(new Student("B", 75));
        s.add(new Student("C", 80));
        s.add(new Student("D", 85));
        Collections.sort(s);
        for(Student st:s)
        {
            System.out.println(st.name+" "+st.mark);
        }
        System.out.println(s);
   
    }
    
}
