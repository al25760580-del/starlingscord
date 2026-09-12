package c5;

/* JADX INFO: loaded from: classes.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3486c;

    public /* synthetic */ e(int i7) {
        this.f3484a = i7;
    }

    public void a(int i7) {
        int i10;
        int i11 = this.f3486c;
        if (i11 < i7 || (i10 = this.f3485b) <= 0) {
            o8.a.z("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i7), Integer.valueOf(this.f3486c), Integer.valueOf(this.f3485b));
        } else {
            this.f3485b = i10 - 1;
            this.f3486c = i11 - i7;
        }
    }

    public int b() {
        int i7 = this.f3486c;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public ij.m c() {
        return new ij.m(this.f3485b, this.f3486c);
    }

    public String toString() {
        switch (this.f3484a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.f3485b);
                sb2.append(' ');
                return com.discord.chat.presentation.list.a.j(sb2, this.f3486c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i7, int i10, int i11) {
        this.f3484a = i11;
        this.f3485b = i7;
        this.f3486c = i10;
    }
}
