package test;

import main.Broker;
import main.BuyStock;
import main.SellStock;
import main.Stock;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
