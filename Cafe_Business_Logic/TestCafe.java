import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil CafeNew = new CafeUtil();

        int streakGoal = CafeNew.getStreakGoal();
        System.out.println("Purchases needed by week 10: " + streakGoal);

        double[] prices = {3.5, 1.5, 4.0, 4.5};
        double orderTotal = CafeNew.getOrderTotal(prices);
        System.out.printf("Order total: %.2f\n", orderTotal);

        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        CafeNew.displayMenu(menu);
    }
}
