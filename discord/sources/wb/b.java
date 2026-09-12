package wb;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec.a f22080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec.a f22081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22082d;

    public b(Context context, ec.a aVar, ec.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f22079a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f22080b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f22081c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f22082d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f22079a.equals(bVar.f22079a) && this.f22080b.equals(bVar.f22080b) && this.f22081c.equals(bVar.f22081c) && this.f22082d.equals(bVar.f22082d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22079a.hashCode() ^ 1000003) * 1000003) ^ this.f22080b.hashCode()) * 1000003) ^ this.f22081c.hashCode()) * 1000003) ^ this.f22082d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f22079a);
        sb2.append(", wallClock=");
        sb2.append(this.f22080b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f22081c);
        sb2.append(", backendName=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f22082d, "}");
    }
}
