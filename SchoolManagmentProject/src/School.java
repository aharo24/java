import java.util.List;

public class School
{
    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
    private int TotalMoneySpend;

    public School(List<Teacher> teacher, List<Student> student)
    {
        this.teacher = teacher;
        this.student = student;

        totalMoneyEarned =0;
        totalMoneyEarned=0;
    }


    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpend() {
        return TotalMoneySpend;
    }

    public void updateTotalMoneySpend(int totalMoneySpend) {
        totalMoneyEarned -= totalMoneySpend;
    }

}
