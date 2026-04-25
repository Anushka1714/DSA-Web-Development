public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
//in string builder we have almost all functions of strings but we still use append function to insert the letters one by one.
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        } 
        System.out.println(sb);
    }
}
//  TC = O(26)
//  if we have taken a string it will take TC = O(n^2)