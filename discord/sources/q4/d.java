package q4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f18617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f18618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18620e;

    public d(ArrayList arrayList, char c8, double d6, String str, String str2) {
        this.f18616a = arrayList;
        this.f18617b = c8;
        this.f18618c = d6;
        this.f18619d = str;
        this.f18620e = str2;
    }

    public static int a(char c8, String str, String str2) {
        return str2.hashCode() + a3.e.d(c8 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f18617b, this.f18620e, this.f18619d);
    }
}
