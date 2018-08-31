package vo.main_20180831_VO;

public class T_1VO {
    private int oh;
    private int dae;
    private String geun;

    @Override
    public String toString() {
        return "T_1VO{" +
                "oh=" + oh +
                ", dae=" + dae +
                ", geun='" + geun + '\'' +
                '}';
    }

    public int getOh() {
        return oh;
    }

    public void setOh(int oh) {
        this.oh = oh;
    }

    public int getDae() {
        return dae;
    }

    public void setDae(int dae) {
        this.dae = dae;
    }

    public String getGeun() {
        return geun;
    }

    public void setGeun(String geun) {
        this.geun = geun;
    }
}
