package vl;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21741a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f21741a == ((f) obj).f21741a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21741a) + com.discord.chat.presentation.list.a.u(1, com.discord.chat.presentation.list.a.u(8, Integer.hashCode(519) * 31, 31), 31);
    }

    public final String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=519, deferredInsetTypes=8, dispatchMode=1, hasTranslucentNavigationBar=" + this.f21741a + ")";
    }
}
