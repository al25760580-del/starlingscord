package com.discord.image.fresco.postprocessors;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.image.fresco.postprocessors.processors.CompositePostprocessor;
import com.discord.image.fresco.postprocessors.processors.GradientPostprocessor;
import com.discord.image.fresco.postprocessors.processors.GrayscalePostprocessor;
import com.discord.image.fresco.postprocessors.processors.SafeRoundAsCirclePostprocessor;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.imagepipeline.request.BasePostprocessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bJ\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor;", "", "create", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "Composite", "Circle", "Grayscale", "Gradient", "Companion", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PostProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Circle implements PostProcessor {

        @NotNull
        public static final Circle INSTANCE = new Circle();

        private Circle() {
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        @NotNull
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Circle);
        }

        public int hashCode() {
            return 1231636723;
        }

        @NotNull
        public String toString() {
            return "Circle";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "processor", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPostProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostProcessor.kt\ncom/discord/image/fresco/postprocessors/PostProcessor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1563#2:49\n1634#2,3:50\n*S KotlinDebug\n*F\n+ 1 PostProcessor.kt\ncom/discord/image/fresco/postprocessors/PostProcessor$Companion\n*L\n41#1:49\n41#1:50,3\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final BasePostprocessor create(@NotNull PostProcessor processor) {
            Intrinsics.checkNotNullParameter(processor, "processor");
            if (processor instanceof Composite) {
                List<PostProcessor> postprocessors = ((Composite) processor).getPostprocessors();
                ArrayList arrayList = new ArrayList(e0.l(postprocessors, 10));
                Iterator<T> it = postprocessors.iterator();
                while (it.hasNext()) {
                    arrayList.add($$INSTANCE.create((PostProcessor) it.next()));
                }
                return new CompositePostprocessor(arrayList);
            }
            if (processor instanceof Circle) {
                return new SafeRoundAsCirclePostprocessor();
            }
            if (processor instanceof Grayscale) {
                return GrayscalePostprocessor.INSTANCE;
            }
            if (processor instanceof Gradient) {
                return new GradientPostprocessor((Gradient) processor);
            }
            throw new n();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static BasePostprocessor create(@NotNull PostProcessor postProcessor) {
            return PostProcessor.INSTANCE.create(postProcessor);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Grayscale implements PostProcessor {

        @NotNull
        public static final Grayscale INSTANCE = new Grayscale();

        private Grayscale() {
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        @NotNull
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Grayscale);
        }

        public int hashCode() {
            return -1916771900;
        }

        @NotNull
        public String toString() {
            return "Grayscale";
        }
    }

    @NotNull
    BasePostprocessor create();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postprocessors", "", "<init>", "(Ljava/util/List;)V", "", "([Lcom/discord/image/fresco/postprocessors/PostProcessor;)V", "getPostprocessors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Composite implements PostProcessor {

        @NotNull
        private final List<PostProcessor> postprocessors;

        /* JADX WARN: Multi-variable type inference failed */
        public Composite(@NotNull List<? extends PostProcessor> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            this.postprocessors = postprocessors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Composite copy$default(Composite composite, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = composite.postprocessors;
            }
            return composite.copy(list);
        }

        @NotNull
        public final List<PostProcessor> component1() {
            return this.postprocessors;
        }

        @NotNull
        public final Composite copy(@NotNull List<? extends PostProcessor> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            return new Composite(postprocessors);
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        @NotNull
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Composite) && Intrinsics.areEqual(this.postprocessors, ((Composite) other).postprocessors);
        }

        @NotNull
        public final List<PostProcessor> getPostprocessors() {
            return this.postprocessors;
        }

        public int hashCode() {
            return this.postprocessors.hashCode();
        }

        @NotNull
        public String toString() {
            return "Composite(postprocessors=" + this.postprocessors + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Composite(@NotNull PostProcessor... postprocessors) {
            this((List<? extends PostProcessor>) y.H(postprocessors));
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "direction", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "startColor", "", "endColor", "startPosition", "", "endPosition", "<init>", "(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V", "getDirection", "()Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "getStartColor", "()I", "getEndColor", "getStartPosition", "()F", "getEndPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Direction", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Gradient implements PostProcessor {

        @NotNull
        private final Direction direction;
        private final int endColor;
        private final float endPosition;
        private final int startColor;
        private final float startPosition;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "LeftToRight", "RightToLeft", "TopToBottom", "BottomToTop", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum Direction {
            LeftToRight,
            RightToLeft,
            TopToBottom,
            BottomToTop;

            private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public Gradient(@NotNull Direction direction, int i7, int i10, float f2, float f7) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
            this.startColor = i7;
            this.endColor = i10;
            this.startPosition = f2;
            this.endPosition = f7;
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, Direction direction, int i7, int i10, float f2, float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                direction = gradient.direction;
            }
            if ((i11 & 2) != 0) {
                i7 = gradient.startColor;
            }
            if ((i11 & 4) != 0) {
                i10 = gradient.endColor;
            }
            if ((i11 & 8) != 0) {
                f2 = gradient.startPosition;
            }
            if ((i11 & 16) != 0) {
                f7 = gradient.endPosition;
            }
            float f10 = f7;
            int i12 = i10;
            return gradient.copy(direction, i7, i12, f2, f10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStartColor() {
            return this.startColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEndColor() {
            return this.endColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getStartPosition() {
            return this.startPosition;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getEndPosition() {
            return this.endPosition;
        }

        @NotNull
        public final Gradient copy(@NotNull Direction direction, int startColor, int endColor, float startPosition, float endPosition) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new Gradient(direction, startColor, endColor, startPosition, endPosition);
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        @NotNull
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return this.direction == gradient.direction && this.startColor == gradient.startColor && this.endColor == gradient.endColor && Float.compare(this.startPosition, gradient.startPosition) == 0 && Float.compare(this.endPosition, gradient.endPosition) == 0;
        }

        @NotNull
        public final Direction getDirection() {
            return this.direction;
        }

        public final int getEndColor() {
            return this.endColor;
        }

        public final float getEndPosition() {
            return this.endPosition;
        }

        public final int getStartColor() {
            return this.startColor;
        }

        public final float getStartPosition() {
            return this.startPosition;
        }

        public int hashCode() {
            return Float.hashCode(this.endPosition) + e.a(a.u(this.endColor, a.u(this.startColor, this.direction.hashCode() * 31, 31), 31), 31, this.startPosition);
        }

        @NotNull
        public String toString() {
            return "Gradient(direction=" + this.direction + ", startColor=" + this.startColor + ", endColor=" + this.endColor + ", startPosition=" + this.startPosition + ", endPosition=" + this.endPosition + ")";
        }

        public /* synthetic */ Gradient(Direction direction, int i7, int i10, float f2, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(direction, i7, i10, (i11 & 8) != 0 ? 0.0f : f2, (i11 & 16) != 0 ? 1.0f : f7);
        }
    }
}
