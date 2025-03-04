import Entity_NODP.Employee;
import State.EmployeeHasState;
import State.KeToanTruongState;
import State.NhanVienXuongState;
import Strategy.EmployeeHasStrategy;

public class Main {
    public static void main(String[] args) {
        /*
        * Test trường hợp ko sử dụng design pattern
        * */
        Employee doiTruong = new Employee("Nv1","Đội trưởng");
        Employee giamDoc = new Employee("Nv2","Giám đốc");
        Employee nhanVienVP = new Employee("Nv3","Nhân viên VP");
        Employee nhanVienXuong = new Employee("Nv4","Nhân viên Xưởng");
        Employee keToanTruong = new Employee("Nv5","Kế Toán Trưởng");

        doiTruong.handleRequest();
        giamDoc.handleRequest();
        nhanVienVP.handleRequest();
        nhanVienXuong.handleRequest();
        keToanTruong.handleRequest();

        /*
        * Trường hợp dùng State
        * */

//        EmployeeHasState doiTruong = new EmployeeHasState("Đội trưởng");
//        EmployeeHasState giamDoc = new EmployeeHasState("Giám đốc");
//        EmployeeHasState nhanVienVP = new EmployeeHasState("Nhân viên VP");
//        EmployeeHasState nhanVienXuong = new EmployeeHasState("Nhân viên Xưởng");
//        EmployeeHasState keToanTruong = new EmployeeHasState("Kế Toán Trưởng");
//
//        doiTruong.handleRequest();
//        giamDoc.handleRequest();
//        nhanVienVP.handleRequest();
//        nhanVienXuong.handleRequest();
//        keToanTruong.handleRequest();
//
//        doiTruong.setState(new NhanVienXuongState());
//        doiTruong.handleRequest();

        /*
        * Trường hợp dùng Decorator
        * */

//        EmployeeHasStrategy doiTruong = new EmployeeHasStrategy("Đội trưởng");
//        EmployeeHasStrategy giamDoc = new EmployeeHasStrategy("Giám đốc");
//        EmployeeHasStrategy nhanVienVP = new EmployeeHasStrategy("Nhân viên VP");
//        EmployeeHasStrategy nhanVienXuong = new EmployeeHasStrategy("Nhân viên Xưởng");
//        EmployeeHasStrategy keToanTruong = new EmployeeHasStrategy("Kế Toán Trưởng");
//
//        doiTruong.handleRequest();
//        giamDoc.handleRequest();
//        nhanVienVP.handleRequest();
//        nhanVienXuong.handleRequest();
//        keToanTruong.handleRequest();
    }
}