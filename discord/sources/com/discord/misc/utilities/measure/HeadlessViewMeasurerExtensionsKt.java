package com.discord.misc.utilities.measure;

import android.content.Context;
import android.util.Size;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b\u001a:\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0014\b\b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"measureHeadlessView", "Landroid/util/Size;", "T", "Landroid/view/View;", "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "configureView", "Lkotlin/Function1;", "", "measureBounds", "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HeadlessViewMeasurerExtensionsKt {
    @NotNull
    public static final <T extends View> Size measureHeadlessView(@NotNull Context context, @NotNull Class<T> clazz, @NotNull Function1<? super T, Unit> configureView, @NotNull HeadlessViewMeasurer.MeasureBounds measureBounds) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(configureView, "configureView");
        Intrinsics.checkNotNullParameter(measureBounds, "measureBounds");
        return new HeadlessViewMeasurer(clazz).measure$misc_utilities_release(context, configureView, measureBounds);
    }

    public static final /* synthetic */ <T extends View> Size measureHeadlessView(Context context, Function1<? super T, Unit> configureView, HeadlessViewMeasurer.MeasureBounds measureBounds) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(configureView, "configureView");
        Intrinsics.checkNotNullParameter(measureBounds, "measureBounds");
        Intrinsics.reifiedOperationMarker(4, "T");
        return measureHeadlessView(context, View.class, configureView, measureBounds);
    }
}
