package ict.sdj1.swing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile
{
   private File file;

   public StudentFile(String filename)
   {
      setFile(filename);
   }

   public void setFile(String filename)
   {
      file = new File(filename);
   }

   public File getFile()
   {
      return file;
   }

   public StudentList readTextFile() throws FileNotFoundException, ParseException
   {
      Scanner in = null;
      try
      {
         in = new Scanner(file);

         StudentList studentList = new StudentList();
         int lineNumber = 0;
         while (in.hasNext())
         {
            String line = in.nextLine();
            String[] lineToken = line.split(", ");
            lineNumber++;
            if (lineToken.length < 7)
            {
               throw new ParseException("Line from file in wrong format: "
                     + line, lineNumber);
            }
            int group = Integer.parseInt(lineToken[0].trim());
            int studyNumber = Integer.parseInt(lineToken[1].trim());
            String name = lineToken[2].trim();
            String nationality = lineToken[3].trim();
            int day = Integer.parseInt(lineToken[4].trim());
            //System.out.println("---> day token" + lineToken[5].trim());
            int month = Integer.parseInt(lineToken[5].trim());
            int year = Integer.parseInt(lineToken[6].trim());

            MyDate birthday = new MyDate(day, month, year);
            Student student = new Student(name, studyNumber, nationality,
                  group, birthday);

            studentList.add(student);
         }
         return studentList;
      }
      finally
      {
         in.close();
      }
   }

   public void writeTextFile(StudentList students)
         throws FileNotFoundException
   {
      PrintWriter out = null;
      try
      {
         out = new PrintWriter(file);
         for (int i = 0; i < students.size(); i++)
         {
            out.println(students.get(i).getStudyNumber() + ", "
                  + students.get(i).getName() + ", "
                  + students.get(i).getBirthday().starsign() + ", "
                  + students.get(i).getBirthday().starsignElement());
         }
         out.flush();
      }
      finally
      {
         out.close();
      }
   }
   public void writeTextFile(StudentList students, String filename)
         throws FileNotFoundException
   {
      setFile(filename);
      writeTextFile(students);
   }
   public void writeBinaryFile(StudentList list) throws IOException
   {
      ObjectOutputStream out = null;
      try
      {
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);

         out.writeObject(list);
      }
      finally
      {
         out.close();
      }
   }

   public void writeBinaryFile(StudentList list, String filename)
         throws IOException
   {
      setFile(filename);
      writeBinaryFile(list);
   }

   public StudentList readBinaryFile() throws IOException, ClassNotFoundException
   {
      ObjectInputStream in = null;
      try
      {
         FileInputStream fileInStream = new FileInputStream(file);
         in = new ObjectInputStream(fileInStream);

         StudentList list = (StudentList) in.readObject();
         return list;
      }
      finally
      {
         in.close();
      }

   }

   public StudentList readBinaryFile(String filename) throws IOException,
         ClassNotFoundException
   {
      setFile(filename);
      return readBinaryFile();
   }

}
