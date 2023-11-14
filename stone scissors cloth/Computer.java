import java.util.Scanner;

public class Computer extends Joiner{
    public Computer() {
    }

    //电脑角色选择
    public void computer_role(){
        //创建一个数组，用来获取电脑角色名，结果用来输出电脑角色名
        String[] role = {"钢铁侠","蜘蛛侠","蝙蝠侠","猪猪侠"};
        System.out.println("------------------角色选择------------------");
        System.out.println("请选择电脑角色进行对战：");
        System.out.println("1----钢铁侠");
        System.out.println("2----蜘蛛侠");
        System.out.println("3----蝙蝠侠");
        System.out.println("4----猪猪侠");


        Scanner scanner = new Scanner(System.in);
        int com_role = scanner.nextInt();
        this.setName(role[com_role-1]);

    }

    //电脑生成随机数，在1-3之间
    public void com_choice(){
        this.setChoice_name((int)(Math.random()*3+1));
    }

}
