package CourseWork;

import java.lang.reflect.Array;

public class CourseWork {
    public static void main(String[] args) {
        Employee[] employee=new Employee[10];
        employee[0]=new Employee("Александр Дудонов Дудонович",1,14500);
        employee[1]=new Employee("Алексей Дудонов Дудонович",4,18500);
        employee[2]=new Employee("Виктория Дудонова Викторовна",4,22500);
        employee[3]=new Employee("Вадим Иванов Вадимович",1,16500);
        employee[4]=new Employee("Кирилл Кириллов Кириллович",2,24000);
        employee[5]=new Employee("Семен Семенов Семенович",1,11500);
        employee[6]=new Employee("Иван Иванов Иванович",4,55000);
        employee[7]=new Employee("Констанин Константинов Константинович",1,17500);
        employee[8]=new Employee("Любовь Иванова Михайловна",3,44500);
        employee[9]=new Employee("Дима Димов Дмитриевич",3,52500);
        listOfEmployees(employee);
        System.out.println();
        System.out.println("Сумма всех зарплат за месяц составляет - "+totalSalary(employee));
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой - "+minSalary(employee));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой - "+maxSalary(employee));
        System.out.println();
        System.out.println("Средняя зарплата составляет - "+averageSalary(employee));
        System.out.println();
        fioList(employee);

    }
    public static void listOfEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length;i++) {
            System.out.println(employee[i]);
        }
    }

    public static int totalSalary(Employee[] employees) {
        int totalSalary=0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary+=employees[i].getSalary();
        }
        return totalSalary;
    }

    public static Employee minSalary(Employee[] employees) {
        int minValue = employees[0].getSalary();
        Employee minSalaryPerson=employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minValue) {
                minValue=employees[i].getSalary();
                minSalaryPerson=employees[i];
            }
        }
        return minSalaryPerson;
    }
    public static Employee maxSalary(Employee[] employees) {
        int maxValue = employees[0].getSalary();
        Employee maxSalaryPerson=employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxValue) {
                maxValue=employees[i].getSalary();
                maxSalaryPerson=employees[i];
            }
        }
        return maxSalaryPerson;
    }
    public static int averageSalary(Employee[] employees) {
        int totalSalary=0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary+=employees[i].getSalary();
        }
        return totalSalary/employees.length;
    }
    public static void fioList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
}
