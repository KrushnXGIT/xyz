//write a java prohgramm to count uppercase and lower case letter from given string



class counter{
    public void count(String s){
        int countlo=0;
        int countup=0;
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                countlo++;
            }
            if(Character.isUpperCase(ch)){
                countup++;
            }
        }
        System.out.println(countlo);
        System.out.println(countup);
    }
    public static void main(String[] args){
        counter c = new counter();
        c.count("JSKjdjks");
    }
}