public class substring {
    public static String substrings(String str ,int si, int ei){
        String substr ="";
        for(int i=si;i<ei;i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //substring
        String str = "HelloWorld";
        // System.out.println(substrings(str, 0, 5));



// by using function by which we can find the substring of any string
         System.out.println(str.substring(0,5));

    }
}
 