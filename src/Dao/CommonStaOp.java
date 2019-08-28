package Dao;

import bean.Book;

import java.util.Scanner;

import static Dao.TestLogin.Login;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/17
 * @Descsctiotion: 职工操作
 * @version: 1.0
 */
public class CommonStaOp {

    private static Scanner in;

    public static void CommonStaOp() {

        System.out.println("登陆成功！请选择功能：");
        System.out.println("1.查询书籍情况");
        System.out.println("2.退出系统");
        int stachoice = in.nextInt();
        switch (stachoice) {
            case 1:
                WatchBook();
            case 2:
                System.out.println("***********************************");
                Login();
            default: {
                System.out.println("选择错误，请重新选择！");
                System.out.println("***********************************");
                CommonStaOp();
            }
        }
    }

    private static void WatchBook() {
        System.out.println("请输入您要查询的书籍名称：");
        String bookname = in.nextLine();
        if(! Serach.BookSerach(bookname)) {
            System.out.println("名称错误重新输入");
            WatchBook();
        }
        else{
            System.out.println(Book.List());
        }
    }
}
