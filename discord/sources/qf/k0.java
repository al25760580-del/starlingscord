package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends bf.a {

    @NonNull
    public static final Parcelable.Creator<k0> CREATOR = new s0(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18831d;

    public k0(ArrayList arrayList) {
        this.f18831d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        List list = ((k0) obj).f18831d;
        List list2 = this.f18831d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final JSONArray h() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f18831d;
            if (list != null) {
                for (int i7 = 0; i7 < list.size(); i7++) {
                    l0 l0Var = (l0) list.get(i7);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(l0Var.f18836d);
                    jSONArray2.put(Short.toString(l0Var.f18837e));
                    jSONArray2.put(Short.toString(l0Var.f18838i));
                    jSONArray.put(i7, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public final int hashCode() {
        List list = this.f18831d;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.R(parcel, 1, this.f18831d);
        ls.d.U(iT, parcel);
    }
}
