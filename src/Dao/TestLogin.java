package Dao;

import java.util.*;

import bean.*;
import Dao.*;
import Dao.TestSearch.*;
import Dao.UserOp;


/**
 * @Auther: Spagirist
 * @Date: 2019/8/16
 * @Descsctiotion: Dao
 * @version: 1.0
 */
public class TestLogin {

    private static Scanner in;

    public static void Login(){
        System.out.println("*****************欢迎登陆没有书图书馆*****************");
        System.out.println();
        System.out.println("请输入您的用户名:");
        String name = in.next();
        branch(name);
    }

    public static void branch(String name) {
        if (TestSearch.UsernameSearch(name))  UserDao();
        else if (TestSearch.StanameSearch(name)) {
            if (TestSearch.CurnameSearch(name)) CuratorDao();
            else CommonStaDao();
        }
        else {System.out.println("Error!");
        Login();}
    }



    public static void UserDao(){
        System.out.println("请输入您的密码：");
        String pxd = in.nextLine();
        if (!TestSearch.UserPxdSearch(pxd)) {System.out.println("您输入的密码有误！");UserDao();}
        else new UserOp();
    }

    public static void CommonStaDao(){
        System.out.println("请输入您的密码：");
        String pxd = in.nextLine();
        if (! TestSearch.StaPxdSearch(pxd)) {System.out.println("您输入的密码有误！");CommonStaDao();}
        else new CommonStaOp();
    }

    public static void CuratorDao(){
        System.out.println("请输入您的密码：");
        String pxd = in.nextLine();
        if (!TestSearch.CurPxdSearch(pxd)) {System.out.println("您输入的密码有误！");}
        else new CuratorOp();
    }

}

