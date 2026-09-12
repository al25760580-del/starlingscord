package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bf.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new s0(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f18806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f18807e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f18808i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v0 f18809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f18810w;

    public f(k0 k0Var, u0 u0Var, g gVar, v0 v0Var, String str) {
        this.f18806d = k0Var;
        this.f18807e = u0Var;
        this.f18808i = gVar;
        this.f18809v = v0Var;
        this.f18810w = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return af.w.j(this.f18806d, fVar.f18806d) && af.w.j(this.f18807e, fVar.f18807e) && af.w.j(this.f18808i, fVar.f18808i) && af.w.j(this.f18809v, fVar.f18809v) && af.w.j(this.f18810w, fVar.f18810w);
    }

    public final JSONObject h() {
        try {
            JSONObject jSONObject = new JSONObject();
            g gVar = this.f18808i;
            if (gVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", gVar.f18813d);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f18806d;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.h());
            }
            v0 v0Var = this.f18809v;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.h());
            }
            String str = this.f18810w;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18806d, this.f18807e, this.f18808i, this.f18809v, this.f18810w});
    }

    public final String toString() {
        return s0.g.e("AuthenticationExtensionsClientOutputs{", h().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f18806d, i7);
        ls.d.N(parcel, 2, this.f18807e, i7);
        ls.d.N(parcel, 3, this.f18808i, i7);
        ls.d.N(parcel, 4, this.f18809v, i7);
        ls.d.O(this.f18810w, parcel, 5);
        ls.d.U(iT, parcel);
    }
}
