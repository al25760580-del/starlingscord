package o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17101e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17102d = type;
    }

    public String a() {
        return this.f17102d;
    }
}
