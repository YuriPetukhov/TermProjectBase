public class Main {
    public static void main(String[] args) {

        Employee[] employeeBook = new Employee[10];
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100_000);
        employeeBook[0] = employee1;
        Employee employee2 = new Employee("Петров Петр Петрович", 2, 120_000);
        employeeBook[1] = employee2;
        Employee employee3 = new Employee("Валентинова Валентина Валентиновна", 3, 110_000);
        employeeBook[2] = employee3;
        Employee employee4 = new Employee("Евгеньева Евгения Евгеньевна", 4, 105_000);
        employeeBook[3] = employee4;
        Employee employee5 = new Employee("Маратов Марат Маратович", 5, 115_000);
        employeeBook[4] = employee5;

        System.out.println("Задачи базовой сложности");
        System.out.println();
        System.out.println("Для проверки. Получить список всех сотрудников со всеми имеющимися по ним данными");
        Employee.printEmployeesList(employeeBook);
        System.out.println();
        System.out.println("Задача 1. Получить список всех сотрудников со всеми имеющимися по ним данными toString");
        Employee.printToString(employeeBook);
        System.out.println();
        System.out.println("Задача 2. Посчитать сумму затрат на зарплату в месяц");
        System.out.println("Сумма затрат на зарплату за месяц составляет: " + Employee.findCostWages(employeeBook) + " рублей");
        System.out.println();
        System.out.println("Задача 3. Найти сотрудника с минимальной зарплатой");
        System.out.println("Минимальную зарплату получает " + Employee.findMinWageEmployee(employeeBook));
        System.out.println();
        System.out.println("Задача 4. Найти сотрудника с максимальной зарплатой");
        System.out.println("Максимальную зарплату получает " + Employee.findMaxWageEmployee(employeeBook));
        System.out.println();
        System.out.println("Задача 5. Подсчитать среднее значение зарплат");
        System.out.println("Средняя зарплата в месяц составляет: " + Employee.findAverageWage(employeeBook) + " рублей");
        System.out.println();
        System.out.println("Задача 6. Получить Ф. И. О. всех сотрудников");
        Employee.printFullNames(employeeBook);
    }

}