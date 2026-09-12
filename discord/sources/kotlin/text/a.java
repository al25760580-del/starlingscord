package kotlin.text;

/* JADX INFO: loaded from: classes3.dex */
public class a extends CharsKt__CharJVMKt {
    public static final boolean a(char c8, char c10, boolean z5) {
        if (c8 == c10) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
