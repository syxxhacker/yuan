import java.util.Scanner;

public class MentalTest {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("开始进行心理测试(A->3分   B->2分   C->1分):\n");
        Scanner input = new Scanner(System.in);
        //建立一个数组，来存放问题
        String[] question = {
                "1.经常感到神经过敏、心中不踏实",
                "2.头脑中有不必要的想法或字句盘旋",
                "3.担心自己的着装及仪态的端正",
                "4.容易烦恼和激动",
                "5.感到自己的精力下降，活动减慢"
        };
        //建立一个数组来存放选项
        String[] option = {
                "A.没有",
                "B.中等",
                "C.严重"
        };

        //通过for循环来控制问题的出现
        for (int i = 0;i < 5;i++){
            System.out.println(question[i]);
            //这个for循环是用来控制选项的
            for (int j = 0;j < 3;j++){
                System.out.println(option[j]);
            }
            //result接受输入的选项
            String result = input.next();
            //判断所选的选项，进行分数的计算
            if (result.equals("A")){
                score += 3;
            }else if(result.equals("B")){
                score += 2;
            }else {
                score += 1;
            }
        }

        //输出总分
        System.out.println("您的分数为：" + score + "分");
        //根据分数来输出测试结果
        if (score == 5){
            System.out.println("您有很严重的抑郁症！");
        }else if(score >5 && score <= 10){
            System.out.println("您有轻微的抑郁症！");
        }else{
            System.out.println("您的心理非常健康！");
        }

    }
}
