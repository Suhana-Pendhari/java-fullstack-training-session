public class Employee2 {
    private int id;
    private String name;
    private int salary;

    // 1. Constructor (To create an employee easily in one line)
    public Employee2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 2. Getters (Necessary for reading data)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getSalary() { return salary; }

    // 3. Setters (Your existing code)
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(int salary) { this.salary = salary; }

    // 4. toString
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}