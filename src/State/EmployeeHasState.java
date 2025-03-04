package State;

public class EmployeeHasState {
    private State state;

    public EmployeeHasState(String state) {
            switch (state) {
                case "Đội trưởng":
                    this.state = new DoiTruongState();
                    break;
                case "Giám đốc":
                    this.state  = new GiamDocState();
                    break;
                case "Nhân viên VP":
                    this.state  = new NhanVienVPState();
                    break;
                case "Nhân viên Xưởng":
                    this.state  = new NhanVienXuongState();
                    break;
                case "Kế Toán Trưởng":
                    this.state  = new KeToanTruongState();
                    break;
            }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest();
    }
}
