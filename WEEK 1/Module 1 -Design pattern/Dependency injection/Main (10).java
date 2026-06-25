// Repository Interface
interface CustomerRepository {
    String findCustomerById(int id);
}

// Concrete Repository
class CustomerRepositoryImpl implements CustomerRepository {

    public String findCustomerById(int id) {

        if (id == 101) {
            return "Janani";
        } else if (id == 102) {
            return "Priya";
        }

        return "Customer Not Found";
    }
}

// Service Class
class CustomerService {

    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(int id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + customer);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Inject dependency
        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomerDetails(101);
    }
}