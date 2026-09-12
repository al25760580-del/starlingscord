package ei;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8307c;

    public f0(Object obj, Object obj2, Object obj3) {
        this.f8305a = obj;
        this.f8306b = obj2;
        this.f8307c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f8305a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f8306b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f8307c);
        StringBuilder sb2 = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return new IllegalArgumentException(com.discord.chat.presentation.list.a.l(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
