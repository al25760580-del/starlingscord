package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends GridLayoutManager.SpanSizeLookup {
    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanIndex(int i7, int i10) {
        return i7 % i10;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        return 1;
    }
}
