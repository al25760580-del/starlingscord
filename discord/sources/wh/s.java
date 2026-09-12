package wh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f22305b;

    public s(String str, Set set) {
        this.f22304a = str;
        this.f22305b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            String str = sVar.f22304a;
            String str2 = this.f22304a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f22305b.equals(sVar.f22305b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22304a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f22305b.hashCode();
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.l(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f22304a, ", verdictOptOut=", this.f22305b.toString(), "}");
    }
}
