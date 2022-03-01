import java.util.ArrayList;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if(getal<=0){throw new IllegalArgumentException("Moet positief zijn");}
        if(getal==1){return 1;}
        if(getal==2){return 1;}
        int fib=fibonacci(getal-1)+fibonacci(getal-2);
        return fib;
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        if(getal<=9 && getal >=-9){return Math.abs(getal);}
        int som = Math.abs(getal%10) + (somVanCijfers(getal/10));
        return som;
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if(s==null){throw new IllegalArgumentException("Mag niet leeg zijn");}
        if(s.isBlank() || s.isEmpty()){return "";}
        if(s.length()==1) return s;
        return s.substring(s.length()-1) + keerOm(s.substring(0,s.length()-1));
    }

    //oefening 4: countX
    public static int countX(String s) {
        if(s==null){throw new IllegalArgumentException("Mag niet leeg zijn");}
        if(s.isBlank() || s.isEmpty()){return 0;}
        int getal = 0;
        if(s.substring(s.length()-1).equals("x")){getal+=1;}
        return getal + countX(s.substring(0,s.length()-1));
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if(s==null){throw new IllegalArgumentException("Mag niet leeg zijn");}
        if(s.isBlank() || s.isEmpty() || s.length()==1){return 0;}
        int getal = 0;
        if(s.endsWith("hi")){getal+=1;}
        return getal + countHi(s.substring(0,s.length()-1));
    }

    // oefening 6
    public static String changeXY(String s) {
        if(s==null){throw new IllegalArgumentException("Mag niet leeg zijn");}
        return s.replaceAll("x","y");
    }

    // oefening 7
    public static String changePi(String s) {
        if(s==null){throw new IllegalArgumentException("Mag niet leeg zijn");}
        return s.replaceAll("pi","3.14");
    }

    // oefening 8:
    public static int tweelog(int getal) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 11;
    public static int aantalKaarten(int n){
        throw new UnsupportedOperationException("Not yet implemented");
    }

}