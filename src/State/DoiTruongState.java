package State;

public class DoiTruongState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Đi tuần và gán việc cho nhân viên.");
    }
}
