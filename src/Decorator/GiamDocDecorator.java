package Decorator;

public class GiamDocDecorator  extends EmployeeDecorator {
    public GiamDocDecorator(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void handleRequest() {
        employee.handleRequest();
        System.out.println("Quản lý và điều hành công ty.");
    }
}
