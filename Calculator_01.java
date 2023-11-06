import java.util.Scanner;
import java.util.regex.Matcher;
public class Calculator_01 {
    public static void main(String[] args) {
        //定义变量
        String s = "1+(3-1)*(1+1)/2";
        int sum = 0;
        char flag = '(';

        //字符串也可以使用一下代码输入
//        Scanner input = new Scanner(System.in);
//        s = input.nextLine();
        //如果碰到括号，调用test_brackets这个函数
        s = test_brackets(s);
        //如果碰到*，调用test_xing这个函数
        s = test_xing(s);
        //如果碰到/，调用test_chu这个函数
        s = test_chu(s);

        //当加减乘除最后都化解成 s = ”num1 + num1 + num1 +.....“ (其他三种就不写上来了，一样）
        //再调用test_for来算最后的结果
        sum =test_for(0,s.length(),0,s,flag);
        //最后将结果打印出来
        System.out.println(sum);

    }

    //计算括号里的数的函数，如（2+3)*(3+3)
    public static String test_brackets(String s){
        int num = 1;
        char flag = '+';
        int acout = 0;

        //循环s字符串，如果碰到右括号，那么b就加一，这样就可以知道一共要计算多少个括号了
        for (int i = 0;i < s.length();i++){
            char s2 = s.charAt(i);
            switch (s2){
                case '(':
                    acout += 1;
                    break;
            }
        }

        //定义一个数组，存在括号里计算出的值
        int[] _num = new int[acout];
        //for循环往数组添加结果
        for (int j = 0; j < acout; j++) {
            //如果碰到括号，就先将括号里的值计算出来，放到数组中
            int first = s.indexOf("(");
            int last = s.indexOf(")");

            _num[j] = test_for(first + 1, last, 0, s, flag);
            //substring函数，取字符串中想取的字符，通过加号将其拼接起来
            //比如，上面用test_for函数已经计算出了第一个括号里的值了
            //那么下面的s就是，从第0位开始取，first就是括号代表的位置，
            // 比如7*(8+2)*(3+2)，从第0位(也就是7)开始取，注意这里取不到first,所以只能取到first的前一位,也就是左括号前面一位字符
            //s的表达式就是 7*  +  (8+2) +  (3+2)，然后再循环，直到碰到括号，就会将括号里的值通过test_for计算出来再存放到数组中
            s = s.substring(0,first) + _num[j] + s.substring(last + 1);

        }
        //通过上面的for循环，已经将计算出来的结果存放进数组里了，这时候的表达式就是7*10*5了，括号已经没有了
        //然后在main函数里直接调用test_for就可以将这个表达式就算出来了
        return s;
    }

    //先计算乘法的函数  如1+3*2，先算3*2,实现思路和上面函数相同，不多注释
    public static String test_xing(String s){
        int acout = 0;
        char flag = '(';

        for (int i = 0;i < s.length();i++){
            char s2 = s.charAt(i);
            switch (s2){
                case '*':
                    acout += 1;
                    break;
            }
        }
        int[] _num1 = new int[acout];

        for (int j = 0;j < acout;j++){
            int start = s.indexOf("*");
            _num1[j] = test_for(start-1,start+2,0,s,'(');
            s = s.substring(0, start - 1) + _num1[j] + s.substring(start+2);

        }

        return s;
    }

    //先计算除法的函数  如1+4/2，先算4/2，实现思路和上面函数相同，不多注释
    public static String test_chu(String s){
        int acout = 0;
        char flag = '(';

        for (int i = 0;i < s.length();i++){
            char s2 = s.charAt(i);
            switch (s2){
                case '/':
                    acout += 1;
                    break;
            }
        }
        int[] _num1 = new int[acout];

        for (int j = 0;j < acout;j++){
            int start = s.indexOf("/");
            _num1[j] = test_for(start-1,start+2,0,s,'(');
            s = s.substring(0, start - 1) + _num1[j] + s.substring(start+2);

        }
        return s;
    }

    //定义函数，进行两个数的运算
    public static int test_switch(char flag,int num1,int num2) {

//        num2.matches("^[0-9]{1,7}$");
        switch (flag){
            case '(':
                //如果flag!=+ - * /,则将num2赋值给num1
                if(num2 == 0){
                    num1 += 9;
                }else {
                    num1 = num2;
                }
                break;
            case '+':
                if(num2 == 0){
                    num1 += 9;
                }else {
                    num1 += num2;
                }
                break;
            case '-':
                if(num2 == 0){
                    num1 -= 9;
                }else {
                    num1 -= num2;
                }
                break;
            case '*':
                if(num2 == 0){
                    num1 *= 10;
                }else {
                    num1 *= num2;
                }
                break;
            case '/':
                if(num2 == 0){
                    num1 /= 10;
                }else {
                    num1 /= num2;
                }
                break;
        }
        return num1;
    }

    public static int test_for(int star, int end, int num1, String s, char flag) {
        for (int i = star; i < end; i++) {
            char s1 = s.charAt(i);
            switch (s1) {
                case '+':
                    flag = '+';
                    break;
                case '-':
                    flag = '-';
                    break;
                case '*':
                    flag = '*';
                    break;
                case '/':
                    flag = '/';
                    break;
                case '(':
                    //如果碰到括号，就先将括号里的数机进行计算
                    int result = test_for(star, end, 0, s, flag);
                    num1 = test_switch(flag, num1, result);
                    break;
                default:
                    num1 = test_switch(flag, num1, Integer.parseInt(s1 + ""));
            }
        }
        return num1;
    }


}
