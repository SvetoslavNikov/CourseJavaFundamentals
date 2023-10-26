package objectsAndClasses.Lab;

public class student {
    private String name;
    private int age;
    private String city;

    public student(){

    }
    public student(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }
    public int getAge(){
        return age;
    }
}
