package ho;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    public static int a(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    public static int b(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }
}
