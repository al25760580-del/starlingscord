package io.sentry.android.replay.util;

import c0.a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lio/sentry/android/replay/util/TextAttributes;", "", "Lc0/a;", ViewProps.COLOR, "", "hasFillModifier", "<init>", "(Lc0/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-QN2ZGVo", "()Lc0/a;", "component1", "component2", "()Z", "copy-fRWUv9g", "(Lc0/a;Z)Lio/sentry/android/replay/util/TextAttributes;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lc0/a;", "getColor-QN2ZGVo", "Z", "getHasFillModifier", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TextAttributes {
    public static final int $stable = 0;
    private final a color;
    private final boolean hasFillModifier;

    public /* synthetic */ TextAttributes(a aVar, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z5);
    }

    /* JADX INFO: renamed from: copy-fRWUv9g$default, reason: not valid java name */
    public static /* synthetic */ TextAttributes m1254copyfRWUv9g$default(TextAttributes textAttributes, a aVar, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = textAttributes.color;
        }
        if ((i7 & 2) != 0) {
            z5 = textAttributes.hasFillModifier;
        }
        return textAttributes.m1256copyfRWUv9g(aVar, z5);
    }

    /* JADX INFO: renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
    public final a getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-fRWUv9g, reason: not valid java name */
    public final TextAttributes m1256copyfRWUv9g(a color, boolean hasFillModifier) {
        return new TextAttributes(color, hasFillModifier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) other;
        return Intrinsics.areEqual(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    /* JADX INFO: renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final a m1257getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasFillModifier) + (0 * 31);
    }

    @NotNull
    public String toString() {
        return "TextAttributes(color=" + this.color + ", hasFillModifier=" + this.hasFillModifier + ')';
    }

    private TextAttributes(a aVar, boolean z5) {
        this.color = aVar;
        this.hasFillModifier = z5;
    }
}
