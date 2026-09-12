package m2;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends io.sentry.config.a {
    public final f k;

    public g(TextView textView) {
        super(12);
        this.k = new f(textView);
    }

    @Override // io.sentry.config.a
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        return !(k2.i.k != null) ? inputFilterArr : this.k.C(inputFilterArr);
    }

    @Override // io.sentry.config.a
    public final boolean L() {
        return this.k.f15365m;
    }

    @Override // io.sentry.config.a
    public final void U(boolean z5) {
        if (k2.i.k != null) {
            this.k.U(z5);
        }
    }

    @Override // io.sentry.config.a
    public final void V(boolean z5) {
        f fVar = this.k;
        if (k2.i.k != null) {
            fVar.V(z5);
        } else {
            fVar.f15365m = z5;
        }
    }

    @Override // io.sentry.config.a
    public final TransformationMethod b0(TransformationMethod transformationMethod) {
        return !(k2.i.k != null) ? transformationMethod : this.k.b0(transformationMethod);
    }
}
