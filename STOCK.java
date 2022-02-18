public class STOCK {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public double getChangePercent()
    {
        return ((this.currentPrice-this.previousClosingPrice)*100/this.previousClosingPrice);
    }
 public STOCK(String symbol,String name)
 {
    this.symbol =symbol;
     this.name = name;
 }

}
