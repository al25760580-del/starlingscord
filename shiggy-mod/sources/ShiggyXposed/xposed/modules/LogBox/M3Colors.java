package ShiggyXposed.xposed.modules.LogBox;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: LogBoxConstants.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00061"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/M3Colors;", "", "surface", "", "surfaceVariant", "onSurface", "onSurfaceVariant", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "secondaryContainer", "onSecondaryContainer", "error", "onError", "<init>", "(IIIIIIIIIIII)V", "getSurface", "()I", "getSurfaceVariant", "getOnSurface", "getOnSurfaceVariant", "getPrimary", "getOnPrimary", "getPrimaryContainer", "getOnPrimaryContainer", "getSecondaryContainer", "getOnSecondaryContainer", "getError", "getOnError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class M3Colors {
    private final int error;
    private final int onError;
    private final int onPrimary;
    private final int onPrimaryContainer;
    private final int onSecondaryContainer;
    private final int onSurface;
    private final int onSurfaceVariant;
    private final int primary;
    private final int primaryContainer;
    private final int secondaryContainer;
    private final int surface;
    private final int surfaceVariant;

    public static /* synthetic */ M3Colors copy$default(M3Colors m3Colors, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = m3Colors.surface;
        }
        if ((i13 & 2) != 0) {
            i2 = m3Colors.surfaceVariant;
        }
        if ((i13 & 4) != 0) {
            i3 = m3Colors.onSurface;
        }
        if ((i13 & 8) != 0) {
            i4 = m3Colors.onSurfaceVariant;
        }
        if ((i13 & 16) != 0) {
            i5 = m3Colors.primary;
        }
        if ((i13 & 32) != 0) {
            i6 = m3Colors.onPrimary;
        }
        if ((i13 & 64) != 0) {
            i7 = m3Colors.primaryContainer;
        }
        if ((i13 & 128) != 0) {
            i8 = m3Colors.onPrimaryContainer;
        }
        if ((i13 & 256) != 0) {
            i9 = m3Colors.secondaryContainer;
        }
        if ((i13 & 512) != 0) {
            i10 = m3Colors.onSecondaryContainer;
        }
        if ((i13 & 1024) != 0) {
            i11 = m3Colors.error;
        }
        if ((i13 & 2048) != 0) {
            i12 = m3Colors.onError;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i9;
        int i17 = i10;
        int i18 = i7;
        int i19 = i8;
        int i20 = i5;
        int i21 = i6;
        return m3Colors.copy(i, i2, i3, i4, i20, i21, i18, i19, i16, i17, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public final M3Colors copy(int surface, int surfaceVariant, int onSurface, int onSurfaceVariant, int primary, int onPrimary, int primaryContainer, int onPrimaryContainer, int secondaryContainer, int onSecondaryContainer, int error, int onError) {
        return new M3Colors(surface, surfaceVariant, onSurface, onSurfaceVariant, primary, onPrimary, primaryContainer, onPrimaryContainer, secondaryContainer, onSecondaryContainer, error, onError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof M3Colors)) {
            return false;
        }
        M3Colors m3Colors = (M3Colors) other;
        return this.surface == m3Colors.surface && this.surfaceVariant == m3Colors.surfaceVariant && this.onSurface == m3Colors.onSurface && this.onSurfaceVariant == m3Colors.onSurfaceVariant && this.primary == m3Colors.primary && this.onPrimary == m3Colors.onPrimary && this.primaryContainer == m3Colors.primaryContainer && this.onPrimaryContainer == m3Colors.onPrimaryContainer && this.secondaryContainer == m3Colors.secondaryContainer && this.onSecondaryContainer == m3Colors.onSecondaryContainer && this.error == m3Colors.error && this.onError == m3Colors.onError;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.surface) * 31) + Integer.hashCode(this.surfaceVariant)) * 31) + Integer.hashCode(this.onSurface)) * 31) + Integer.hashCode(this.onSurfaceVariant)) * 31) + Integer.hashCode(this.primary)) * 31) + Integer.hashCode(this.onPrimary)) * 31) + Integer.hashCode(this.primaryContainer)) * 31) + Integer.hashCode(this.onPrimaryContainer)) * 31) + Integer.hashCode(this.secondaryContainer)) * 31) + Integer.hashCode(this.onSecondaryContainer)) * 31) + Integer.hashCode(this.error)) * 31) + Integer.hashCode(this.onError);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("M3Colors(surface=");
        sb.append(this.surface).append(", surfaceVariant=").append(this.surfaceVariant).append(", onSurface=").append(this.onSurface).append(", onSurfaceVariant=").append(this.onSurfaceVariant).append(", primary=").append(this.primary).append(", onPrimary=").append(this.onPrimary).append(", primaryContainer=").append(this.primaryContainer).append(", onPrimaryContainer=").append(this.onPrimaryContainer).append(", secondaryContainer=").append(this.secondaryContainer).append(", onSecondaryContainer=").append(this.onSecondaryContainer).append(", error=").append(this.error).append(", onError=");
        sb.append(this.onError).append(')');
        return sb.toString();
    }

    public M3Colors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.surface = i;
        this.surfaceVariant = i2;
        this.onSurface = i3;
        this.onSurfaceVariant = i4;
        this.primary = i5;
        this.onPrimary = i6;
        this.primaryContainer = i7;
        this.onPrimaryContainer = i8;
        this.secondaryContainer = i9;
        this.onSecondaryContainer = i10;
        this.error = i11;
        this.onError = i12;
    }

    public final int getSurface() {
        return this.surface;
    }

    public final int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public final int getOnSurface() {
        return this.onSurface;
    }

    public final int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public final int getPrimary() {
        return this.primary;
    }

    public final int getOnPrimary() {
        return this.onPrimary;
    }

    public final int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public final int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public final int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public final int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public final int getError() {
        return this.error;
    }

    public final int getOnError() {
        return this.onError;
    }
}
