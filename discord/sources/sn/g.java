package sn;

import androidx.core.view.i0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f20310w;

    public g(i map, int i7) {
        this.f20310w = i7;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f1674v = map;
        this.f1672e = -1;
        this.f1673i = map.E;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20310w) {
            case 0:
                b();
                int i7 = this.f1671d;
                i iVar = (i) this.f1674v;
                if (i7 >= iVar.f20319x) {
                    throw new NoSuchElementException();
                }
                this.f1671d = i7 + 1;
                this.f1672e = i7;
                h hVar = new h(iVar, i7);
                e();
                return hVar;
            case 1:
                b();
                int i10 = this.f1671d;
                i iVar2 = (i) this.f1674v;
                if (i10 >= iVar2.f20319x) {
                    throw new NoSuchElementException();
                }
                this.f1671d = i10 + 1;
                this.f1672e = i10;
                Object obj = iVar2.f20314d[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f1671d;
                i iVar3 = (i) this.f1674v;
                if (i11 >= iVar3.f20319x) {
                    throw new NoSuchElementException();
                }
                this.f1671d = i11 + 1;
                this.f1672e = i11;
                Object[] objArr = iVar3.f20315e;
                Intrinsics.checkNotNull(objArr);
                Object obj2 = objArr[this.f1672e];
                e();
                return obj2;
        }
    }
}
