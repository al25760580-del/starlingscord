package ag;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f505e;

    public b1(c0 c0Var) throws a1 {
        c0Var.getClass();
        this.f504d = c0Var;
        int i7 = 0;
        for (int i10 = 0; i10 < this.f504d.size(); i10++) {
            int iB = ((j1) this.f504d.get(i10)).b();
            if (i7 < iB) {
                i7 = iB;
            }
        }
        int i11 = i7 + 1;
        this.f505e = i11;
        if (i11 > 8) {
            throw new a1("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // ag.j1
    public final int a() {
        return j1.d(ByteCompanionObject.MIN_VALUE);
    }

    @Override // ag.j1
    public final int b() {
        return this.f505e;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int iA = j1Var.a();
        int iD = j1.d(ByteCompanionObject.MIN_VALUE);
        if (iD != iA) {
            return iD - j1Var.a();
        }
        q qVar = ((b1) j1Var).f504d;
        q qVar2 = this.f504d;
        if (qVar2.size() != qVar.size()) {
            return qVar2.size() - qVar.size();
        }
        for (int i7 = 0; i7 < qVar2.size(); i7++) {
            int iCompareTo = ((j1) qVar2.get(i7)).compareTo((j1) qVar.get(i7));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            return this.f504d.equals(((b1) obj).f504d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(j1.d(ByteCompanionObject.MIN_VALUE)), this.f504d});
    }

    public final String toString() {
        q qVar = this.f504d;
        if (qVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((j1) qVar.get(i7)).toString().replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(vi.d.s(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(vi.d.s(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
