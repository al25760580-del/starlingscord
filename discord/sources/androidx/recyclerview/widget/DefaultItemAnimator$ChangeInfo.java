package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultItemAnimator$ChangeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView.ViewHolder f2450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.ViewHolder f2451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2455f;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
        sb2.append(this.f2450a);
        sb2.append(", newHolder=");
        sb2.append(this.f2451b);
        sb2.append(", fromX=");
        sb2.append(this.f2452c);
        sb2.append(", fromY=");
        sb2.append(this.f2453d);
        sb2.append(", toX=");
        sb2.append(this.f2454e);
        sb2.append(", toY=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f2455f, '}');
    }
}
