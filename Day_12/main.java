package Day_12;

public class main {
    public static void main(String[] args) {
        //sDeclaration
        StringBuilder sb = new StringBuilder("shreya Patil");
        System.out.println(sb);

        //Get A Character from Index
        //Set Char
        System.out.println(sb.charAt(0));

        //Set a Character at Index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //Insert a Character at Some Index
        sb.insert(0, 'S');
        System.out.println(sb);

        //Delete char at some Index
        sb.delete(0, 1);
        System.out.println(sb);

        //Append a char(Append means to add something at the end.)
        sb.append(" Here");
        System.out.println(sb);

        //Print Length of String
        System.out.println(sb.length());

        //Reverse a String (using StringBuilder class)
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
