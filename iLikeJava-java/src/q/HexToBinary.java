package q;

import java.math.BigInteger;

public class HexToBinary {

    public static void main(String[] args) {
        String hexString = "0xA"; // 添加 "0x" 前缀

        BigInteger decimal = new BigInteger(hexString, 16);
        String binaryString = decimal.toString(2);

        System.out.println("二进制表示为：" + binaryString);
    }
}
