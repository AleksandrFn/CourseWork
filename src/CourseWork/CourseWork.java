package CourseWork;

import java.lang.reflect.Array;

public class CourseWork {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Александр Дудонов Дудонович", 1, 5543);
        employee[1] = new Employee("Алексей Дудонов Дудонович", 2, 18500);
        employee[2] = new Employee("Виктория Дудонова Викторовна", 2, 1500);
        employee[3] = new Employee("Вадим Иванов Вадимович", 5, 15000);
        employee[4] = new Employee("Кирилл Кириллов Кириллович", 3, 3000);
        employee[5] = new Employee("Семен Семенов Семенович", 2, 3900);
        employee[6] = new Employee("Иван Иванов Иванович", 4, 15500);
        employee[7] = new Employee("Констанин Константинов Константинович", 5, 12000);
        employee[8] = new Employee("Любовь Иванова Михайловна", 2, 16500);
        employee[9] = new Employee("Дима Димов Дмитриевич", 3, 52500);
        listOfEmployees(employee);
        System.out.println();
        System.out.println("Сумма всех зарплат за месяц составляет - " + totalSalary(employee));
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary(employee));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalary(employee));
        System.out.println();
        System.out.println("Средняя зарплата составляет - " + averageSalary(employee));
        System.out.println();
        fullNameOfEmployees(employee);
        System.out.println();
        salaryIncrease(23,employee);
        listOfEmployees(employee);
        System.out.println();
        int lookingForDep = 5;
        System.out.println("Сотрудник с максимальной зарплатой в отделе № " + lookingForDep + " " + maxSalary(filterDepartment(lookingForDep, employee)));
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой в отделе № " + lookingForDep + " " + minSalary(filterDepartment(lookingForDep, employee)));
        System.out.println();
        System.out.println("Сумма затрат по отделу № " + lookingForDep + " " + totalSalary(filterDepartment(lookingForDep, employee)) + " руб.");
        System.out.println();
        System.out.println("Средняя зарплата по отделу № " + lookingForDep + " " + averageSalary(filterDepartment(lookingForDep, employee)));
        System.out.println();
        salaryIncreaseDepartment(lookingForDep, 15, employee);
        System.out.println();
        departmentListOfEmployees(filterDepartment(lookingForDep, employee));
        System.out.println();
        lessSalarySearch(15000,employee);
        System.out.println();
        moreSalarySearch(15000,employee);
    }
    public static void moreSalarySearch(int salary, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && salary >= employees[i].getSalary()) {
                System.out.println("ID - "+ employees[i].getId()+" "+employees[i].getFio()+" зарплата - "+ employees[i].getSalary()+" руб.");
            }
        }
    }
    public static void lessSalarySearch(int salary, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && salary < employees[i].getSalary()) {
                System.out.println("ID - "+ employees[i].getId()+" "+employees[i].getFio()+" зарплата - "+ employees[i].getSalary()+" руб.");
            }
        }
    }
    public static void departmentListOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                System.out.println(employees[i].getFio() + " Зарплата : " + employees[i].getSalary() + " руб.");
            }
        }
    }

    public static void listOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static int totalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee minSalary(Employee[] employees) {
        Employee minSalaryPerson = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalaryPerson.getSalary()) {
                minSalaryPerson = employees[i];
            }
        }
        return minSalaryPerson;
    }

    public static Employee maxSalary(Employee[] employees) {
        Employee maxSalaryPerson = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalaryPerson.getSalary()) {
                maxSalaryPerson = employees[i];
            }
        }
        return maxSalaryPerson;
    }

    public static int averageSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary / employees.length;
    }

    public static void fullNameOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFio());
            }
        }
    }

    public static void salaryIncrease(int coeff, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((employees[i].getSalary() / 100 * coeff) + employees[i].getSalary());
            }
        }
    }

    public static void salaryIncreaseDepartment(int dep, int coeff, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dep) {
                employees[i].setSalary((employees[i].getSalary() / 100 * coeff) + employees[i].getSalary());
            }
        }
    }

    public static Employee[] filterDepartment(int dep, Employee[] employees) {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && dep <= 5 && dep >= 1 && employees[i].getDepartment() == dep) {
                counter++;
            }
        }
        Employee[] result = new Employee[counter];
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && dep <= 5 && dep >= 1 && employees[i].getDepartment() == dep) {
                result[index] = employees[i];
                index++;
            }
        }
        return result;
    }
}
