public class ByteCodeAnalysis2 {

    /*Java基本数据类型:
        六种数字类型（四个整数型，两个浮点型）
        一种字符型
        一种布尔型
        byte：
            八位有符号的，以二进制补码表示的整数
            最小值：-128（-2^7）
            最大值：127（2^7-1）
            默认值为0
            byte类型用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只有int类型的四分之一
        short：
            十六位有符号的，以二进制补码表示的整数
            最小值是：-32768（-2^15）
            最大值是：32767(2^15-1)
            short类型是int类型的1/2
        int:
            三十二位有符号的，以二进制补码表示的整数
            最小值是：-2147483648（-2^32）
            最大值是：2147483647（2^32-1）
            一般地整数型变量默认为int类型
            默认值是0
        long：
            六十四位有符号的，以二进制补码表示的整数；
            最小值是：-9223372036854775808（-2^63）
            最大值是：9223372036854775807（2^63 -1）
        float:
            三十二位，单精度，符合IEEE754标准的浮点数
            float在存储大型浮点数组的时候可以节省内存空间；
            默认值是0.0f；
            浮点数不能用来表示精确的值，如货币
        double：
            六十四位，双精度，符合IEEE754标准的浮点数
            浮点数的默认类型为double型
            double型同样不能表示精确的值，如货币
            默认值为0.0d
        boolean：
            boolean数据类型表示一位的信息
            只有两个取值：true和false
            默认值为false
        char：
            char类型为一个单一的16为Unicode字符
            最小值：\u0000(即为0)
            最大值:\uffff(即为65、535)
            char数据类型可以存储任何字符

     */


    public static void main(String[] args){
        //byte四则运算
        final byte b_a = 2;
        final byte b_b = -2;
        byte b_result_addition = b_a + b_b+2 ;
        byte b_result_subtraction = b_a - b_b;
        byte b_result_multiplication = b_a * b_b;
        byte b_result_division = b_a / b_b;

        System.out.println(b_result_addition);
        System.out.println(b_result_subtraction);
        System.out.println(b_result_multiplication);
        System.out.println(b_result_division);

    }
}
