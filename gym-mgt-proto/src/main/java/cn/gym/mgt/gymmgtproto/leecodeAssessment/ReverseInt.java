package cn.gym.mgt.gymmgtproto.leecodeAssessment;

public class ReverseInt {

    private String string;
    private StringBuilder stringBuilder;
    private StringBuffer stringBuffer;

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
//        int reverse = reverseInt.reverse(1234987729);
//        System.out.println(reverse);

        reverseInt.isValid("{}");
    }

    public void example() {


    }

    public int reverse(int x) {

        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }


    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
//        return s.contains();
        return false;
    }
}
