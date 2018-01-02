package spring_framework.wideskills_com.lesson_20.xml.programmatic_transaction;

public class ProductAccount {
    private int productId;
    private String productName;
    private int price;
    private int  stock;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "ProductAccount [productId=" + productId + ", productName="
                + productName + ", price=" + price + ", stock=" + stock + "]";
    }
}
