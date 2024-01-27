// Abstraction (interface)
interface Worker {
    void doWork();
}

// Base Class or Higher-level Module
class Manager {
    private Worker worker;

    // Dependency on abstraction (Worker interface)
    public Manager(Worker worker) {
        this.worker = worker;
    }

    // High-level logic using the abstraction
    public void manage() {
        // Perform management tasks
        System.out.println("Manager is managing...");

        // Delegate the work to the Worker (abstraction)
        worker.doWork();
    }
}

// Derived Class or Lower-level Module
class Engineer implements Worker {
    // Implementation of the Worker interface
    @Override
    public void doWork() {
        // Specific implementation for an Engineer
        System.out.println("Engineer is working...");
    }
}

// Another Derived Class or Lower-level Module
class Accountant implements Worker {
    // Implementation of the Worker interface
    @Override
    public void doWork() {
        // Specific implementation for an Accountant
        System.out.println("Accountant is working on accounts...");
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Creating instances of Derived Classes (Lower-level modules)
        Worker engineer = new Engineer();
        Worker accountant = new Accountant();

        // Creating instances of Base Class (Higher-level module) with dependency injection
        Manager manager1 = new Manager(engineer);
        Manager manager2 = new Manager(accountant);

        // High-level logic remains the same regardless of the specific implementation
        manager1.manage();
        manager2.manage();
    }
}
