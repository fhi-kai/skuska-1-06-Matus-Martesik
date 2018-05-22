public class spolocnaCislica {

    public  static boolean overenie (int prve, int druhe) {

        int a = prve / 10;
        int b = prve % 10;
        int c = druhe / 10;
        int d = druhe % 10;

        if ((a == b) || (a == c) || (a == d))
            return true;
        else if (b == c || b == d || c == d)
            return true;

        else return false;

    }
}
