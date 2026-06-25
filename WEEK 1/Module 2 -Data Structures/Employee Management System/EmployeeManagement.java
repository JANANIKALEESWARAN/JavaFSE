class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;
    void addEmployee(Employee emp) {

        if(count < employees.length) {
            employees[count] = emp;
            count++;
            System.out.println("Employee Added");
        }
        else {
            System.out.println("Array Full");
        }
    }

    
    void searchEmployee(int id) {

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

   
    void traverseEmployees() {

        for(int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }


    void deleteEmployee(int id) {

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id) {

                for(int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }
}