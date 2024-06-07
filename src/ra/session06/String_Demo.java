package ra.session06;

public class String_Demo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi bằng String Literal (primitive - immutable)
        String str1 = "Rikkei Academy";
        String str2 = "Rikkeisoft";
        String str3 = "Rikkei Academy";
        //2. Khởi tạo chuỗi bằng constructor của lớp String (Reference)
        String str4 = new String("Rikkei Academy");
        String str5 = new String("Rikkeisoft");
        String str6 = new String("Rikkei Academy");
        //3. So sánh chuỗi với equals - boolean str1.equals(str2)
        System.out.println("Kết quả so sánh str1 và str2 với equals: " + str1.equals(str2));
        System.out.println("Kết quả so sánh str1 và str3 với equals: " + str1.equals(str3));
        System.out.println("kết quả so sánh str1 và str4 với equals: " + str1.equals(str4));
        System.out.println("kết quả so sánh str4 và str6 với equals: " + str4.equals(str6));
        //4. So sánh chuỗi với toán tử ==
        System.out.println("Kết quả so sánh str1 == str3: " + (str1 == str3));
        System.out.println("kết quả so sánh str1 == str4: " + (str1 == str4));
        System.out.println("kết quả so sánh str4 == str6: " + (str4 == str6));
        //5. int length(): độ dài chuỗi
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        //6. char str.charAt(index): Trả về ký tự tại chỉ số index
        System.out.println("Ký tự có chỉ số 1 trong chuỗi str1: " + str1.charAt(1));
        //7. String str1.concat(str2): Nối chuỗi str1 với str2 và trả về chuỗi mới
        String str7 = " - Học viện đào tạo CNTT";
        System.out.println("Nối chuỗi str1 và str7: " + str1.concat(str7));
        //8. String str.toUpperCase(): Trả về chuỗi viết hoa tất cả ký tự
        System.out.println("Viết hoa chuỗi str1: " + str1.toUpperCase());
        //9. String str.toLowerCase(): Trả về chuỗi viết thường tất cả ký tự
        System.out.println("Viết thường chuỗi str1: " + str1.toLowerCase());
        //10. String str.trim(): Trả về chuỗi mới và cắt các khoảng trắng 2 đầu
        String str8 = "           Rikkei Academy           ";
        System.out.println("Cắt khoảng trắng 2 đầu chuỗi str8: " + str8.trim());
        //11. boolean str1.equalIngoreCase(str2): So sánh không phân biệt hoa thường
        String str9 = "riKKei aCaDemy";
        System.out.println("So sánh chuỗi str1 và str9 với equals: " + str1.equals(str9));
        System.out.println("So sánh chuỗi str1 và str9 với equalIngnoreCase: " + str1.equalsIgnoreCase(str9));
        //12. int str1.compareTo(str2): Trả lại độ chênh giữa chuỗi str1 và str2
        String str10 = "ABCD";
        String str11 = "ABFD";
        System.out.println("Compare chuỗi str10 và str11: " + str10.compareTo(str11));
        //13. boolean str1.contains(str2): Kiểm tra chuỗi str2 có trong str1 hay không
        String str12 = "kkei";
        System.out.println("Kiểm tra chuỗi str12 có trong str1 hay không: " + str1.contains(str12));
        //14. int str1.indexOf(str2): Trả ra chỉ số của chuỗi str2 trong chuỗi str1
        System.out.println("Chỉ số chuỗi str12 trong str1 là: " + str1.indexOf(str12));
        //15. String str.replace("old","new"): Thay thế chuỗi old thành new trong str
        String str13 = "Rikkei Academy - Học viện CNTT của Rikkei";
        System.out.println("Thay thế chuỗi Rikkei thành chuỗi RK trong str13: "
                + str13.replace("Rikkei", "RK"));
        //16. boolean str.startWith("prefix"): Kiểm tra chuỗi str bắt đầu là chuỗi prefix không
        System.out.println("Kiểm tra chuỗi str13 có phải bắt đầu là Rikkei không: "
                + str13.startsWith("Rikkei"));
        //17. boolean str.endWith("suffix"): Kiểm tra chuỗi str kết thúc là chuỗi suffix không
        System.out.println("Kiểm tra chuỗi str13 có phải kết thúc là Rikkei không: "
                + str13.endsWith("Rikkei"));
        //18. String[] split(String delimiter): Cắt chuỗi thành mảng theo chuỗi delimiter
        String str14 = "Rikkei Academy Happy";
        String[] arrString = str14.split(" ");
        for (String str : arrString) {
            System.out.println(str);
        }
        //19. String str.subString(int beginIndex): Cắt chuỗi từ chỉ số beginIndex đến cuối
        System.out.println("Cắt chuỗi str14 từ chỉ số 7 đến cuối: " + str14.substring(7));
        //20. String str.subString(int beginIndex, int endIndex): Cắt từ chỉ số beginIndex đến endIndex-1
        System.out.println("Cắt chuỗi str14 từ chỉ số 7 dến 14: " + str14.substring(7, 14));
        //21. char[] str.toCharArray(): chuyển chuỗi thành mảng ký tự
        char[] arrChars = str14.toCharArray();
        System.out.println("Giá trị các phần tử trong mảng arrChars: ");
        for (char c : arrChars) {
            System.out.println(c);
        }


    }
}
