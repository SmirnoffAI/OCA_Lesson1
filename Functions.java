public class Functions {
    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    double avg(int a, int b, int c){
        double result2 = summa(5,5,20)/3;
        return result2;
    }
}

class FunctionsTest {
    public static void main(String[] args){
    Functions func = new Functions();
     double output = func.avg(5,5,20);
     System.out.println(output);
    }
}