import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    //constructor for Menu class
    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    // getters and setters for Menu
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
