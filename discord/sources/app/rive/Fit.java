package app.rive;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lapp/rive/Fit;", "", "()V", "alignment", "Lapp/rive/Alignment;", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "scaleFactor", "", "getScaleFactor", "()F", "Contain", "Cover", "Fill", "FitHeight", "FitWidth", "Layout", "None", "ScaleDown", "Lapp/rive/Fit$Contain;", "Lapp/rive/Fit$Cover;", "Lapp/rive/Fit$Fill;", "Lapp/rive/Fit$FitHeight;", "Lapp/rive/Fit$FitWidth;", "Lapp/rive/Fit$Layout;", "Lapp/rive/Fit$None;", "Lapp/rive/Fit$ScaleDown;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Fit {
    public static final int $stable = 0;

    @NotNull
    private final Alignment alignment;
    private final float scaleFactor;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$Contain;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Contain extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public Contain() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Contain copy$default(Contain contain, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = contain.alignment;
            }
            return contain.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final Contain copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new Contain(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Contain) && this.alignment == ((Contain) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Contain(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Contain(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 1;
        }

        public /* synthetic */ Contain(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$Cover;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cover extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public Cover() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Cover copy$default(Cover cover, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = cover.alignment;
            }
            return cover.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final Cover copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new Cover(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cover) && this.alignment == ((Cover) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Cover(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cover(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 2;
        }

        public /* synthetic */ Cover(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/Fit$Fill;", "Lapp/rive/Fit;", "()V", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fill extends Fit {
        public static final int $stable = 0;

        @NotNull
        public static final Fill INSTANCE = new Fill();
        private static final byte nativeMapping = 0;

        private Fill() {
            super(null);
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release */
        public byte getNativeMapping() {
            return nativeMapping;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$FitHeight;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FitHeight extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public FitHeight() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FitHeight copy$default(FitHeight fitHeight, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = fitHeight.alignment;
            }
            return fitHeight.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final FitHeight copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new FitHeight(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FitHeight) && this.alignment == ((FitHeight) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "FitHeight(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitHeight(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 4;
        }

        public /* synthetic */ FitHeight(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$FitWidth;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FitWidth extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public FitWidth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FitWidth copy$default(FitWidth fitWidth, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = fitWidth.alignment;
            }
            return fitWidth.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final FitWidth copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new FitWidth(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FitWidth) && this.alignment == ((FitWidth) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "FitWidth(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitWidth(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 3;
        }

        public /* synthetic */ FitWidth(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$Layout;", "Lapp/rive/Fit;", "scaleFactor", "", "(F)V", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "getScaleFactor", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Layout extends Fit {
        public static final int $stable = 0;
        private final byte nativeMapping;
        private final float scaleFactor;

        public Layout() {
            this(0.0f, 1, null);
        }

        public static /* synthetic */ Layout copy$default(Layout layout, float f2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                f2 = layout.scaleFactor;
            }
            return layout.copy(f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getScaleFactor() {
            return this.scaleFactor;
        }

        @NotNull
        public final Layout copy(float scaleFactor) {
            return new Layout(scaleFactor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Layout) && Float.compare(this.scaleFactor, ((Layout) other).scaleFactor) == 0;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        @Override // app.rive.Fit
        public float getScaleFactor() {
            return this.scaleFactor;
        }

        public int hashCode() {
            return Float.hashCode(this.scaleFactor);
        }

        @NotNull
        public String toString() {
            return "Layout(scaleFactor=" + this.scaleFactor + ")";
        }

        public Layout(float f2) {
            super(null);
            this.scaleFactor = f2;
            this.nativeMapping = (byte) 7;
        }

        public /* synthetic */ Layout(float f2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 1.0f : f2);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$None;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class None extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public None() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ None copy$default(None none, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = none.alignment;
            }
            return none.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final None copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new None(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && this.alignment == ((None) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "None(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public None(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 5;
        }

        public /* synthetic */ None(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/Fit$ScaleDown;", "Lapp/rive/Fit;", "alignment", "Lapp/rive/Alignment;", "(Lapp/rive/Alignment;)V", "getAlignment", "()Lapp/rive/Alignment;", "nativeMapping", "", "getNativeMapping$kotlin_release", "()B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScaleDown extends Fit {
        public static final int $stable = 0;

        @NotNull
        private final Alignment alignment;
        private final byte nativeMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public ScaleDown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ScaleDown copy$default(ScaleDown scaleDown, Alignment alignment, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                alignment = scaleDown.alignment;
            }
            return scaleDown.copy(alignment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final ScaleDown copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new ScaleDown(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScaleDown) && this.alignment == ((ScaleDown) other).alignment;
        }

        @Override // app.rive.Fit
        @NotNull
        public Alignment getAlignment() {
            return this.alignment;
        }

        @Override // app.rive.Fit
        /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
        public byte getNativeMapping() {
            return this.nativeMapping;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "ScaleDown(alignment=" + this.alignment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScaleDown(@NotNull Alignment alignment) {
            super(null);
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
            this.nativeMapping = (byte) 6;
        }

        public /* synthetic */ ScaleDown(Alignment alignment, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Alignment.Center : alignment);
        }
    }

    public /* synthetic */ Fit(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getNativeMapping$kotlin_release */
    public abstract byte getNativeMapping();

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    private Fit() {
        this.alignment = Alignment.Center;
        this.scaleFactor = 1.0f;
    }
}
