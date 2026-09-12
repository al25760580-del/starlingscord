package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class z0 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f1189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f1189b = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.y0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void f(int i7) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i7);
    }

    @Override // androidx.appcompat.widget.y0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void j(int i7) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i7);
    }
}
