package vp;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends a implements Serializable {
    public static m g(a aVar, a aVar2, int i7, i0 i0Var, Class cls) {
        return new m(aVar, Collections.EMPTY_LIST, aVar2, new l(i7, i0Var, true), cls);
    }

    public static m h(a aVar, Object obj, a aVar2, int i7, i0 i0Var, Class cls) {
        return new m(aVar, obj, aVar2, new l(i7, i0Var, false), cls);
    }
}
