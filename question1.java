import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Create an array list of Students (with fields such as name, USN, Dept, section,
//CGPA). Search for the students with CGPA > 8.5. Print the student details
//belonging to ‘ISE’ department. Print students belonging to ‘C’ section. Use
//Iterator to iterate through the list.
public class question1 {
    static  class Student{
        String name;
        String usn;
        String dept;
        char sec;
        double cgpa;
        Student(String name,String usn,String dept, char sec,double cgpa){
            this.name=name;
            this.cgpa=cgpa;
            this.dept=dept;
            this.sec=sec;
            this.usn=usn;
        }
        public String getName(){
            return this.name;
        }
        public String getUsn(){
            return this.usn;
        }
        public String getDept(){
            return this.dept;
        }
        public double getCgpa(){
            return this.cgpa;
        }

        public char getSec() {
            return this.sec;
        }

        public String toString(){
            return "Name :"+this.name+" Usn: "+this.usn+" dept: "+this.dept+" cgpa: "+this.cgpa+" sec: "+this.sec;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        List<Student> studentList=new ArrayList<Student>();
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("enter student "+i+" details");
            System.out.println("enter the name");
            String name= sc.next();
            System.out.println("enter sec");
            char sec= sc.next().charAt(0);
            System.out.println("enter usn");
            String usn= sc.next();
            System.out.println("enter dept");
            String dept= sc.next();
            System.out.println("enter cgpa");
            double cgpa= sc.nextDouble();
            Student student=new Student(name,usn,dept,sec,cgpa);
            studentList.add(student);
        }

        Iterator<Student> studentIterator= studentList.iterator();
        int count=0;
        while (studentIterator.hasNext()){
            count++;
            System.out.println("student "+count);
            System.out.println(studentIterator.next());
        }
        System.out.println();
        System.out.println("student with cgpa greater than 8.5 are ");
        studentIterator= studentList.iterator();
        while (studentIterator.hasNext()){
            Student student=studentIterator.next();
            if (student.cgpa>8.5){
                System.out.println(student  );
            }
        }
        System.out.println();
        System.out.println("student belonging to ise dept");
        studentIterator=studentList.iterator();
        while (studentIterator.hasNext()){
            Student student=studentIterator.next();
            if (student.dept.equalsIgnoreCase("ISE")){
                System.out.println(student);
            }
        }
        System.out.println();
        System.out.println("students belonging to c section are");
        studentIterator=studentList.iterator();
        while (studentIterator.hasNext()){
            Student student=studentIterator.next();
            if (student.getSec()=='C'||student.getSec()=='c'){
                System.out.println(student);
            }
        }

    }
}
