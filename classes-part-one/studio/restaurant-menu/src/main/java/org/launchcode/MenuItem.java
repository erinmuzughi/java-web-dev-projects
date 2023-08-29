public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category; //would be better to use an array and select from a list but because we aren't getting user input here, we will leave alone.
    private boolean isNew;

    //set constructor for our class
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    //instantiate with default for isNew set to true.
    public MenuItem(String name, double price, String description, String category) {
        this(name, price, description, category, true);
    }
    //set our getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

