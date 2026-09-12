package ag;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f527e;

    public g1(w wVar) throws a1 {
        wVar.getClass();
        this.f527e = wVar;
        i0 i0VarE = wVar.entrySet().e();
        int i7 = 0;
        while (i0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) i0VarE.next();
            int iB = ((j1) entry.getKey()).b();
            i7 = i7 < iB ? iB : i7;
            int iB2 = ((j1) entry.getValue()).b();
            if (i7 < iB2) {
                i7 = iB2;
            }
        }
        int i10 = i7 + 1;
        this.f526d = i10;
        if (i10 > 8) {
            throw new a1("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // ag.j1
    public final int a() {
        return j1.d((byte) -96);
    }

    @Override // ag.j1
    public final int b() {
        return this.f526d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        j1 j1Var = (j1) obj;
        int iA = j1Var.a();
        int iD = j1.d((byte) -96);
        if (iD != iA) {
            return iD - j1Var.a();
        }
        w wVar = ((g1) j1Var).f527e;
        w wVar2 = this.f527e;
        if (wVar2.f588v.size() != wVar.f588v.size()) {
            return wVar2.f588v.size() - wVar.f588v.size();
        }
        i0 i0VarE = wVar2.entrySet().e();
        i0 i0VarE2 = wVar.entrySet().e();
        do {
            if (!i0VarE.hasNext() && !i0VarE2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) i0VarE.next();
            Map.Entry entry2 = (Map.Entry) i0VarE2.next();
            int iCompareTo2 = ((j1) entry.getKey()).compareTo((j1) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((j1) entry.getValue()).compareTo((j1) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            return this.f527e.equals(((g1) obj).f527e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(j1.d((byte) -96)), this.f527e});
    }

    public final String toString() {
        w wVar = this.f527e;
        if (wVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i0 i0VarE = wVar.entrySet().e();
        while (i0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) i0VarE.next();
            linkedHashMap.put(((j1) entry.getKey()).toString().replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  "), ((j1) entry.getValue()).toString().replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  "));
        }
        vi.d dVar = new vi.d(1, (byte) 0);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            c.g(sb2, linkedHashMap.entrySet().iterator(), dVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
