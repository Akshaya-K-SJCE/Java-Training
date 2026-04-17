import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fi= new FileInputStream("Student.txt");
        ObjectInputStream ObjStream=new ObjectInputStream(fi);
        //Student s=(Student)ObjStream.readObject();
        while(true)
        {
            try
            {
                Student s=(Student) ObjStream.readObject();
                System.out.println(s.name+" "+s.mark);
            }
            catch(EOFException e){
                //e.printStackTrace();
                break;
            }
        }
        fi.close();
        ObjStream.close();
    }
}