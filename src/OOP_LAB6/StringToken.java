package OOP_LAB6;

public class StringToken {
    public static void main(String[] args) {

        String msg = "Hello, RMUTSV varunya";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer myBuf = new StringBuffer(myToken.nextToken());
            System.out.println(myBuf.reverse()+"  ");
        }//while


    }//main
}//class
