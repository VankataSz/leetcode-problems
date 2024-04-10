public class ReverseBits_190_ {
    public static void main(String[] args) {

        int result = reverseBits(43261596);
        System.out.println(result);

    }



    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
}



