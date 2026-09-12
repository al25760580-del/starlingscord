package jm;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final boolean a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        return motionEvent.getAction() == 7 || motionEvent.getAction() == 9 || motionEvent.getAction() == 10;
    }
}
