public class Order {
    public static void main(String[] args){
        final String res = order("");
        System.out.println(res);

    }

    public static String order(final String words){
        if (words.length() == 0) return "";
        final String[] wrds = words.split(" ");
        final String[] res = new String[wrds.length];
        for (String wrd : wrds) {
            final char[] word = wrd.toCharArray();
            for (char c : word) {
                if (Character.isDigit(c)) {
                    res[Character.getNumericValue(c) - 1] = String.valueOf(word);
                    break;
                }
            }
        }
        return String.join(" ", res);
    }
}
