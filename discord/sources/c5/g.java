package c5;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3490b;

    public g(String str, String str2) {
        this.f3489a = str;
        this.f3490b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f3489a, gVar.f3489a) && TextUtils.equals(this.f3490b, gVar.f3490b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3490b.hashCode() + (this.f3489a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f3489a);
        sb2.append(",value=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f3490b, "]");
    }
}
