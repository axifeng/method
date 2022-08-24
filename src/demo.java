import java.util.Scanner;

public class demo {
    public static void main(String[] args)
    {
        System.out.println("输入的字符串为：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z'))//读取的单个字符在'a'和'z'之间才可以转换
            {
                ch=(char)((int)ch-32);//先将字符ch转换为整型计算ASCII码，再转换为字符型输出字符A~Z的ASCII码为65~90，字符a~z的ASCII码为97~122，每个大小写字符的ASCII码都相差32,因此用小写字符的ASCII码 减去32即可得到该字符的大写形式
            }
            str1+=ch;
        }
        System.out.println("方法一输出的字符串为：");
        System.out.println(str1);
        System.out.println("方法二输出的字符串为：");
        System.out.println(str.toUpperCase());//toUpperCase()将字母转换为大写
    }

}
