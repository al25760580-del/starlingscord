package qf;

import ag.n1;
import ag.o1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends bf.a {

    @NonNull
    public static final Parcelable.Creator<u> CREATOR = new jf.b(22);
    public final String E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18864e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag.y0 f18865i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f18866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f18867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f18868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f18869y;

    public u(String str, String str2, byte[] bArr, i iVar, h hVar, j jVar, f fVar, String str3) {
        ag.y0 y0VarK = bArr == null ? null : ag.y0.k(bArr, bArr.length);
        boolean z5 = false;
        af.w.a("Must provide a response object.", (iVar != null && hVar == null && jVar == null) || (iVar == null && hVar != null && jVar == null) || (iVar == null && hVar == null && jVar != null));
        if (jVar != null || (str != null && y0VarK != null)) {
            z5 = true;
        }
        af.w.a("Must provide id and rawId if not an error response.", z5);
        this.f18863d = str;
        this.f18864e = str2;
        this.f18865i = y0VarK;
        this.f18866v = iVar;
        this.f18867w = hVar;
        this.f18868x = jVar;
        this.f18869y = fVar;
        this.E = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return af.w.j(this.f18863d, uVar.f18863d) && af.w.j(this.f18864e, uVar.f18864e) && af.w.j(this.f18865i, uVar.f18865i) && af.w.j(this.f18866v, uVar.f18866v) && af.w.j(this.f18867w, uVar.f18867w) && af.w.j(this.f18868x, uVar.f18868x) && af.w.j(this.f18869y, uVar.f18869y) && af.w.j(this.E, uVar.E);
    }

    public final k h() {
        i iVar = this.f18866v;
        if (iVar != null) {
            return iVar;
        }
        h hVar = this.f18867w;
        if (hVar != null) {
            return hVar;
        }
        j jVar = this.f18868x;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("No response set.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18863d, this.f18864e, this.f18865i, this.f18867w, this.f18866v, this.f18868x, this.f18869y, this.E});
    }

    public final String toString() {
        ag.y0 y0Var = this.f18865i;
        String strB = ff.c.b(y0Var == null ? null : y0Var.m());
        String strValueOf = String.valueOf(this.f18866v);
        String strValueOf2 = String.valueOf(this.f18867w);
        String strValueOf3 = String.valueOf(this.f18868x);
        String strValueOf4 = String.valueOf(this.f18869y);
        StringBuilder sbU = a3.e.u("PublicKeyCredential{\n id='", this.f18863d, "', \n type='", this.f18864e, "', \n rawId=");
        a3.e.A(sbU, strB, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        a3.e.A(sbU, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return com.discord.chat.presentation.list.a.l(sbU, strValueOf4, ", \n authenticatorAttachment='", this.E, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        o1 o1Var = n1.f550b.f551a.f529d;
        o1.f561a.m();
        throw null;
    }
}
