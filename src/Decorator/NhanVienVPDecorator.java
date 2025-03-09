package Decorator;

public class NhanVienVPDecorator extends EmployeeDecorator {
    public NhanVienVPDecorator(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void handleRequest() {
        employee.handleRequest();
        System.out.println("Pha và phê duyệt tài liệu.");
    }
}