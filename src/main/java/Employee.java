public class Employee {
    public String fio;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmp() {
        System.out.println(this.fio + " " + this.position + " " + this.email  + " " +
                this.phoneNumber + " " + this.salary + " " +this.age);
    }
}
