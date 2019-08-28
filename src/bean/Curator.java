package bean;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/15
 * @Descsctiotion: bean
 * @version: 1.0
 */
public class Curator extends CommonSta {

    private String email;

    public Curator(int id, String username, String password, String sex, int tel) {
        super(id, username, password, sex, tel);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
