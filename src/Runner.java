public class Runner {

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(doubleX("aaxxa"));
        System.out.println(makeOutWord("<<>>", "Yay"));
        int[] x = {1, 2, 3};
        int[] y= {7, 3};
        System.out.println(commonEnd( x, y) );
        System.out.println(love6(6, 4));
        System.out.println(noTeenSum(2, 1, 14));
        System.out.println(doubleChar("Hi-There"));
        System.out.println(gHappy("xxgggxyg"));
        int[] nums ={2, 1, 2, 3, 4};
        System.out.println(countEvens(nums));
        int [] a= {1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(a));
    }
    public static int diff21(int n) {
        if(n==21){
            return 0;
        }
        if(n>21){
            return 2*(n-21);
        }
        return 21-n;
    }
    public static boolean doubleX(String str) {
        if(str.length()<2||str.indexOf("x")==str.length()-1||str.indexOf("x")==-1){
            return false;
        }
        if(str.substring(str.indexOf("x"),str.indexOf("x")+2).equals("xx")){
            return true;
        }

        return false;
    }
    public static String makeOutWord(String out, String word) {
        String x="";
        for (int i=0; i<2;i++){
            if(i<2){
                x+= out.substring(i,i+1);
            }
        }
        for (int i=0; i<word.length();i++){
            x+= word.substring(i,i+1);
        }
        for(int i=2;i<4;i++){
            x+= out.substring(i,i+1);
        }
        return x;
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0]||a[ a.length -1]==b[b.length-1]){
            return true;
        }
        return false;
    }
    public static boolean love6(int a, int b) {
        if(a==6||b==6||a+b==6||Math.abs(a-b)==6){
            return true;
        }
        return false;
    }
    public static int noTeenSum(int a, int b, int c) {
        int x=0;
        x+=findTeen(a);
        x+=findTeen(b);
        x+=findTeen(c);
        return x;
    }
    public static int findTeen(int x){
        if(x>16&&x<20||x==13||x==14){
            return 0;
        }else{
            return x;
        }
    }
    public static String doubleChar(String str) {
        String x= "";
        for (int i=0; i<str.length();i++){
            x+= str.substring(i,i+1);
            x+= str.substring(i,i+1);
        }
        return x;
    }


    public static boolean gHappy(String str) {
        if(str.length()==1){
            return false;
        }
        if(str.length()==0){
            return true;
        }
        for (int i=1; i<str.length()-1;i++){
            if(str.substring(i,i+1).equals("g")){
                if(str.substring(i-1,i).equals("g")||str.substring(i+1,i+2).equals("g")){

                }else{
                    return false;
                }
            }
            if(i==str.length()-2){
                i++;
                if(str.substring(i,i+1).equals("g")){
                    if(str.substring(i-1,i).equals("g")){

                    }else{
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static int countEvens(int[] nums) {
        int x =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                x++;
            }
        }
        return x;
    }

    public static int maxSpan(int[] nums) {
        int x=0;
        int y=0;
        int q =0;
        for(int i=0;i<nums.length;i++){
            for(int z=nums.length-1;z>=0;z--){
                q = z;
                if(nums[i]==nums[z]){
                    break;
                }
            }
            y = q-i+1;
            if(y>x){
                x=y;
            }
        }
        return x;
    }


}
