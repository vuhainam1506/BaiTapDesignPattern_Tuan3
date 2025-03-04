import Entity_NODP.Employee;
import State.DoiTruongState;
import State.EmployeeHasState;
import State.KeToanTruongState;
import State.NhanVienXuongState;
import Strategy.EmployeeHasStrategy;

public class Main {
    public static void main(String[] args) {
        /*
        * Test trường hợp ko sử dụng design pattern
        * */
//        Employee doiTruong = new Employee("Nv1","Đội trưởng");
//        Employee giamDoc = new Employee("Nv2","Giám đốc");
//        Employee nhanVienVP = new Employee("Nv3","Nhân viên VP");
//        Employee nhanVienXuong = new Employee("Nv4","Nhân viên Xưởng");
//        Employee keToanTruong = new Employee("Nv5","Kế Toán Trưởng");
//
//        System.out.println("Test trường hợp ko sử dụng design pattern");
//        System.out.print("\nĐội trưởng : ");
//        doiTruong.handleRequest();
//        System.out.print("\nGiám đốc : ");
//        giamDoc.handleRequest();
//        System.out.print("\nNhân viên VP : ");
//        nhanVienVP.handleRequest();
//        System.out.print("\nNhân viên Xưởng : ");
//        nhanVienXuong.handleRequest();
//        System.out.print("\nKế Toán Trưởng : ");
//        keToanTruong.handleRequest();


        /*
        * Trường hợp dùng State
        * */

        EmployeeHasState doiTruong = new EmployeeHasState("Đội trưởng");
        EmployeeHasState giamDoc = new EmployeeHasState("Giám đốc");
        EmployeeHasState nhanVienVP = new EmployeeHasState("Nhân viên VP");
        EmployeeHasState nhanVienXuong = new EmployeeHasState("Nhân viên Xưởng");
        EmployeeHasState keToanTruong = new EmployeeHasState("Kế Toán Trưởng");

        System.out.println("Test trường hợp ko sử dụng design pattern");
        System.out.print("\nĐội trưởng : ");
        doiTruong.handleRequest();
        System.out.print("\nGiám đốc : ");
        giamDoc.handleRequest();
        System.out.print("\nNhân viên VP : ");
        nhanVienVP.handleRequest();
        System.out.print("\nNhân viên Xưởng : ");
        nhanVienXuong.handleRequest();
        System.out.print("\nKế Toán Trưởng : ");
        keToanTruong.handleRequest();

        System.out.println("\nNếu dùng state thì theo lý thuyết" +
                "các state có mối quan hệ với nhau, " +
                "nếu chuyển từ 1 state này sang state khác thì phải thông qua 1 state khác," +
                "nhưng ở đây không có mối quan hệ giữa các state với nhau." +
                "\n1 empl vẫn tự do đổi từ state này qua state khác và dổi lại cái cũ," +
                "nên không thể dùng state trong trường hợp này được." );

        System.out.println("Đội trưởng thì có thẻ đổi qua kế toán trưởng");

        doiTruong.setState(new KeToanTruongState());
        System.out.print("\nĐội trưởng : ");
        doiTruong.handleRequest();

        System.out.println("Đội trưởng đổi lại state cũ");
        doiTruong.setState(new DoiTruongState());
        System.out.print("\nĐội trưởng : ");
        doiTruong.handleRequest();


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