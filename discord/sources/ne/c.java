package ne;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16563e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i7 = this.f16563e;
        int i10 = cVar.f16563e;
        return i7 != i10 ? i7 - i10 : this.f16562d - cVar.f16562d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Order{order=");
        sb2.append(this.f16563e);
        sb2.append(", index=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f16562d, '}');
    }
}
