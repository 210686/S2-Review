import java.util.*;
public class NumberSequence{
    public static void Fibonacci(int n){
        for(int i=1;i<=n;i++){System.out.print(Fib2(i)+" ");}
    }
    public static int Fib2(int n){
        if(n<=2){return 1;}
        else{return Fib2(n-1)+Fib2(n-2);}
    }
    public static void Cubic(int n){
        ArrayList<Integer> cube = new ArrayList<Integer>(Arrays.asList(1,8,27,64,125,216,343,512,729,1000));
        for(int i=0;i<n;i++){System.out.print(cube.get(i)+" ");}
    }
    public static void Triangular(int n){
        for(int i=1;i<=n;){
            System.out.print(""+i*(i+1)/2+" ");
            i++;
        }
    }
    public static void Square(int n){
        int[] sqNum = new int[n];
        int count = 0;
        while(sqNum[n-1]==0){
            sqNum[count] = (int)Math.pow(count+1,2);
            count++;
        }
        for(int i: sqNum){
            System.out.print(""+i+" ");
        }
    }
    public NumberSequence(){
        Fibonacci(5);
        System.out.println();
        Cubic(7);
        System.out.println();
        Triangular(15);
        System.out.println();
        Square(9);
    }
    public static void main(String[] args){
        System.out.print("\f");
        Fibonacci(5);
        System.out.println();
        Cubic(7);
        System.out.println();
        Triangular(15);
        System.out.println();
        Square(9);
    }
}