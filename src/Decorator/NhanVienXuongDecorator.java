package Decorator;

public class NhanVienXuongDecorator extends EmployeeDecorator {
    public NhanVienXuongDecorator(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void handleRequest() {
        employee.handleRequest();
        System.out.println("Thực hiện công việc sản xuất.");
    }
}