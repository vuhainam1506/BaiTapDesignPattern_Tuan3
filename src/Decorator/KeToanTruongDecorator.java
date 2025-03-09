package Decorator;

public class KeToanTruongDecorator extends EmployeeDecorator {
    public KeToanTruongDecorator(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void handleRequest() {
        employee.handleRequest();
        System.out.println("Quản lý tài chính.");
    }
}