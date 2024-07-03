package SOLID_principles;

// Employee class
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
// BonusCalculator interface
interface BonusCalculator {
    double calculateBonus(Employee employee);
}
// DeveloperBonusCalculator class
class DeveloperBonusCalculator implements BonusCalculator {
    @Override
    public double calculateBonus(Employee employee) {
        // Bonus logic for developers
        return employee.getSalary() * 0.10;
    }
}

// ManagerBonusCalculator class
class ManagerBonusCalculator implements BonusCalculator {
    @Override
    public double calculateBonus(Employee employee) {
        // Bonus logic for managers
        return employee.getSalary() * 0.20;
    }
}

// BonusService class
class BonusService {
    public void showBonus(Employee employee, BonusCalculator bonusCalculator) {
        double bonus = bonusCalculator.calculateBonus(employee);
        System.out.println("Bonus for " + employee.getName() + ": $" + bonus);
    }
}
// Main class to test the implementation
public class open_closed {
    public static void main(String[] args) {
        Employee dev = new Employee("Alice", 80000);
        Employee mgr = new Employee("Bob", 100000);

        BonusCalculator devBonusCalculator = new DeveloperBonusCalculator();
        BonusCalculator mgrBonusCalculator = new ManagerBonusCalculator();

        BonusService bonusService = new BonusService();

        bonusService.showBonus(dev, devBonusCalculator);
        bonusService.showBonus(mgr, mgrBonusCalculator);
    }
}
