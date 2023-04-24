import java.util.Arrays;

public class Employee {
    private String fullName;
    private int unitNumber;
    private float salary;
    private int id;
    static int counter = 1;

    public Employee(String fullName, int unitNumber, float salary) {
        this.fullName = fullName;
        this.unitNumber = unitNumber;
        this.salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName.isEmpty()) {
            System.out.println("Поле не может быть пустым");
        } else {
            this.fullName = fullName;
        }
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        if (unitNumber > 1 && unitNumber < 5) {
            System.out.println("Номер отдела должен находиться в интервале от 1 до 5");
        }
        this.unitNumber = unitNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary < 50_000) {
            System.out.println("Зарплата не может быть меньше 50_000 руб.");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n" + fullName + ", отдел: " + unitNumber + ", зарплата: " + salary + " рублей";
    }

    public static void printToString(Employee [] employeeBook) {
        for (int i = 0; i < counter - 1; i++) {
            System.out.println(employeeBook[i]);
        }
    }
    public static float findCostWages(Employee[]employeeBook) {
        float sum = 0;
        for (int i = 0; i < counter - 1; i++) {

            sum += employeeBook[i].getSalary();
        }
        return sum;

    }
    public static String findMinWageEmployee(Employee[] employeeBook) {
        double minWage = 200_000;
        String fullName = "";

        for (int i = 0; i < counter - 1; i++) {
            if (minWage > employeeBook[i].getSalary()) {
                minWage = employeeBook[i].getSalary();
                fullName = employeeBook[i].getFullName();
            }
        }
        return fullName;
    }
    public static String findMaxWageEmployee(Employee[] employeeBook) {
        double maxWage = 0;
        String fullName = "";
        for (int i = 0; i < counter - 1; i++) {
            if (maxWage < employeeBook[i].getSalary()) {
                maxWage = employeeBook[i].getSalary();
                fullName = employeeBook[i].getFullName();
            }
        }
        return fullName;

    }

    public static float findAverageWage(Employee[] employeeBook) {

        return findCostWages(employeeBook) / (counter - 1);
    }

    public static void printFullNames(Employee[] employeeBook) {
        for (int i = 0; i < counter - 1; i++) {
            System.out.println(employeeBook[i].getFullName());
        }
    }
    public static void printEmployeesList(Employee[] employeeBook) {
        System.out.println("Список сотрудников:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %5s | %9s |", "№", "ФИО", "Отдел", "Зарплата");
        System.out.println();
        System.out.println("====================================================================");
        for (int i = 0; i < counter - 1; i++) {
            System.out.printf("| %d | %-40s | %5d | %.2f |\n", i + 1, employeeBook[i].getFullName(),
                    employeeBook[i].getUnitNumber(), employeeBook[i].getSalary());
            System.out.println("--------------------------------------------------------------------");
        }
    }
}