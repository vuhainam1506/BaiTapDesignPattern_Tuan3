package State;

public class NhanVienXuongState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Thực hiện công việc sản xuất.");
    }
}
