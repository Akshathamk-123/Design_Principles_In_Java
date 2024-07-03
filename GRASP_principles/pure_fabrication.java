import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "'}";
    }
}

// PersistenceService class
class PersistenceService {
    private List<Employee> employeeStorage;

    public PersistenceService() {
        employeeStorage = new ArrayList<>();
    }

    // Saves an employee to the storage
    public void saveEmployee(Employee employee) {
        employeeStorage.add(employee);
        System.out.println("Saved employee: " + employee);
    }

    // Loads an employee by ID
    public Employee loadEmployee(String id) {
        for (Employee employee : employeeStorage) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    // Displays all employees in the storage
    public void displayAllEmployees() {
        for (Employee employee : employeeStorage) {
            System.out.println(employee);
        }
    }
}
// Main class to test the implementation
public class pure_fabrication {
    public static void main(String[] args) {
        // Create the persistence service
        PersistenceService persistenceService = new PersistenceService();

        // Create and save employees
        Employee employee1 = new Employee("1", "Alice");
        Employee employee2 = new Employee("2", "Bob");

        persistenceService.saveEmployee(employee1);
        persistenceService.saveEmployee(employee2);

        // Load and display an employee by ID
        Employee loadedEmployee = persistenceService.loadEmployee("1");
        System.out.println("Loaded employee: " + loadedEmployee);

        // Display all employees
        persistenceService.displayAllEmployees();
    }
}
