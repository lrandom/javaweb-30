package models;

public class Product  implements IModels{
    private String id;
    private String sku;
    private String name;

    public String getSku() {
        return sku;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
