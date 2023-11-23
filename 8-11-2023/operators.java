/**
 *  Arthemetic operators

public class operators {
    public static void main(String[] args) {
        int num1=99;
        // num1=num1+1;
        // num1++;     ---post increment
        // ++num1;      ----pre increment
        // System.out.println(num1);
        // int result=num1++;      --fetch first incren=ment next
        int result=++num1;     //--- increment itself first fetch next
        System.out.println(result);
    }
    
}

 */

 /**
 *  relational operators

public class operators {
    public static void main(String[] args) {
        int x=99;
        int y=100;
        // boolean result = x>y;
        // boolean result = x==y;
        // boolean result = x<y;
        // boolean result = x!=y;
        // boolean result = x>=y;
        boolean result = x<=y;
        System.out.println(result);
    }
    
}
 */

/*
  Logical Operators
 */

 public class operators {
    public static void main(String[] args) {
        int x=6;
        int y=5;
        int a=56;
        int b=99;

        // boolean result = x>=y || a<b || a==y;
        // boolean result = x>=y || a<b;
        // boolean result = x>y && a>=b;
        //  boolean result = x>y && a<b;
        boolean result=x<y || a>b;
        // boolean result = x<y && a<b;
        System.out.println(result);
    }
    
}