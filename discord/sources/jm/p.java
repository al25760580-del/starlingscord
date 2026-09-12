package jm;

import com.facebook.react.uimanager.PointerEvents;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13973a;

    static {
        int[] iArr = new int[PointerEvents.values().length];
        try {
            iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointerEvents.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PointerEvents.AUTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13973a = iArr;
    }
}
