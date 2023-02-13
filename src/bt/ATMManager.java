package bt;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class ATMManager {
    private User[] users;
    private int index = -1;

    public ATMManager() {
        this.index = -1;
        this.fakeUsers();
    }

    public void fakeUsers() {
        users = new User[3];
        users[0] = new User("user1", "pass1", 100000);
        users[1] = new User("user2", "pass2", 200000);
        users[2] = new User("user3", "pass3", 300000);
    }

    public int login(String username, String password) {
        for (int i = 0; i < this.users.length; i++) {
            User user = this.users[i];
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                this.index = i;
                break;
            }
        }
        return this.index;
    }

    public User getAuthUser() {
        if (this.index != -1)
            return this.users[this.index];
        return null;
    }

    public float widthdraw(float amount) {
        User user = getAuthUser();
        if (user.getAmount() >= amount) {
            user.setAmount(user.getAmount() - amount);
            return user.getAmount();
        }
        return -1;
    }

    public float getBalance() {
        return  getAuthUser().getAmount();
    }

    public String formatAmount(float amount) {
        Locale vn = new Locale("vi", "VN");
        //Currency dollars = Currency.getInstance(vn);
        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(vn);
        return vndFormat.format(amount);
    }
}
