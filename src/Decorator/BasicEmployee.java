package Decorator;

public class BasicEmployee implements EmployeeComponent {
    private String chucVu;

    public BasicEmployee(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void handleRequest() {
        System.out.println("Nhân viên " + chucVu);
    }
}
