package com.facebook.react.uimanager;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/uimanager/Spacing;", "", "defaultValue", "", "spacing", "", "<init>", "(F[F)V", "()V", "(F)V", "original", "(Lcom/facebook/react/uimanager/Spacing;)V", "valueFlags", "", "hasAliasesSet", "", "set", "spacingType", "value", "get", "getRaw", "reset", "", "getWithFallback", "fallbackType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Spacing {
    public static final int ALL = 8;
    public static final int BLOCK = 9;
    public static final int BLOCK_END = 10;
    public static final int BLOCK_START = 11;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private final float defaultValue;
    private boolean hasAliasesSet;

    @NotNull
    private final float[] spacing;
    private int valueFlags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] flagsMap = {1, 2, 4, 8, 16, 32, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, RecyclerView.ItemAnimator.FLAG_MOVED};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/Spacing$Companion;", "", "<init>", "()V", "LEFT", "", "TOP", "RIGHT", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "ALL", "BLOCK", "BLOCK_END", "BLOCK_START", "flagsMap", "", "newFullSpacingArray", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] newFullSpacingArray() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private Companion() {
        }
    }

    public Spacing(float f2, @NotNull float[] spacing) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.defaultValue = f2;
        this.spacing = spacing;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    public final float get(int spacingType) {
        float f2;
        if (spacingType != 4 && spacingType != 5) {
            switch (spacingType) {
                case 9:
                case 10:
                case 11:
                    f2 = Float.NaN;
                    break;
                default:
                    f2 = this.defaultValue;
                    break;
            }
        } else {
            f2 = Float.NaN;
        }
        int i7 = this.valueFlags;
        if (i7 != 0) {
            int[] iArr = flagsMap;
            if ((iArr[spacingType] & i7) != 0) {
                return this.spacing[spacingType];
            }
            if (this.hasAliasesSet) {
                char c8 = (spacingType == 1 || spacingType == 3) ? (char) 7 : (char) 6;
                if ((iArr[c8] & i7) != 0) {
                    return this.spacing[c8];
                }
                if ((i7 & iArr[8]) != 0) {
                    return this.spacing[8];
                }
            }
        }
        return f2;
    }

    public final float getRaw(int spacingType) {
        return this.spacing[spacingType];
    }

    public final float getWithFallback(int spacingType, int fallbackType) {
        return (this.valueFlags & flagsMap[spacingType]) != 0 ? this.spacing[spacingType] : get(fallbackType);
    }

    public final void reset() {
        float[] fArr = this.spacing;
        int length = fArr.length;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, 0, length, Float.NaN);
        this.hasAliasesSet = false;
        this.valueFlags = 0;
    }

    public final boolean set(int spacingType, float value) {
        int i7;
        if (FloatUtil.floatsEqual(this.spacing[spacingType], value)) {
            return false;
        }
        this.spacing[spacingType] = value;
        if (yk.a.x(value)) {
            i7 = (~flagsMap[spacingType]) & this.valueFlags;
        } else {
            i7 = flagsMap[spacingType] | this.valueFlags;
        }
        this.valueFlags = i7;
        int[] iArr = flagsMap;
        this.hasAliasesSet = ((iArr[8] & i7) == 0 && (iArr[7] & i7) == 0 && (iArr[6] & i7) == 0 && (i7 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public Spacing() {
        this(0.0f, INSTANCE.newFullSpacingArray());
    }

    public Spacing(float f2) {
        this(f2, INSTANCE.newFullSpacingArray());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Spacing(@NotNull Spacing original) {
        Intrinsics.checkNotNullParameter(original, "original");
        float f2 = original.defaultValue;
        float[] fArr = original.spacing;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this(f2, fArrCopyOf);
        this.valueFlags = original.valueFlags;
        this.hasAliasesSet = original.hasAliasesSet;
    }
}
