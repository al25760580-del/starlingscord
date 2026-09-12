package androidx.appcompat.widget;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements AppCompatTextView.SuperCaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f1177a;

    public y0(AppCompatTextView appCompatTextView) {
        this.f1177a = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void a(int[] iArr, int i7) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int[] b() {
        return super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final TextClassifier c() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int d() {
        return super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void e(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void f(int i7) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void g(int i7, int i10, int i11, int i12) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int h() {
        return super/*android.widget.TextView*/.getAutoSizeTextType();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int i() {
        return super/*android.widget.TextView*/.getAutoSizeMinTextSize();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void j(int i7) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int k() {
        return super/*android.widget.TextView*/.getAutoSizeStepGranularity();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void l(int i7) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i7);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void m(int i7, float f2) {
    }
}
