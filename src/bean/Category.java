package bean;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/15
 * @Descsctiotion: bean
 * @version: 1.0
 */
public class Category {
    private String id;
    private String name;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void delete() {
        //没想好
    }
}
