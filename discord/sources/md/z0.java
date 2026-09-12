package md;

import gc.h1;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends h1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(String str, int i7) {
        super(str, null, false, 1);
        switch (i7) {
            case 2:
                super("Missing required field: ".concat(str), null, true, 4);
                break;
            default:
                break;
        }
    }
}
