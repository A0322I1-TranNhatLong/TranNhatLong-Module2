package ss12_java_collection_framework.bai_tap;

public abstract class Product {
    public abstract void addProduct(SanPham sanPham);
    public abstract boolean setProduct(SanPham sanPham);
    public abstract boolean removeProduct(String idSanPham);
    public abstract SanPham searchProduct(String tenSanPham);
    public abstract void sortProduct();
}
