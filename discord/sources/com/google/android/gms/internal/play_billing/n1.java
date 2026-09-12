package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends Throwable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(String str, int i7) {
        super(str);
        this.f6068d = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f6068d) {
            case 0:
                synchronized (this) {
                    break;
                }
                break;
            case 1:
                synchronized (this) {
                    break;
                }
                break;
            case 2:
                synchronized (this) {
                    break;
                }
                break;
            case 3:
                synchronized (this) {
                    break;
                }
                break;
            default:
                synchronized (this) {
                    break;
                }
                break;
        }
        return this;
    }
}
