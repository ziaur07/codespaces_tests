class practise {
    public static void main(String[] args) {
        String str = "hello my name is zia";
        str += " ";
        String str2 = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (ch == ' ') {

                str2 = word + " " + str2;
                word = "";

            }

        }
        System.out.println(str2);

    }
}