package paytm;

class ReverseWords {

    public static void main(String[] args) {
        String str = "I can do it";
        System.out.println(str +" : "+reverseWords(str) + " : "+reverseWords1(str));
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
// split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

    public static String reverseWords1(String in) {
        int index;
        String result="";
        while ((index = in.indexOf(" ")) >= 0) {
            result = in.substring(0, index) + " " + result;
            in = in.substring(index + 1);
        }
        return in + " " + result;
    }
}