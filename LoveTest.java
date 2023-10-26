import java.util.Scanner;

public class LoveTest {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("开始进行爱情测试(A->3分   B->2分   C->1分):\n");
        Scanner input = new Scanner(System.in);
        //利用for循环来来控制输出次数
        for (int i = 1;i <= 10;i++){
            //if判断语句来判断输出哪个问题
            if (i == 1){
                System.out.println("1.每次吃饭或者看电影都是对方抢着买单吗？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 2){
                System.out.println("2.你的恋人会经常问你在哪里？在做什么？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 3){
                System.out.println("3.你的恋人离开你的时间里，你会觉得莫名的空落落的？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 4){
                System.out.println("4.可以深刻的感受到对方非常在意你？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 5){
                System.out.println("5.无论什么事情，你的恋人都会充分征求你的意见吗？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 6){
                System.out.println("6.平常吵完架之后，是否会有冷战的情况？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 7){
                System.out.println("7.对你的照顾会把握尺度，不至于太疏远，也不至于让你感到束缚？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 8){
                System.out.println("8.无论你的恋人在不在你身边，你都有一种安全感？\n" + "A.是的   B.偶尔   C.不是");
            }else if(i == 9){
                System.out.println("9.在对方的身上，你能否看到未来的影子？\n" + "A.是的   B.偶尔   C.不是");
            }else{
                System.out.println("10.是否会一直爱着对方?\n" + "A.是的   B.偶尔   C.不是");
            }

            //接收每个问题的输出结果
            String result = input.next();
            //判断输出结果对应的分数，进行累加
            if (result.equals("A")){
                score += 3;
            }else if(result.equals("B")){
                score += 2;
            }else {
                score += 1;
            }
        }

        System.out.println("您的分数为：" + score + "分");
        if (score >= 10 && score <= 15){
            System.out.println("10-15分→契合度：★\n" + "很遗憾，通过上面的测试可以看出，你和恋人的契合度很低，你们或许不适合在一起，或者你们之间的感情出现了不可调和的隔阂。\n或许你们自己也开始明白了，对方并不是你对的人，但是由于一些原因，暂时无法离开对方，所以感情也只能是勉强的维系着。你们之间的问题是缺乏信任，缺乏理解与支持，还有很多很多。");
        }else if(score >= 16 && score <= 20){
            System.out.println("16-20分→契合度：★★★\n" +"通过以上的测试开始发现，你们的感情维持起来其实挺难得，但是同时也发现了你们的进步之处。你们现在的阶段正在处在磨合期，需要用更大的包容心来对待对方，给予对方充分的理解与尊重才是最重要的。\n爱情中不能有太强的个人意识，因为爱情一个人时不能完成的，而是两个人的事情，所以，路漫漫其修远，还需要不断的磨合。");
        }else if(score >= 21 && score <= 25){
            System.out.println("21-25分→契合度：★★★★\n" + "通过上面的测试可以看到你们之间是有未来的，并且你深爱着对方，对方也很在意你，你们都本着向好的方向发展，有一定的包容性，可以理解并且给予对方支持与尊重。\n虽然也会有分析，但是可以很好的化解掉，你们的关系基本算是过了磨合期，可能会迎来更重要的时期了，所以说，这对双方来说都是一个考验，忠诚是爱情的基石。");
        }else{
            System.out.println("26-30分→契合度：★★★★★\n" + "恭喜你们，通过测试可以看出你们的契合度几乎完美。你们彼此相辅相成，可以说是天赐良缘了。\n你们能够给予对方一种安全可靠的感觉，这种感觉不是在言语上的，而是有内心散发出来的一种力量，能够支撑你们度过一个又一个的难关，帮助你们在迷茫时找到方向，在心累的时候找到温暖，你爱对了人，对方也爱对了你。");
        }
    }
}
