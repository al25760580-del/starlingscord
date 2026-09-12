package com.discord.image.fresco.listeners;

import android.graphics.drawable.Animatable;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B+\u0012\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0004\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R \u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/discord/image/fresco/listeners/CompoundControllerListener;", "Lcom/facebook/drawee/controller/ControllerListener;", "", "listeners", "", "<init>", "([Lcom/facebook/drawee/controller/ControllerListener;)V", "internalListeners", "[Lcom/facebook/drawee/controller/ControllerListener;", "onSubmit", "", StackTraceHelper.ID_KEY, "", "callerContext", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "onIntermediateImageSet", "onIntermediateImageFailed", "throwable", "", "onFailure", "onRelease", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompoundControllerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundControllerListener.kt\ncom/discord/image/fresco/listeners/CompoundControllerListener\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n13472#2,2:36\n13472#2,2:38\n13472#2,2:40\n13472#2,2:42\n13472#2,2:44\n13472#2,2:46\n*S KotlinDebug\n*F\n+ 1 CompoundControllerListener.kt\ncom/discord/image/fresco/listeners/CompoundControllerListener\n*L\n12#1:36,2\n16#1:38,2\n20#1:40,2\n24#1:42,2\n28#1:44,2\n32#1:46,2\n*E\n"})
public final class CompoundControllerListener implements com.facebook.drawee.controller.ControllerListener {

    @NotNull
    private final com.facebook.drawee.controller.ControllerListener[] internalListeners;

    public CompoundControllerListener(@NotNull com.facebook.drawee.controller.ControllerListener... listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.internalListeners = listeners;
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id2, Throwable throwable) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onFailure(id2, throwable);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String id2, Object imageInfo, Animatable animatable) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onFinalImageSet(id2, imageInfo, animatable);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String id2, Throwable throwable) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onIntermediateImageFailed(id2, throwable);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String id2, Object imageInfo) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onIntermediateImageSet(id2, imageInfo);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String id2) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onRelease(id2);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id2, Object callerContext) {
        for (com.facebook.drawee.controller.ControllerListener controllerListener : this.internalListeners) {
            controllerListener.onSubmit(id2, callerContext);
        }
    }
}
