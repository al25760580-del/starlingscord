package i1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f11357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11360g;

    public c(List list, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.f11354a = str;
        str2.getClass();
        this.f11355b = str2;
        this.f11356c = str3;
        list.getClass();
        this.f11357d = list;
        this.f11358e = str4;
        this.f11359f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f11360g = com.discord.chat.presentation.list.a.l(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f11354a + ", mProviderPackage: " + this.f11355b + ", mQuery: " + this.f11356c + ", mSystemFont: " + this.f11358e + ", mVariationSettings: " + this.f11359f + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f11357d;
            if (i7 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i7);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i7++;
        }
    }
}
