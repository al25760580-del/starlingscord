package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/rive/Alignment;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "com/margelo/nitro/rive/a", "TOPLEFT", "TOPCENTER", "TOPRIGHT", "CENTERLEFT", "CENTER", "CENTERRIGHT", "BOTTOMLEFT", "BOTTOMCENTER", "BOTTOMRIGHT", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Alignment {
    TOPLEFT(0),
    TOPCENTER(1),
    TOPRIGHT(2),
    CENTERLEFT(3),
    CENTER(4),
    CENTERRIGHT(5),
    BOTTOMLEFT(6),
    BOTTOMCENTER(7),
    BOTTOMRIGHT(8);


    @xa.a
    @Keep
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

    @NotNull
    public static final a Companion = new a();

    Alignment(int i7) {
        this.value = i7;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
