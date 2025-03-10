// import java.util.*;
class stringBuilder {
    //StringBuilder are faster then using normal strings because it not created new memory after any action
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");
        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.reverse());
        //reversing the character of any string
        for(int i=0; i<sb.length()/2; i++) { //we need to traverse only half string
            int front = i;
            int back = sb.length() - 1 - i; //5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}