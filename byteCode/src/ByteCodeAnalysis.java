public class ByteCodeAnalysis {

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
         final byte b_a = 100;
         final byte b_b = -1;

         final short s_a = 10;
         final short s_b = -5;

         int i_a = 11;
         int i_b = -12;

         long l_a = 200;
         long l_b = -200;

         float f_a = -10.5f;
         float f_b = 10.1f;

         double d_a = 17.12;
         double d_b = -11.22;

         boolean is_a = false;
         boolean is_b = true;

         final char c_a = 'A';
         final char c_b = 'c';
        //byte四则运算
        byte b_result_addition = b_a + b_b ;
        byte b_result_subtraction = b_a - b_b;
        byte b_result_multiplication = b_a * b_b;
        byte b_result_division = b_a / b_b;
        System.out.println("b_result_addition: "+b_result_addition);
        System.out.println("b_result_subtraction: "+b_result_subtraction);
        System.out.println("b_result_multiplication: "+b_result_multiplication);
        System.out.println("b_result_division: "+b_result_division);

        //short四则运算
        short s_result_addition = s_a + s_b;
        short s_result_subtraction = s_a - s_b;
        short s_result_multiplication = s_a * s_b;
        short s_result_division = s_a / s_b;
        System.out.println("s_result_addition: "+s_result_addition);
        System.out.println("s_result_subtraction: "+s_result_subtraction);
        System.out.println("s_result_multiplication: "+s_result_multiplication);
        System.out.println("s_result_division: "+s_result_division);

        //int四则运算
        int i_result_addition = i_a + i_b;
        int i_result_subtraction = i_a - i_b;
        int i_result_multiplication = i_a * i_b;
        int i_result_division = i_a / i_b;
        System.out.println("i_result_addition: "+i_result_addition);
        System.out.println("i_result_subtraction: "+i_result_subtraction);
        System.out.println("i_result_multiplication: "+i_result_multiplication);
        System.out.println("i_result_division: "+i_result_division);

        //long四则运算
        long l_result_addition= l_a + l_b;
        long l_result_subtraction = l_a - l_b;
        long l_result_multipication = l_a * l_b;
        long l_result_division = l_a / l_b;
        System.out.println("l_result_addition: "+l_result_addition);
        System.out.println("l_result_subtraction: "+l_result_subtraction);
        System.out.println("l_result_multipication: "+l_result_multipication);
        System.out.println("l_result_division: "+l_result_division);


        //float四则运算
        float f_result_addition = f_a + f_b;
        float f_result_subtraction = f_a - f_b;
        float f_result_multipication = f_a * f_b;
        float f_result_division = f_a / f_b;
        System.out.println("f_result_addition: "+f_result_addition);
        System.out.println("f_result_subtraction: "+f_result_subtraction);
        System.out.println("f_result_multipication: "+f_result_multipication);
        System.out.println("f_result_division: "+f_result_division);

        //double四则运算
        double d_result_addition = d_a + d_b;
        double d_result_subtraction = d_a - d_b;
        double d_result_multipication = d_a * d_b;
        double d_result_division = d_a / d_b;
        System.out.println("d_result_addition: "+d_result_addition);
        System.out.println("d_result_subtraction: "+d_result_subtraction);
        System.out.println("d_result_multipication: "+d_result_multipication);
        System.out.println("d_result_division: "+d_result_division);


        //char四则运算
        char c_result_addition = c_a + c_b;
        char c_resullt_subtraction = c_b - c_a;
        char c_result_multipication = c_a * c_b;
        char c_result_division = c_a / c_b;
        System.out.println("c_result_addition: "+c_result_addition);
        System.out.println("c_resullt_subtraction: "+c_resullt_subtraction);
        System.out.println("c_result_multipication: "+c_result_multipication);
        System.out.println("c_result_division: "+c_result_division);


        //if运算
        if(i_a>i_b){
            is_a = true;
            System.out.println("is_a: "+is_a);
        }

        //for运算
        for(int i = 0;i<10;i++){
            i_a += i_b;
            System.out.println("i_a: "+i_a);
        }

        if (is_a) {
            return ;
        }


    }
}
