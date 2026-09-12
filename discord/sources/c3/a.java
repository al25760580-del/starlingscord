package c3;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3428g;

    public a(String name, String type, String str, int i7, int i10, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f3422a = name;
        this.f3423b = type;
        this.f3424c = z5;
        this.f3425d = i7;
        this.f3426e = str;
        this.f3427f = i10;
        int i11 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.D(upperCase, "INT", false)) {
                i11 = 3;
            } else if (StringsKt.D(upperCase, "CHAR", false) || StringsKt.D(upperCase, "CLOB", false) || StringsKt.D(upperCase, "TEXT", false)) {
                i11 = 2;
            } else if (!StringsKt.D(upperCase, "BLOB", false)) {
                i11 = (StringsKt.D(upperCase, "REAL", false) || StringsKt.D(upperCase, "FLOA", false) || StringsKt.D(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f3428g = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f3425d != aVar.f3425d) {
                return false;
            }
            int i7 = aVar.f3427f;
            String str = aVar.f3426e;
            if (!Intrinsics.areEqual(this.f3422a, aVar.f3422a) || this.f3424c != aVar.f3424c) {
                return false;
            }
            String str2 = this.f3426e;
            int i10 = this.f3427f;
            if (i10 == 1 && i7 == 2 && str2 != null && !android.support.v4.media.session.b.f(str2, str)) {
                return false;
            }
            if (i10 == 2 && i7 == 1 && str != null && !android.support.v4.media.session.b.f(str, str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i7) {
                if (str2 != null) {
                    if (!android.support.v4.media.session.b.f(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f3428g != aVar.f3428g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f3422a.hashCode() * 31) + this.f3428g) * 31) + (this.f3424c ? 1231 : 1237)) * 31) + this.f3425d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f3422a);
        sb2.append("', type='");
        sb2.append(this.f3423b);
        sb2.append("', affinity='");
        sb2.append(this.f3428g);
        sb2.append("', notNull=");
        sb2.append(this.f3424c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f3425d);
        sb2.append(", defaultValue='");
        String str = this.f3426e;
        if (str == null) {
            str = "undefined";
        }
        return com.discord.chat.presentation.list.a.k(sb2, str, "'}");
    }
}
