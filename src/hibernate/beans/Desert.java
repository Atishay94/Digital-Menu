package hibernate.beans;

public class Desert 
{
    private String category;
    private String dishName;
    private String mainIngredients;
    private int price;

    public Desert() {
    }

    public Desert(String category, String dishName, String mainIngredients, int price) {
        this.category = category;
        this.dishName = dishName;
        this.mainIngredients = mainIngredients;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getMainIngredients() {
        return mainIngredients;
    }

    public void setMainIngredients(String mainIngredients) {
        this.mainIngredients = mainIngredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    }

