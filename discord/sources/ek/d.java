package ek;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Serializable, Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8451e;

    public /* synthetic */ d(float f2, int i7) {
        this.f8450d = i7;
        this.f8451e = f2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8450d) {
            case 0:
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                int iCompare = Integer.compare(cVar2.f8449d, cVar.f8449d);
                if (iCompare != 0) {
                    return iCompare;
                }
                float f2 = cVar.f8448c;
                float f7 = this.f8451e;
                return Float.compare(Math.abs(f2 - f7), Math.abs(cVar2.f8448c - f7));
            default:
                float f10 = ((c) obj2).f8448c;
                float f11 = this.f8451e;
                return Float.compare(Math.abs(f10 - f11), Math.abs(((c) obj).f8448c - f11));
        }
    }
}
