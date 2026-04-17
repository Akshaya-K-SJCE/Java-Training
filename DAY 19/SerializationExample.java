import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable
{
    String name;
    int mark;
    Student(String name, int mark)
    {
        this.name=name;
        this.mark=mark;
    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException {
        Student s=new Student("ABC",44);
        FileOutputStream fo=new FileOutputStream("student.txt");
        ObjectOutputStream objStream=new ObjectOutputStream(fo);
        fo.close();
        objStream.close();
    }   
}
