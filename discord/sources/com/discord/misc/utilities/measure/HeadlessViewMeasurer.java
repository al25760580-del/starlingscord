package com.discord.misc.utilities.measure;

import android.content.Context;
import android.util.Size;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J'\u0010\n\u001a\u00020\u000b\"\b\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u0002H\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;", "T", "Landroid/view/View;", "", "clazz", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "shadowView", "Landroid/view/View;", "measure", "Landroid/util/Size;", "context", "Landroid/content/Context;", "configureView", "Lkotlin/Function1;", "", "measureBounds", "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "measure$misc_utilities_release", "view", "(Landroid/view/View;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;", "getMeasureSpecMode", "", "size", "MeasureBounds", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeadlessViewMeasurer<T extends View> {

    @NotNull
    private final Class<T> clazz;
    private T shadowView;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "", "widthPx", "", "heightPx", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getWidthPx", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeightPx", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "equals", "", "other", "hashCode", "toString", "", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MeasureBounds {
        private final Integer heightPx;
        private final Integer widthPx;

        /* JADX WARN: Multi-variable type inference failed */
        public MeasureBounds() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ MeasureBounds copy$default(MeasureBounds measureBounds, Integer num, Integer num2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = measureBounds.widthPx;
            }
            if ((i7 & 2) != 0) {
                num2 = measureBounds.heightPx;
            }
            return measureBounds.copy(num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidthPx() {
            return this.widthPx;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeightPx() {
            return this.heightPx;
        }

        @NotNull
        public final MeasureBounds copy(Integer widthPx, Integer heightPx) {
            return new MeasureBounds(widthPx, heightPx);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeasureBounds)) {
                return false;
            }
            MeasureBounds measureBounds = (MeasureBounds) other;
            return Intrinsics.areEqual(this.widthPx, measureBounds.widthPx) && Intrinsics.areEqual(this.heightPx, measureBounds.heightPx);
        }

        public final Integer getHeightPx() {
            return this.heightPx;
        }

        public final Integer getWidthPx() {
            return this.widthPx;
        }

        public int hashCode() {
            Integer num = this.widthPx;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.heightPx;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MeasureBounds(widthPx=" + this.widthPx + ", heightPx=" + this.heightPx + ")";
        }

        public MeasureBounds(Integer num, Integer num2) {
            this.widthPx = num;
            this.heightPx = num2;
        }

        public /* synthetic */ MeasureBounds(Integer num, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : num2);
        }
    }

    public HeadlessViewMeasurer(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.clazz = clazz;
    }

    private final int getMeasureSpecMode(int size) {
        return size == 0 ? 0 : 1073741824;
    }

    private final <T extends View> Size measure(T view, MeasureBounds measureBounds) {
        Integer widthPx = measureBounds.getWidthPx();
        int iIntValue = widthPx != null ? widthPx.intValue() : 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, getMeasureSpecMode(iIntValue));
        Integer heightPx = measureBounds.getHeightPx();
        int iIntValue2 = heightPx != null ? heightPx.intValue() : 0;
        view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iIntValue2, getMeasureSpecMode(iIntValue2)));
        return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @NotNull
    public final Size measure$misc_utilities_release(@NotNull Context context, @NotNull Function1<? super T, Unit> configureView, @NotNull MeasureBounds measureBounds) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configureView, "configureView");
        Intrinsics.checkNotNullParameter(measureBounds, "measureBounds");
        T t5 = this.shadowView;
        T t10 = null;
        if (t5 == null) {
            T tNewInstance = this.clazz.getDeclaredConstructor(Context.class).newInstance(context);
            Intrinsics.checkNotNull(tNewInstance, "null cannot be cast to non-null type T of com.discord.misc.utilities.measure.HeadlessViewMeasurer");
            this.shadowView = tNewInstance;
        } else {
            if (t5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shadowView");
                t5 = null;
            }
            if (t5.getContext() != context) {
                T tNewInstance2 = this.clazz.getDeclaredConstructor(Context.class).newInstance(context);
                Intrinsics.checkNotNull(tNewInstance2, "null cannot be cast to non-null type T of com.discord.misc.utilities.measure.HeadlessViewMeasurer");
                this.shadowView = tNewInstance2;
            }
        }
        T t11 = this.shadowView;
        if (t11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
            t11 = null;
        }
        configureView.invoke(t11);
        T t12 = this.shadowView;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        } else {
            t10 = t12;
        }
        return measure(t10, measureBounds);
    }
}
