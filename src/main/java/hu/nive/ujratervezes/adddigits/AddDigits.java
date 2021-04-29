package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null) {
            return -1;
        }
        char[] inputInChars = input.toCharArray();
        int result = 0;
        for (char ch : inputInChars) {
            try {
                result += Integer.parseInt(String.valueOf(ch));
            } catch (NumberFormatException ignored) {}
        }
        return input.equals("") ? -1 : result;
    }

}
