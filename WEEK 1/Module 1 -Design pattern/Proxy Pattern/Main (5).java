// Subject Interface
interface Image {
    void display();
}

// Real Subject
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

// Proxy Class
class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {

        // Lazy Initialization
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        // Cached object is reused
        realImage.display();
    }
}


public class Main {
    public static void main(String[] args) {

        Image image = new ProxyImage("sample.jpg");

        System.out.println("First Display:");
        image.display();

        System.out.println("\nSecond Display:");
        image.display();
    }
}