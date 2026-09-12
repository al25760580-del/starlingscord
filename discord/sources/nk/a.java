package nk;

import android.graphics.drawable.Drawable;
import com.linecorp.apng.ApngDrawable;
import com.linecorp.apng.decoder.Apng;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Apng f16954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f16958e;

    public a(Apng apng, int i7, int i10, int i11, Function0 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(apng, "apng");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f16954a = apng;
        this.f16955b = i7;
        this.f16956c = i10;
        this.f16957d = i11;
        this.f16958e = currentTimeProvider;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ApngDrawable(new a(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(a apngState) {
        this(apngState.f16954a.copy(), apngState.f16955b, apngState.f16956c, apngState.f16957d, apngState.f16958e);
        Intrinsics.checkNotNullParameter(apngState, "apngState");
    }
}
