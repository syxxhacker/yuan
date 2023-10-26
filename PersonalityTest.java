import java.util.Scanner;

public class PersonalityTest {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        //问题和选项
        System.out.println("开始进行性格测试(A->3分   B->2分   C->1分):\n");
        System.out.println("1.你喜欢大城市还是小城市？\n" + "A.大城市  B.小城市");
        String one = input.next();

        //判断选项，然后统计分数
        if(one.equals("A")) {
            sum += 2;
        }else {
            sum += 1;
        }

        System.out.println("2.你更喜欢阅读书籍还是观看电影？\n"+"A 阅读书籍  B 观看电影");
        String two = input.next();
       if(two.equals("A")) {
            sum += 2;
        }else {
            sum += 1;
        }

        System.out.println("3.你更喜欢户外活动还是室内活动？\n"+"A 户外活动  B 室内活动");
        String three = input.next();
       if(three.equals("A")) {
            sum += 2;
        }else {
            sum += 1;
        }


        //输出总分
        System.out.println("您的分数为：" + sum + "分");
        //根据分数来输出测试结果
        System.out.println("你的性格得分是："+ sum);
        if(sum >= 5){
            System.out.println("你是一个喜欢刺激和冒险的人！");
        }
        else{
            System.out.println("你是一个喜欢安稳和舒适的人！");
        }
    }
}