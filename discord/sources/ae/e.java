package ae;

import android.graphics.Color;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f387i;
    public final int j;

    public e(String str, int i7, Integer num, Integer num2, float f2, boolean z5, boolean z6, boolean z7, boolean z10, int i10) {
        this.f379a = str;
        this.f380b = i7;
        this.f381c = num;
        this.f382d = num2;
        this.f383e = f2;
        this.f384f = z5;
        this.f385g = z6;
        this.f386h = z7;
        this.f387i = z10;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z5;
        try {
            int i7 = Integer.parseInt(str.trim());
            switch (i7) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z5 = true;
                    break;
                default:
                    z5 = false;
                    break;
            }
            if (z5) {
                return i7;
            }
        } catch (NumberFormatException unused) {
        }
        a3.e.y("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e10) {
            je.b.O("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            je.b.g(j <= 4294967295L);
            return Integer.valueOf(Color.argb(c0.e(((j >> 24) & 255) ^ 255), c0.e(j & 255), c0.e((j >> 8) & 255), c0.e((j >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            je.b.O("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
