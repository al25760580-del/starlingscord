package sh;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20228b;

    public x(long j, HashMap map) {
        this.f20227a = j;
        this.f20228b = map;
    }

    public static x a(Bundle bundle, p0 p0Var, g1 g1Var) {
        i8.b bVar = new i8.b(16);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = stringArrayList.get(i7);
            map.put(str, AssetPackState.d(bundle, str, p0Var, g1Var, bVar));
        }
        return new x(bundle.getLong("total_bytes_to_download"), map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f20227a == xVar.f20227a && this.f20228b.equals(xVar.f20228b);
    }

    public final int hashCode() {
        long j = this.f20227a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f20228b.hashCode();
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.f20227a + ", packStates=" + this.f20228b.toString() + "}";
    }
}
