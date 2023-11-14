import java.util.Scanner;

public class MyPay extends MyOrder{
    //定义私有变量
    private String username;
    private double money;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        this.username = scanner.nextLine();
        System.out.println("请输入金额：");
        try{
            this.money = scanner.nextDouble();
        }catch (Exception e){
            this.money = 100;
        }
    }

    //无参的构造函数
    public MyPay() {}

    //有参的构造函数
    public MyPay(String username, double money) {
        this.username = username;
        this.money = money;
    }

    @Override
    public void pay_order(){
        //判断用户输入的金额（也就是用户有多少钱）是否比总价大
        if(this.money >= this.getTotal()){
            //暂时用不到
//            this.money = this.money - this.getTotal();

            System.out.println("支付成功！");
            System.out.println("你购买了这件商品！");
            System.out.println("----------------------订单信息----------------------");
            Pay pay = new Pay();
            //除了username，其他几个变量都是其他类定义的私有变量，所以使用get方法
            System.out.println("用户:" + this.username);
            System.out.println("商品名称：" + this.getName());
            System.out.println("单价" + this.getPrice() + "元");
            System.out.println("购买数量：" + this.getNum());
            System.out.println("共计：" + this.getTotal() + "元");
            System.out.println("订单号：" + this.getNo());
            System.out.println("配送地址：" + this.getAddr());

        }else {
            System.out.println("余额不足！");
        }

    }

    //以下是get和set方法，放在代码最后，增加代码可读性
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
