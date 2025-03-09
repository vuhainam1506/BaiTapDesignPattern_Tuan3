package Decorator;

public class DoiTruongDecorator extends EmployeeDecorator {
    public DoiTruongDecorator(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void handleRequest() {
        employee.handleRequest();
        System.out.println("Đi tuần và gán việc cho nhân viên.");
    }
}