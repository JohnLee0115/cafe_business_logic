import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result += i;
        }
        return result;
    }

    public int getStreakGoal(int numWeeks) {
        int result = 0;
        for (int i = 1; i < numWeeks + 1; i++) {
            result += i;
        }
        return result;
    }

    public double getOrderTotal(double[] prices) {
        double result = 0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i];
        }
        return result;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i ++) {
            String result = i + " " + menuItems.get(i);
            System.out.println(result);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name");
        String username = System.console().readLine();
        System.out.println("Hello, " + username);
        System.out.println("There are " + customers.size() + " infront of you");
        customers.add(username);
        System.out.println(customers);
        
    }
}