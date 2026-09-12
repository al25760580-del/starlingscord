package y7;

import com.discord.safearea.SafeAreaInsetsModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SafeAreaInsetsModule f23213e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f23214i;

    public /* synthetic */ a(SafeAreaInsetsModule safeAreaInsetsModule, boolean z5, int i7) {
        this.f23212d = i7;
        this.f23213e = safeAreaInsetsModule;
        this.f23214i = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23212d) {
            case 0:
                SafeAreaInsetsModule.setNavigationBarContrastEnforced$lambda$4(this.f23213e, this.f23214i);
                break;
            case 1:
                SafeAreaInsetsModule.setStatusBarVisible$lambda$2(this.f23213e, this.f23214i);
                break;
            default:
                SafeAreaInsetsModule.setNavigationBarVisible$lambda$3(this.f23213e, this.f23214i);
                break;
        }
    }
}
