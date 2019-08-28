package bean;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/15
 * @Descsctiotion: 定义职工类
 * @version: 1.0
 */
public class CommonSta extends User {

    public CommonSta(int id, String username, String password) {
        super(id, username, password);
    }

    private String sex;
    private int tel;

    public CommonSta(int id, String username, String password, String sex, int tel) {
        super(id, username, password);
        this.sex = sex;
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
