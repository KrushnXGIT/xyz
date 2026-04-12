//Wrapper classes

class Caller{
    static int myNumber(String s){
        int ans =0;
        for(int i=0;i<s.length();i++){
            int n= s.codePointAt(i)-48;
            ans=ans*10+n;
        }
        return ans;
    }
    public static void main(String[] args) {
        //Convert String to Int
        String s1="123",s2="5";
        int ans=myNumber(s1)+myNumber(s2);
        System.out.println(ans);

        //instead of all this we can
        Integer a= Integer.valueOf(s1) + Integer.valueOf(s2);
        System.out.println(a);

    }
}