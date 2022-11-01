package CourseWork;


public class Employee {
    public static int count=1;
    private String fio;
    private int department;
    private int salary;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio=fio;
        this.department=department;
        this.salary=salary;
        this.id=count;
        count++;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department=department;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public String toString() {
return "Фио - "+ fio + " Одел - "+ department+". Зарплата - "+salary+" руб.";
    }
    public void listOfEmployees(Employee[] employee) {
        for (int i = 0; i < count;i++) {
            System.out.println(employee[i]);
        }
    }
}
