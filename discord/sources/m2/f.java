package m2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends io.sentry.config.a {
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f15364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15365m;

    public f(TextView textView) {
        super(12);
        this.k = textView;
        this.f15365m = true;
        this.f15364l = new d(textView);
    }

    @Override // io.sentry.config.a
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        if (!this.f15365m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f15364l;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // io.sentry.config.a
    public final boolean L() {
        return this.f15365m;
    }

    @Override // io.sentry.config.a
    public final void U(boolean z5) {
        if (z5) {
            TextView textView = this.k;
            textView.setTransformationMethod(b0(textView.getTransformationMethod()));
        }
    }

    @Override // io.sentry.config.a
    public final void V(boolean z5) {
        this.f15365m = z5;
        TextView textView = this.k;
        textView.setTransformationMethod(b0(textView.getTransformationMethod()));
        textView.setFilters(C(textView.getFilters()));
    }

    @Override // io.sentry.config.a
    public final TransformationMethod b0(TransformationMethod transformationMethod) {
        if (this.f15365m) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f15370d : transformationMethod;
    }
}
