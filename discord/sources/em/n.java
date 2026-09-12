package em;

import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f8475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Alignment f8476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Fit f8477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f8478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.session.b f8479h;

    public n(String str, String str2, boolean z5, File riveFile, Alignment alignment, Fit fit, Float f2, android.support.v4.media.session.b bindData) {
        Intrinsics.checkNotNullParameter(riveFile, "riveFile");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(bindData, "bindData");
        this.f8472a = str;
        this.f8473b = str2;
        this.f8474c = z5;
        this.f8475d = riveFile;
        this.f8476e = alignment;
        this.f8477f = fit;
        this.f8478g = f2;
        this.f8479h = bindData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f8472a, nVar.f8472a) && Intrinsics.areEqual(this.f8473b, nVar.f8473b) && this.f8474c == nVar.f8474c && Intrinsics.areEqual(this.f8475d, nVar.f8475d) && this.f8476e == nVar.f8476e && this.f8477f == nVar.f8477f && Intrinsics.areEqual((Object) this.f8478g, (Object) nVar.f8478g) && Intrinsics.areEqual(this.f8479h, nVar.f8479h);
    }

    public final int hashCode() {
        String str = this.f8472a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8473b;
        int iHashCode2 = (this.f8477f.hashCode() + ((this.f8476e.hashCode() + ((this.f8475d.hashCode() + com.discord.chat.presentation.list.a.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f8474c)) * 31)) * 31)) * 31;
        Float f2 = this.f8478g;
        return this.f8479h.hashCode() + ((iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = a3.e.u("ViewConfiguration(artboardName=", this.f8472a, ", stateMachineName=", this.f8473b, ", autoPlay=");
        sbU.append(this.f8474c);
        sbU.append(", riveFile=");
        sbU.append(this.f8475d);
        sbU.append(", alignment=");
        sbU.append(this.f8476e);
        sbU.append(", fit=");
        sbU.append(this.f8477f);
        sbU.append(", layoutScaleFactor=");
        sbU.append(this.f8478g);
        sbU.append(", bindData=");
        sbU.append(this.f8479h);
        sbU.append(")");
        return sbU.toString();
    }
}
