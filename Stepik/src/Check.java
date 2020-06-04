public class Check {
    public boolean checkOneLine(boolean a, boolean b, boolean c, boolean d) {
        return a != b && c != d || b != c && a != d;
    }
}
