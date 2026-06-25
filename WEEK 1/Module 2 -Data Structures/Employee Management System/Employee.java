class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name,
             String position, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId +
               ", Name: " + name +
               ", Position: " + position +
               ", Salary: " + salary;
    }
}