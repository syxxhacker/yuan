import java.util.Scanner;

public class Examination_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //定义全局变量准考证号，姓名，成绩
        String no = "111";
        String name = "";
        int score = 0;

        //设置学号的正则表达式，规定学号只能由四位数字组成
        String reg_no = "^\\d{4}$";
        //设置姓名的正则表达式，只允许出现汉字或英文字母
        String reg_China_name = "^[\\u4e00-\\u9fa5]{2,10}+$";
        String reg_foreign_name = "^[a-zA-Z]+$";
        System.out.println("开始考试\n请输入4位数的准考证号：");
        no = input.next();

        //判断是否符合正则表达式，满足则进入下一步
        if (no.matches(reg_no)){
            System.out.println("请输入姓名：");
            name = input.next();

            //判断是否符合正则表达式，满足则进入下一步
            if (name.matches(reg_China_name) || name.matches(reg_foreign_name)){
                System.out.println("请选择你要考试的科目：\n" + "A.数学    B.英语");
                String option = input.next();
                if (option.toUpperCase().equals("A")){
                    System.out.println("-----------------下面进行数学考试-----------------");
                    System.out.println("1.1 + 1 = \n" + "A.1   B.2   C.3   D.4");
                    String ans1 = input.next();
                    if (ans1.toUpperCase().equals("B")){
                        score += 10;
                    }else {
                        score += 0;
                    }
                    System.out.println("2.2 + 2 = \n" + "A.1   B.2   C.3   D.4");
                    String ans2 = input.next();
                    if (ans2.toUpperCase().equals("D")){
                        score += 10;
                    }else {
                        score += 0;
                    }

                    //打印成绩
                    System.out.println("学号：" + no + "\t" + "姓名：" + name + "\t" + "成绩：" + score);
                }else if(option.toUpperCase().equals("B")){
                    System.out.println("-----------------下面进行英语考试-----------------");
                    System.out.println("1.What's your name? \n" + "A.你的名字叫什么   B.你吃饭了吗   C.你是谁   D.你在哪里");
                    String ans3 = input.next();
                    if (ans3.toUpperCase().equals("A")){
                        score += 10;
                    }else {
                        score += 0;
                    }

                    System.out.println("2.where are you？\n" + "A.你的名字叫什么   B.你吃饭了吗   C.你是谁   D.你在哪里");
                    String ans4 = input.next();
                    if (ans4.toUpperCase().equals("D")){
                        score += 10;
                    }else {
                        score += 0;
                    }

                    //打印成绩
                    System.out.println("学号：" + no + "\t" + "姓名：" + name + "\t" + "成绩：" + score);

                }else{
                    System.out.println("正在退出考试.....");
                }

            }else{
                System.out.println("请输入正确的名字");
            }

        }else{
            System.out.println("您的准考证号不正确");
        }

    }
}
