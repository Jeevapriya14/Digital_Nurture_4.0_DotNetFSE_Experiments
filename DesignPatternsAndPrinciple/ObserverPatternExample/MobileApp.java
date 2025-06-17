public class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("MobileApp Notification for " + user + ": " +
            stockName + " is now $" + stockPrice);
    }
}
