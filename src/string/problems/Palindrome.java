package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        String name= "MADAM";
        String reverseName= " ";
        for(int i=name.length()-1;i>=0;i--){
            char val = name.charAt(i);
            reverseName += val;
        } if (name.equals(reverseName)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }

    }
}
