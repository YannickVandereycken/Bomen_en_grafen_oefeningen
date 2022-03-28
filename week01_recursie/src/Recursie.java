import java.util.ArrayList;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if (getal <= 0) throw new IllegalArgumentException("Moet positief zijn");
        if (getal == 1) {
            return 1;
        }
        if (getal == 2) {
            return 1;
        }
        int fib = fibonacci(getal - 1) + fibonacci(getal - 2);
        return fib;
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        if (getal <= 9 && getal >= -9) return Math.abs(getal);
        int som = Math.abs(getal % 10) + (somVanCijfers(getal / 10));
        return som;
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if (s == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        if (s.isBlank() || s.isEmpty()) return "";
        if (s.length() == 1) return s;
        return s.substring(s.length() - 1) + keerOm(s.substring(0, s.length() - 1));
    }

    //oefening 4: countX
    public static int countX(String s) {
        if (s == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        if (s.isBlank() || s.isEmpty()) return 0;
        int getal = 0;
        if (s.substring(s.length() - 1).equals("x")) {
            getal += 1;
        }
        return getal + countX(s.substring(0, s.length() - 1));
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if (s == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        if (s.isBlank() || s.isEmpty() || s.length() == 1) return 0;
        int getal = 0;
        if (s.endsWith("hi")) {
            getal += 1;
        }
        return getal + countHi(s.substring(0, s.length() - 1));
    }

    // oefening 6
    public static String changeXY(String s) {
        if (s == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        if (s.length() == 1) {
            if (s.equals("x")) return "y";
            else return s;
        }
        if (s.substring(0, 1).equals("x")) return "y" + changeXY(s.substring(1));
        else return s.substring(0, 1) + changeXY(s.substring(1));
        //return s.replaceAll("x","y");
    }

    // oefening 7
    public static String changePi(String s) {
        if (s == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        if (s.length() == 2) {
            if (s.equals("pi")) return "3.14";
            else return s;
        }
        if (s.substring(0, 2).equals("pi")) return "3.14" + changePi(s.substring(2));
        else return s.substring(0, 1) + changePi(s.substring(1));
        //return s.replaceAll("pi", "3.14");
    }

    // oefening 8:
    public static int tweelog(int getal) {
        if (getal == 0) throw new IllegalArgumentException();
        if (getal == 1) return 0;
        if (getal == 2) return 1;
        else return 1 + tweelog(getal / 2);
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        if (lijst == null || lijst.size() == 0) throw new IllegalArgumentException();
        if (lijst.size() == 1) return lijst.get(0);
        if (lijst.get(0) > findMaximum(lijst.subList(1, lijst.size()))) return lijst.get(0);
        else return lijst.get(1);
    }

    // oefening 10;
    // string abc --> [a, b, c, bc, ab, ac, abc]
    public static ArrayList<String> findSubstrings(String string) {
        if (string == null) throw new IllegalArgumentException("Mag niet leeg zijn");
        ArrayList<String> result = new ArrayList<>();
        if (string.isBlank()) {
            result.add("");
            return result;
        }
        if (string.length() == 1) {
            result.add(string);
            return result;
        } else {
            result.add(string);
            result.add(string.substring(0, 1));
            if (string.length() > 2) {
                for (int i = 1; i < (string.length()); i++) {
                    result.add(string.substring(0, 1)+string.substring(i,i+1));
                }
            }
            result.addAll(findSubstrings(string.substring(1)));
            //System.out.println(result);
            return result;
        }
    }

    // oefening 11;
    public static int aantalKaarten(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return 2;
        return 2 * n + (n - 1) + aantalKaarten(n - 1);
    }

}