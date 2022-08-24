public class test {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("4ABcDEfG123");
        System.out.println(str);
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = str.charAt(i);
            str.replace(i, i + 1, String.valueOf(str.charAt(str.length() - 1 - i)));
            str.replace(str.length() - 1 - i, str.length() - i, String.valueOf(temp));
        }
//        str.reverse();
        System.out.println(str);
        char stu;
        for (int i = 0; i < str.length(); i++) {
            stu = str.charAt(i);
            if (stu >= 'A' && stu <= 'Z') {
                str.replace(i, i + 1, String.valueOf(stu += 32));
            }
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            stu = str.charAt(i);
            if (stu >= 'a' && stu <= 'z') {
                str.replace(i, i + 1, String.valueOf(stu -= 32));
            }
        }
        System.out.println(str);
    }
}


