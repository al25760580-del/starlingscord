package he;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class m extends IOException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10627e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10628d;

    public m(int i7) {
        this.f10628d = i7;
    }

    public m(int i7, Exception exc) {
        super(exc);
        this.f10628d = i7;
    }

    public m(String str, int i7) {
        super(str);
        this.f10628d = i7;
    }

    public m(String str, Exception exc, int i7) {
        super(str, exc);
        this.f10628d = i7;
    }
}
