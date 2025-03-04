package State;

public class NhanVienVPState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Làm việc văn phòng.");
    }
}
