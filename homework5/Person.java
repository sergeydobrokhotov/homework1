package geekbrains.homework1.homework5;

public class Person {
    private String fio;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;
    Person(String fio, String post, String email, String phone, double salary, int age) {

        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        }

    public String toString() {
        return "Person fio = '" + getFio() + "' \n" +
                "  post = '" + getPost() + '\'' +
                ", email = '"  + getEmail() + '\'' +
                ", phone = '" + getPhone() + '\'' +
                ", salary = " + getSalary() +
                ", age = " + getAge() + "\n";
    }
    public void getPersonInfo() {
        System.out.println(this);
    }
    public int getAge() {
        return age;
    }
    public void setAge(){
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }
    public String getFio(){
        return fio;
    }
    public void setFio(){
        this.fio = fio;
    }
    public String getPost(){
        return post;
    }
    public  void setPost(){
        this.post = post;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(){
        this.phone = phone;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
}











