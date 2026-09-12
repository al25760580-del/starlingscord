package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f14713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f14715c;

    public c(CharSequence input, int i7, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f14713a = input;
        this.f14714b = i7;
        this.f14715c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
