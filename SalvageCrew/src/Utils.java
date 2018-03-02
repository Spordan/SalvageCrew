import java.util.Random;

public class Utils {

    public static int RollXD6(int D6) {

        Random r = new Random();
        int low = 1;
        int high = 6;
        int result = 0;

        for(int i = 0; i < D6; i++) {
            result = result + (r.nextInt(high - low) + low);
        }

        return result;
    }

    public static int RollD100() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high - low) + low;

        return result;
    }

}
