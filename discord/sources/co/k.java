package co;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f3770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f3771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f3772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f3773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3774f;

    public k(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i10 & 2) != 0 ? FileWalkDirection.f14682d : fileWalkDirection;
        i7 = (i10 & 32) != 0 ? Integer.MAX_VALUE : i7;
        this.f3769a = file;
        this.f3770b = fileWalkDirection;
        this.f3771c = function1;
        this.f3772d = function2;
        this.f3773e = function3;
        this.f3774f = i7;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i(this);
    }
}
