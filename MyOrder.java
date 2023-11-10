public class MyOrder extends MyGoods {
    //定义私有变量，总结以及订单号
    private double total;
    private  long no = (int)(Math.random()*10000000 + 10000000);

    //有参构造函数
    public MyOrder(double total) {
        this.total = total;
    }
    //无参构造函数，信息由用户输入
    public MyOrder(){}

    @Override
    public void make_order(){
        //总结计算，由购买数量*商品价格决定，所以下面只使用get方法
        this.total = this.getNum() * this.getPrice();
        //总价保留两位小数
        this.total = Double.parseDouble(String.format("%.2f",this.total));
        //pay_order函数，用户支付完成时，打印订单信息
        this.pay_order();
    }

    //pay_order需要在mypay类重写，这里不需要访问，所以用protected
    protected void pay_order(){}

    //以下是get和set方法，放在代码最后，增加代码可读性
    //因为total是有价格乘以数量决定的，所以直接get方法就可以了,订单号是随机生成的，也是一样
    public double getTotal() {
        return total;
    }

    public long getNo() {
        return no;
    }
}
