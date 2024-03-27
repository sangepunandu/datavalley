import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class LinkedListSortExample {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(101, "John", "Manager", 50000));
        employeeList.add(new Employee(102, "Alice", "Developer", 60000));
        employeeList.add(new Employee(103, "Bob", "Analyst", 45000));
        employeeList.add(new Employee(104, "Mary", "Tester", 55000));

        Collections.sort(employeeList);

        System.out.println("Employees sorted by name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getSalary(), emp2.getSalary());
            }
        });

        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
