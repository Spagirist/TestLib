package Dao;

import bean.Category;

import java.util.Scanner;

import static Dao.TestLogin.Login;


/**
 * @Auther: Spagirist
 * @Date: 2019/8/17
 * @Descsctiotion: 馆长操作
 * @version: 1.0
 */


public class CuratorOp {
    private static Scanner in;


    public static void CuratorOp(){
        System.out.println("登陆成功！请选择功能：");
        System.out.println("1.增添书籍类别");
        System.out.println("2.删除书籍类别");
        System.out.println("3.退出系统");
        int cuchoice = in.nextInt();
        switch (cuchoice) {
            case 1:
                addBook();
            case 2:
                minusBook();
            case 3:
                System.out.println("***********************************");
                Login();
            default: {
                System.out.println("选择错误，请重新选择！");
                System.out.println("***********************************");
                CuratorOp();
            }
        }
    }


    private static void addBook() {
        System.out.println("请输入您要增添的书籍类别：");
        String cate = in.nextLine();
        //还没想好怎么弄
    }

    private static void minusBook() {
        System.out.println("请输入您要删除的书籍类别：");
        String cate = in.nextLine();
        if(! Serach.CateSerach(cate)) {
            System.out.println("名称错误重新输入");
        }
        else{
            Category.delete();
        }
    }
}


