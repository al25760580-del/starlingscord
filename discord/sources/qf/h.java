package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new s0(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.y0 f18814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18815e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag.y0 f18816i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ag.y0 f18817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ag.y0 f18818w;

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        af.w.g(bArr);
        ag.y0 y0VarK = ag.y0.k(bArr, bArr.length);
        af.w.g(bArr2);
        ag.y0 y0VarK2 = ag.y0.k(bArr2, bArr2.length);
        af.w.g(bArr3);
        ag.y0 y0VarK3 = ag.y0.k(bArr3, bArr3.length);
        af.w.g(bArr4);
        ag.y0 y0VarK4 = ag.y0.k(bArr4, bArr4.length);
        ag.y0 y0VarK5 = bArr5 == null ? null : ag.y0.k(bArr5, bArr5.length);
        this.f18814d = y0VarK;
        this.f18815e = y0VarK2;
        this.f18816i = y0VarK3;
        this.f18817v = y0VarK4;
        this.f18818w = y0VarK5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return af.w.j(this.f18814d, hVar.f18814d) && af.w.j(this.f18815e, hVar.f18815e) && af.w.j(this.f18816i, hVar.f18816i) && af.w.j(this.f18817v, hVar.f18817v) && af.w.j(this.f18818w, hVar.f18818w);
    }

    public final JSONObject h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", ff.c.b(this.f18815e.m()));
            jSONObject.put("authenticatorData", ff.c.b(this.f18816i.m()));
            jSONObject.put("signature", ff.c.b(this.f18817v.m()));
            ag.y0 y0Var = this.f18818w;
            if (y0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", ff.c.b(y0Var == null ? null : y0Var.m()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f18814d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18815e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18816i})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18817v})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18818w}))});
    }

    public final String toString() {
        e4.m mVar = new e4.m(getClass().getSimpleName(), 5);
        ag.p0 p0Var = ag.r0.f570d;
        byte[] bArrM = this.f18814d.m();
        mVar.O("keyHandle", p0Var.c(bArrM, bArrM.length));
        byte[] bArrM2 = this.f18815e.m();
        mVar.O("clientDataJSON", p0Var.c(bArrM2, bArrM2.length));
        byte[] bArrM3 = this.f18816i.m();
        mVar.O("authenticatorData", p0Var.c(bArrM3, bArrM3.length));
        byte[] bArrM4 = this.f18817v.m();
        mVar.O("signature", p0Var.c(bArrM4, bArrM4.length));
        ag.y0 y0Var = this.f18818w;
        byte[] bArrM5 = y0Var == null ? null : y0Var.m();
        if (bArrM5 != null) {
            mVar.O("userHandle", p0Var.c(bArrM5, bArrM5.length));
        }
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.L(parcel, 2, this.f18814d.m());
        ls.d.L(parcel, 3, this.f18815e.m());
        ls.d.L(parcel, 4, this.f18816i.m());
        ls.d.L(parcel, 5, this.f18817v.m());
        ag.y0 y0Var = this.f18818w;
        ls.d.L(parcel, 6, y0Var == null ? null : y0Var.m());
        ls.d.U(iT, parcel);
    }
}
