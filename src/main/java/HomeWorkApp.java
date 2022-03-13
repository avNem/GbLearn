public class HomeWorkApp {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Вася", "Manager", "manager@rr.ru",
                "11-11",1000, 23);
        employees[1] = new Employee("Коля", "Developer", "developer@rr.ru",
                "22-22",800, 48);
        employees[2] = new Employee("Зина", "HR", "hr@rr.ru",
                "33-33",600, 42);
        employees[3] = new Employee("Маша", "Developer", "developer@rr.ru",
                "44-44",800, 33);
        employees[4] = new Employee("Серега", "Driver", "driver@rr.ru",
                "55-55",300, 50);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printEmp();
            }
        }

    }
}
