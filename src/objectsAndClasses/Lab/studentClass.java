package objectsAndClasses.Lab;

public class studentClass {
    private String studentName;

    private int studentAge;
    private String studentCity;

    public void studentClass() {

    }

    public void studentClass(String name, int age, String city) {
        this.studentName = name;
        this.studentCity = city;
        this.studentAge = age;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int age) {
        this.studentAge = age;
    }

    public void setStudentCity(String city) {
        this.studentCity = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentCity() {
        return studentCity;
    }

}
