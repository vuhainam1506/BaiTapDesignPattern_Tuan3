package Strategy;

public class NhanVienXuongStrategy implements Strategy {
    @Override
    public void handleRequest() {
        System.out.println("Thực hiện công việc sản xuất.");
    }
}
