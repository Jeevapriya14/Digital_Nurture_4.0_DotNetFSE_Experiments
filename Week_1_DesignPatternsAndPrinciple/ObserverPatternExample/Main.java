public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser1 = new MobileApp("Alice");
        Observer webUser1 = new WebApp("Bob");

        stockMarket.registerObserver(mobileUser1);
        stockMarket.registerObserver(webUser1);

        System.out.println("---- Updating Stock to Apple ----");
        stockMarket.setStock("Apple", 150.75);

        System.out.println("\n---- Updating Stock to Tesla ----");
        stockMarket.setStock("Tesla", 999.99);

        stockMarket.removeObserver(webUser1);

        System.out.println("\n---- Updating Stock to Google ----");
        stockMarket.setStock("Google", 1350.50);
    }
}
