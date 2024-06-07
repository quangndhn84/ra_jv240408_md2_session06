package ra.session06;

import java.util.regex.Pattern;

public class Regex_Demo {
    public static void main(String[] args) {
        String phoneRegex = "0\\d{9}";
        String phone = "1355914029";
        boolean result = Pattern.matches(phoneRegex, phone);
        System.out.println("Kết quả so khớp: " + result);
        System.out.println("So khớp chuỗi Java: " + Pattern.matches("Java", "Jbva"));
        //. đại diện cho 1 ký tự bất kỳ
        System.out.println("Kết quả .: " + Pattern.matches("J..a", "Java"));
        //(ab|cd): nhận 1 trong 2 giá trị ab hoặc cd
        System.out.println("Kết quả ab|cd: " + Pattern.matches("(J|T)ava", "Tava"));
        //[abc]: nhận 1 trong 3 giá trị a hoặc b hoặc c
        System.out.println("Kết quả [abc]:" + Pattern.matches("[JTA]ava", "Aava"));
        //Mã sản phẩm gồm 4 ký tự, bắt đầu C-S-A
        String productIdRegex = "[CSA]\\w{3}";
        String productId = "CA01";
        System.out.println("Product Regex Result: "+Pattern.matches(productIdRegex,productId));
    }
}
