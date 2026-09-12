package o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17099d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
