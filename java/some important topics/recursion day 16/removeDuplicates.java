public class removeDuplicates {
    public static String removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return newStr.toString();
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){

            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
            
        }
        return newStr.toString();
    }

     public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        removeDuplicates(str, 0, new StringBuilder(""), map);
    }
}
