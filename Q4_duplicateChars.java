public class Q4_duplicateChars {
    public static void main(String[] args) {
        String string1 = "duplicate characters in a string";
        int count;


        char c[] = string1.toCharArray();

        System.out.print("Duplicate characters in a given string: ");

        for(int i = 0; i <c.length; i++) {
            count = 1;
            for(int j = i+1; j <c.length; j++) {
                if(c[i] == c[j] && c[i] != ' ') {
                    count++;

                    c[j] = '0';
                }
            }

            if(count > 1 && c[i] != '0')
                System.out.print(c[i]+" ");
        }
    }
}