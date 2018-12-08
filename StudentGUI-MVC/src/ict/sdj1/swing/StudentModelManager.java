package ict.sdj1.swing;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class StudentModelManager
{
   private StudentList list;
   private StudentFile file;
   private static final String FILENAME = "Students.txt";

   public StudentModelManager()
   {
      try
      {
         file = new StudentFile(FILENAME);

         list = file.readTextFile();
         list.sortByName();
      }
      catch (ParseException | FileNotFoundException e)
      {
         list = new StudentList();
      }
   }

   public int getSize()
   {
      return list.size();
   }

   public Student getStudent(int index)
   {
      return list.get(index);
   }

   public Student removeStudent(int index)
   {
      Student s = getStudent(index);
      list.remove(index);
      return s;
   }

   public void addStudent(Student student)
   {
      list.add(student);
      list.sortByName();
   }

   public StudentList getStudentsByGroup(int group)
   {
      return list.getByGroup(group);
   }

   public StudentList getStudentsByStarSign(String starSign)
   {
      return list.getByStarsign(starSign);
   }

   public StudentList getStudentsByNationality(String nationality)
   {
      return list.getByNationality(nationality);
   }

   public String toString()
   {
      return list.toString();
   }

}
