class ReverseWords {
    public static void main(String[] args) {
        String input = "I Like to code Java";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
