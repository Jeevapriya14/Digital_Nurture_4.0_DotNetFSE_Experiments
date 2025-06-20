public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp Alert for " + user + ": " +
            stockName + " price changed to $" + stockPrice);
    }
}
