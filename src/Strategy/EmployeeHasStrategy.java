package Strategy;

public class EmployeeHasStrategy {
    private Strategy strategy;

    public EmployeeHasStrategy(String strategy) {
            switch (strategy) {
                case "Đội trưởng":
                    this.strategy = new DoiTruongStrategy();
                    break;
                case "Giám đốc":
                    this.strategy = new GiamDocStrategy();
                    break;
                case "Nhân viên VP":
                    this.strategy = new NhanVienVPStrategy();
                    break;
                case "Nhân viên Xưởng":
                    this.strategy = new NhanVienXuongStrategy();
                    break;
                case "Kế Toán Trưởng":
                    this.strategy = new KeToanTruongStrategy();
                    break;
            }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleRequest() {
        strategy.handleRequest();
    }
}
