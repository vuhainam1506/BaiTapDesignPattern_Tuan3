package Entity_NODP;

public class Employee {
    private String ten;
    private String chucVu;

    public Employee(String ten, String chucVu) {
        this.ten = ten;
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        if (chucVu.equals("Đội trưởng")) {
            System.out.println("Đi tuần và gán việc cho nhân viên.");
        } else if (chucVu.equals("Giám đốc")) {
            System.out.println("Quản lý và điều hành công ty.");
        } else if (chucVu.equals("Nhân viên VP")) {
            System.out.println("Pha và phê duyệt tài liệu.");
        } else if (chucVu.equals("Nhân viên Xưởng")) {
            System.out.println("Thực hiện công việc sản xuất.");
        } else if (chucVu.equals("Kế Toán Trưởng")) {
            System.out.println("Quản lý tài chính.");
        }
    }
    public void setChucVu()
    {

    }
}
