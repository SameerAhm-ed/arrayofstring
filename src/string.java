public class string {

    int countOccurrences(char ch, String str) {
        str = convertToLowerCase(str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    String removeOccurrences(char ch, String str) {

        str = convertToLowerCase(str);
        str = str.replace(Character.toString(ch), "");
        return str;
    }

    String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    String convertToUpperCase(String str) {
        return str.toUpperCase();
    }


}
