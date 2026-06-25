class TaskManagement {

    Node head = null;

    
    void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Task Added");
    }

  
    void searchTask(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.taskId == id) {
                System.out.println("Task Found");
                System.out.println(
                    "ID: " + temp.task.taskId +
                    ", Name: " + temp.task.taskName +
                    ", Status: " + temp.task.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }


    void traverseTasks() {

        Node temp = head;

        while (temp != null) {

            System.out.println(
                "ID: " + temp.task.taskId +
                ", Name: " + temp.task.taskName +
                ", Status: " + temp.task.status);

            temp = temp.next;
        }
    }

   
    void deleteTask(int id) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               temp.next.task.taskId != id) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task Deleted");
        }
    }
}