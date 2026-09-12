package kotlin.reflect;

import mo.n;

/* JADX INFO: loaded from: classes3.dex */
public interface KProperty extends KCallable {
    n getGetter();

    boolean isConst();

    boolean isLateinit();
}
