package Dao;

import bean.CommonSta;
import bean.Curator;
import bean.User;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/17
 * @Descsctiotion: 查询
 * @version: 1.0
 */
public class TestSearch {


    public static boolean UsernameSearch(String name) {
        User[] n = new User[0];
        for(User username: n )
        {
            if(name.equals(n)) {return true;}
        }
        return false;
    }


    public static boolean StanameSearch(String name) {
        CommonSta[] n = new CommonSta[0];
        for(CommonSta username: n )
        {
            if(name.equals(n)) {return true;}
        }
        return false;
    }

    public static boolean CurnameSearch(String name) {
        Curator[] n = new Curator[0];
        for(Curator username: n )
        {
            if(name.equals(n)) {return true;}
        }
        return false;
    }

    public static boolean UserPxdSearch(String pxd) {
       User[] p = new User[0];
        for(User password: p )
        {
            if(password.equals(p)) {return true;}
        }
        return false;
    }

    public static boolean StaPxdSearch(String pxd) {
        CommonSta[] p = new CommonSta[0];
        for(CommonSta password: p )
        {
            if(password.equals(p)) {return true;}
        }
        return false;
    }

    public static boolean CurPxdSearch(String pxd) {
        Curator[] p = new Curator[0];
        for(Curator password: p )
        {
            if(password.equals(p)) {return true;}
        }
        return false;
    }
}



