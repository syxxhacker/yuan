import java.util.Scanner;

public class MyPage {
    public static void main(String[] args) {

        //商城首页
        System.out.println("---------------------------------------------------");
        System.out.println("欢迎光临幸运购买商城！");
        System.out.println("         版本：v1.0");
        System.out.println("         作者：萧萧");
        System.out.println("---------------------------------------------------");

        //定义数组，接收商品信息
        MyPay[] mypay = new MyPay[5];

        String[] name = {
                "《西游记》",
                "《红楼梦》",
                "《水浒传》",
                "《三国演义》"
        };
        double[] price = {9.8,8.8,10.8,11.8};
        String[] arr = {
                "江苏省南京市至北京市昌平区",
                "广东省广州市至北京市昌平区",
                "广东省佛山市至北京市昌平区",
                "广东省深圳市至北京市昌平区"
        };

        //首页展示商品信息，当用户未进行登录时是可以浏览商品的
        for(int i = 0;i < 4;i++){
            mypay[i] = new MyPay();
            mypay[i].setName(name[i]);
            mypay[i].setAddr(arr[i]);
            mypay[i].setPrice(price[i]);
            //打印商品信息
            print_goods(i+1,mypay[i].getName(),mypay[i].getPrice());

        }

        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //用户输入任意字符，会提示用户登录才能进行购买等一系列操作
        System.out.println("----------------------请先登录-----------------------");
        mypay[0].input();
        for (int j = 1;j < 4;j++){
            //接收用户名及金额，以及后面用户购买商品时用户名和金额与第一个相同
            mypay[j].setUsername(mypay[0].getUsername());
            mypay[j].setMoney(mypay[0].getMoney());
        }

        System.out.println("----------------------购买页面-----------------------");
        System.out.println("请用户输入想要购买的商品序号：");
        while(true){
            try{
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                mypay[option-1].show();

            }catch (Exception e){
                System.out.println("请输入正确的序号！");
            }
        }
    }

    public static void print_goods(int i,String name,double price){
        System.out.println(i + "--" + name + "\t" + price);
    }
}
