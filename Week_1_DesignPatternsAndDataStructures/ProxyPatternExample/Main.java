public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("First display of image1:");
        image1.display(); 

        System.out.println("\nSecond display of image1:");
        image1.display(); 

        System.out.println("\nFirst display of image2:");
        image2.display(); 
    }
}
