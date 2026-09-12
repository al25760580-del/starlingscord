package m2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TransformationMethod f15370d;

    public j(TransformationMethod transformationMethod) {
        this.f15370d = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f15370d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || k2.i.a().b() != 1) {
            return charSequence;
        }
        k2.i iVarA = k2.i.a();
        iVarA.getClass();
        return iVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f15370d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i7, rect);
        }
    }
}
