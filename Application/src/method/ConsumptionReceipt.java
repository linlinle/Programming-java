package method;
import java.util.*;

/** 利用java.util.Formatter格式化输出，消费回执单 **/

public class ConsumptionReceipt {
    private double totalPrice = 0;
    private Formatter receipt = new Formatter(System.out);
    private void printTitle() {
        receipt.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        receipt.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    private void printSinglePrice(String goodsName, int qty, double price) {
        receipt.format("%-15.15s %5d %10.2f\n", goodsName, qty, price);
        totalPrice += price;
    }
    private void printTotalPrice() {
        receipt.format("%-15s %5s %10.2f\n", "Tax", "", totalPrice *0.06);
        receipt.format("%-15s %5s %10s\n", "", "", "-----");
        receipt.format("%-15s %5s %10.2f\n", "Total", "", totalPrice * 1.06);
    }
    public static void main(String[] args) {
        ConsumptionReceipt receipt = new ConsumptionReceipt();
        receipt.printTitle();
        receipt.printSinglePrice("Jack's Magic Beans", 4, 4.25);
        receipt.printSinglePrice("Princess Peas", 3, 5.1);
        receipt.printSinglePrice("Three Bears Porridge", 1, 14.29);
        receipt.printTotalPrice();
    }
}
