public class Lab401 {
    public static void main(String[] args) {
        STOCK stock1 = new STOCK("OCRL","Oracle Coperation");
        stock1.currentPrice=34.35;
        stock1.previousClosingPrice=34.5;
        System.out.println("Symbol: "+stock1.symbol);
        System.out.println("Name: "+stock1.name);
        System.out.println("Previous Closing Price: "+stock1.previousClosingPrice);
        System.out.println("Current Price: "+stock1.currentPrice);
        System.out.printf("Price Change: %.15f%%",stock1.getChangePercent());

    }
}
