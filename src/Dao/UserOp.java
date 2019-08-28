package Dao;

import bean.Book;

import java.util.*;

import static Dao.TestLogin.Login;


/**
 * @Auther: Spagirist
 * @Date: 2019/8/17
 * @Descsctiotion: 用户操作
 * @version: 1.0
 */
public class UserOp {

    private static Scanner in;

    public static void UserOp() {
        System.out.println("登陆成功！请选择功能：");
        System.out.println("1.借书");
        System.out.println("2.还书");
        System.out.println("3.退出系统");
        int userchoice = in.nextInt();
        switch (userchoice) {
            case 1:
                LentBook();
            case 2:
                ReturnBook();
            case 3:
                System.out.println("***********************************");
                Login();
            default: {
                System.out.println("选择错误，请重新选择！");
                System.out.println("***********************************");
                UserOp();
            }
        }
    }


    private static void LentBook() {

        System.out.println("请输入您要借的书的名称");
        String bookname = in.nextLine();
        if(! Serach.BookSerach(bookname)) {
            System.out.println("名称错误重新输入");
            LentBook();
        }
        else
        {
            Book.minusS();
        }
    }

    private static void ReturnBook() {

        System.out.println("请输入您要还的书的名称:");
        String bookname = in.nextLine();
        if(! Serach.BookSerach(bookname)) {
            System.out.println("名称错误重新输入");
            LentBook();
        }
        else
        {
            Book.addS();
        }
    }

}