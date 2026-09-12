package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f893c = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.y0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void m(int i7, float f2) {
        super/*android.widget.TextView*/.setLineHeight(i7, f2);
    }
}
