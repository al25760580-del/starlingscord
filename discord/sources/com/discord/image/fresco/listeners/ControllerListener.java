package com.discord.image.fresco.listeners;

import android.graphics.drawable.Animatable;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/discord/image/fresco/listeners/ControllerListener;", "Lcom/facebook/drawee/controller/ControllerListener;", "", "<init>", "()V", "onSubmit", "", StackTraceHelper.ID_KEY, "", "callerContext", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "onIntermediateImageSet", "onIntermediateImageFailed", "throwable", "", "onFailure", "onRelease", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ControllerListener implements com.facebook.drawee.controller.ControllerListener {
    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id2, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String id2, Object imageInfo, Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String id2, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String id2, Object imageInfo) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String id2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id2, Object callerContext) {
    }
}
