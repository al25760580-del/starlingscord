package rs;

import java.util.RandomAccess;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.collections.h implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f19581v = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteString[] f19582e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f19583i;

    public m(ByteString[] byteStringArr, int[] iArr) {
        this.f19582e = byteStringArr;
        this.f19583i = iArr;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f19582e.length;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        return this.f19582e[i7];
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
