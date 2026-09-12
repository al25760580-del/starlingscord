package com.discord.mobile_voice_overlay.utils;

import co.s;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.views.OverlayView;
import com.discord.user_search_worker.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0005H\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J\r\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019R \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "T", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "", "initializer", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "view", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "withView", "", "operation", "showViewOnOverlay", "removeViewFromOverlay", "setAssets", "setData", "isInOverlay", "", "withViewOptional", "ensureView", "()Lcom/discord/mobile_voice_overlay/views/OverlayView;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayViewProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayViewProvider.kt\ncom/discord/mobile_voice_overlay/utils/OverlayViewProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class OverlayViewProvider<T extends OverlayView> {
    private MobileVoiceOverlayAssets assets;
    private MobileVoiceOverlayData data;

    @NotNull
    private final Function1<OverlayViewProvider<T>, T> initializer;
    private T view;

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayViewProvider(@NotNull Function1<? super OverlayViewProvider<T>, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    private final T ensureView() {
        T t5 = this.view;
        if (t5 != null) {
            return t5;
        }
        T t10 = (T) this.initializer.invoke(this);
        MobileVoiceOverlayAssets mobileVoiceOverlayAssets = this.assets;
        if (mobileVoiceOverlayAssets == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assets");
            mobileVoiceOverlayAssets = null;
        }
        t10.setAssets(mobileVoiceOverlayAssets);
        t10.initializeWithWindowManager();
        MobileVoiceOverlayData mobileVoiceOverlayData = this.data;
        if (mobileVoiceOverlayData != null) {
            t10.setData(mobileVoiceOverlayData);
        }
        this.view = t10;
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeViewFromOverlay$lambda$0(OverlayView v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        v6.removeFromWindowManager();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAssets$lambda$1(MobileVoiceOverlayAssets mobileVoiceOverlayAssets, OverlayView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAssets(mobileVoiceOverlayAssets);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$2(MobileVoiceOverlayData mobileVoiceOverlayData, OverlayView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setData(mobileVoiceOverlayData);
        return Unit.f14616a;
    }

    private final void withViewOptional(Function1<? super T, Unit> operation) {
        T t5 = this.view;
        if (t5 != null) {
            operation.invoke(t5);
        }
    }

    public final boolean isInOverlay() {
        return this.view != null;
    }

    public final void removeViewFromOverlay() {
        withViewOptional(new a(16));
        this.view = null;
    }

    public final void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.assets = assets;
        withViewOptional(new s(28, assets));
    }

    public final void setData(@NotNull MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        withViewOptional(new s(27, data));
    }

    public final void showViewOnOverlay() {
        ensureView();
    }

    public final void withView(@NotNull Function1<? super T, Unit> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        operation.invoke(ensureView());
    }
}
