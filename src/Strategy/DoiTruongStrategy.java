package Strategy;

public class DoiTruongStrategy implements Strategy {
    @Override
    public void handleRequest() {
        System.out.println("Đi tuần và gán việc cho nhân viên.");
    }
}
