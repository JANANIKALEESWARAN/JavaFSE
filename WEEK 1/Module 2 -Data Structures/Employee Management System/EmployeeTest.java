public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(
            new Employee(101, "Janani",
            "Manager", 60000));

        em.addEmployee(
            new Employee(102, "Priya",
            "Developer", 50000));

        em.addEmployee(
            new Employee(103, "Rahul",
            "Tester", 45000));

        System.out.println("\nAll Employees:");
        em.traverseEmployees();

        System.out.println("\nSearching Employee:");
        em.searchEmployee(102);

        System.out.println("\nDeleting Employee:");
        em.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        em.traverseEmployees();
    }
}