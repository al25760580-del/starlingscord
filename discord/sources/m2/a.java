package m2;

import android.text.Editable;
import k2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15353a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f15354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f15355c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f15355c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
