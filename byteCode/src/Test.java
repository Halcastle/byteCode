
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        int x = -1234;
//        System.out.println(intToByte(x));
        final byte b_a = 99;
        final byte b_b = -1;
        byteToInt(b_a);
    }

    /**
     * byte转int类型
     * 如果byte是负数，则转出的int型是正数
     * @param b
     * @return
     */
    public static int byteToInt(byte b){
        System.out.println("byte 是:"+b);
        int x = b & 0xff;
        System.out.println("int 是:"+x);
        return x;
    }
    /**
     * int 类型转换为byte 类型
     * 截取int类型的最后8位,与 0xff
     * @param x
     * @return
     */
    public static byte intToByte(int x){
        System.out.println("int 是:"+x);
        System.out.println("int的二进制数据为:"+Integer.toBinaryString(x));
        byte b =(byte) (x & 0xff);
        System.out.println("截取后8位的二进制数据为:"+Integer.toBinaryString(x & 0xff));
        System.out.println("byte 是:"+b);
        return b;
    }
    /*
     * 把整数转换为字节数组：整数是32位，8位一个字节，依次读取8位，转化为字节数组
     * 整数与0xff,取得最后8位,生成整数,再强转为第3个byte
     * 整数右移8位,与0xff,取得倒数第二组8位,生成整数,再强转为第2个byte
     * 整数右移16位,与0xff,取得倒数第3组8位,生成整数,再强转为第1个byte
     * 整数右移24位,与0xff,取得倒数第4组8位,生成整数,再强转为第0个byte
     */
    public static byte[] intToByteArr(int x){
        System.out.println("int 是:"+x);
        byte[] arr = new byte[4];
        arr[3]= (byte)(x & 0xff);
        arr[2]= (byte)(x>>8 & 0xff);
        arr[1]= (byte)(x>>16 & 0xff);
        arr[0]= (byte)(x>>24 & 0xff);
        System.out.print("转换后的字节数组是:");
        for(byte temp : arr){
            System.out.print(temp+" ");
        }
        System.out.println("");
        return arr;
    }
    /**
     * byte数组转换为整数
     * 第0个byte与上0xff,生成整数,在右移24位，取得一个整数
     * 第1个byte与上0xff,生成整数,在右移16位，取得一个整数
     * 第2个byte与上0xff,生成整数,在右移8位，取得一个整数
     * 第3个byte与上0xff,生成整数
     * 把四个整数做或操作,转换为已整数
     */
    public static int byteArrToInt(byte[] arr){
        System.out.print("需要转换的字节数组是:");
        for(byte temp : arr){
            System.out.print(temp+" ");
        }
        System.out.println("");
        int x = ((arr[0] & 0xff) << 24 )|((arr[1]& 0xff) <<16 )|((arr[2] & 0xff)<<8)|(arr[3] & 0xff);
        System.out.println("转换后的整数是:"+x);
        return x;
    }



}