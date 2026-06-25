public class BubbleSortDemo {

    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void display(Order[] orders) {
        for(Order o : orders)
            System.out.println(o);
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Janani", 5000),
            new Order(102, "Priya", 2500),
            new Order(103, "Rahul", 7000),
            new Order(104, "Kumar", 4000)
        };

        bubbleSort(orders);

        System.out.println("After Bubble Sort:");
        display(orders);
    }
}