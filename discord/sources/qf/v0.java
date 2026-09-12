package qf;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends bf.a {
    public static final Parcelable.Creator<v0> CREATOR = new s0(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18880e;

    public v0(boolean z5, ag.y0 y0Var) {
        this.f18879d = z5;
        this.f18880e = y0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f18879d == v0Var.f18879d && af.w.j(this.f18880e, v0Var.f18880e);
    }

    public final JSONObject h() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f18879d) {
                jSONObject.put(ViewProps.ENABLED, true);
            }
            ag.y0 y0Var = this.f18880e;
            byte[] bArrM = y0Var == null ? null : y0Var.m();
            if (bArrM != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM, 32), 11));
                if (bArrM.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18879d), this.f18880e});
    }

    public final String toString() {
        ag.y0 y0Var = this.f18880e;
        byte[] bArrM = y0Var == null ? null : y0Var.m();
        StringBuilder sb2 = new StringBuilder("AuthenticationExtensionsPrfOutputs{enabled:");
        sb2.append(this.f18879d);
        sb2.append("outputs:");
        return com.discord.chat.presentation.list.a.m(sb2, bArrM != null, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18879d ? 1 : 0);
        ag.y0 y0Var = this.f18880e;
        ls.d.L(parcel, 2, y0Var == null ? null : y0Var.m());
        ls.d.U(iT, parcel);
    }
}
