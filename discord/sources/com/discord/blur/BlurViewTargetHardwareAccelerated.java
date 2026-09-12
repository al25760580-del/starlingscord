package com.discord.blur;

import a3.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.core.view.s1;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J0\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0014J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated;", "Lcom/discord/blur/BlurViewTargetBase;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "blurViewTargetWidth", "", "blurViewTargetHeight", "blurViewTargetWindowOffsetX", "blurViewTargetWindowOffsetY", "blurViewTargetLocation", "", "blurAmounts", "", "", "blurRects", "Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "blurRectRenderNodes", "Landroid/graphics/RenderNode;", "blurContentRenderNode", "setBlurAmount", "", "rectId", "blurAmount", "addBlurRect", "windowX", "windowY", "width", "height", "removeBlurRect", "onLayout", "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "BlurRect", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBlurViewTargetHardwareAccelerated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurViewTargetHardwareAccelerated.kt\ncom/discord/blur/BlurViewTargetHardwareAccelerated\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,131:1\n538#2:132\n523#2,6:133\n216#3,2:139\n*S KotlinDebug\n*F\n+ 1 BlurViewTargetHardwareAccelerated.kt\ncom/discord/blur/BlurViewTargetHardwareAccelerated\n*L\n85#1:132\n85#1:133,6\n103#1:139,2\n*E\n"})
public final class BlurViewTargetHardwareAccelerated extends BlurViewTargetBase {

    @NotNull
    private Map<Integer, Float> blurAmounts;

    @NotNull
    private final RenderNode blurContentRenderNode;

    @NotNull
    private final Map<Integer, RenderNode> blurRectRenderNodes;

    @NotNull
    private final Map<Integer, BlurRect> blurRects;
    private int blurViewTargetHeight;

    @NotNull
    private int[] blurViewTargetLocation;
    private int blurViewTargetWidth;
    private int blurViewTargetWindowOffsetX;
    private int blurViewTargetWindowOffsetY;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "", "windowX", "", "windowY", "width", "height", "<init>", "(IIII)V", "getWindowX", "()I", "getWindowY", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BlurRect {
        private final int height;
        private final int width;
        private final int windowX;
        private final int windowY;

        public BlurRect(int i7, int i10, int i11, int i12) {
            this.windowX = i7;
            this.windowY = i10;
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ BlurRect copy$default(BlurRect blurRect, int i7, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i7 = blurRect.windowX;
            }
            if ((i13 & 2) != 0) {
                i10 = blurRect.windowY;
            }
            if ((i13 & 4) != 0) {
                i11 = blurRect.width;
            }
            if ((i13 & 8) != 0) {
                i12 = blurRect.height;
            }
            return blurRect.copy(i7, i10, i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWindowX() {
            return this.windowX;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getWindowY() {
            return this.windowY;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final BlurRect copy(int windowX, int windowY, int width, int height) {
            return new BlurRect(windowX, windowY, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlurRect)) {
                return false;
            }
            BlurRect blurRect = (BlurRect) other;
            return this.windowX == blurRect.windowX && this.windowY == blurRect.windowY && this.width == blurRect.width && this.height == blurRect.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getWindowX() {
            return this.windowX;
        }

        public final int getWindowY() {
            return this.windowY;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + com.discord.chat.presentation.list.a.u(this.width, com.discord.chat.presentation.list.a.u(this.windowY, Integer.hashCode(this.windowX) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.windowX;
            int i10 = this.windowY;
            int i11 = this.width;
            int i12 = this.height;
            StringBuilder sbR = e.r(i7, "BlurRect(windowX=", i10, ", windowY=", ", width=");
            sbR.append(i11);
            sbR.append(", height=");
            sbR.append(i12);
            sbR.append(")");
            return sbR.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewTargetHardwareAccelerated(@NotNull Context context, @NotNull String blurTargetNativeId) {
        super(context, blurTargetNativeId);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blurTargetNativeId, "blurTargetNativeId");
        this.blurViewTargetWidth = -1;
        this.blurViewTargetHeight = -1;
        this.blurViewTargetWindowOffsetX = -1;
        this.blurViewTargetWindowOffsetY = -1;
        this.blurViewTargetLocation = new int[2];
        this.blurAmounts = new HashMap();
        this.blurRects = new HashMap();
        this.blurRectRenderNodes = new HashMap();
        this.blurContentRenderNode = s1.a();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    @Override // com.discord.blur.BlurViewAPI.Target
    public void addBlurRect(int rectId, int windowX, int windowY, int width, int height) {
        BlurRect blurRect = this.blurRects.get(Integer.valueOf(rectId));
        if (blurRect != null) {
            boolean z5 = false;
            boolean z6 = blurRect.getWindowX() == windowX && blurRect.getWindowY() == windowY;
            if (blurRect.getWidth() == width && blurRect.getHeight() == height) {
                z5 = true;
            }
            if (!z6 || !z5) {
                blurRect = null;
            }
        } else {
            blurRect = null;
        }
        if (blurRect != null) {
            return;
        }
        Map<Integer, RenderNode> map = this.blurRectRenderNodes;
        Integer numValueOf = Integer.valueOf(rectId);
        s1.f();
        map.putIfAbsent(numValueOf, s1.b("blur-" + rectId));
        this.blurRects.put(Integer.valueOf(rectId), new BlurRect(windowX, windowY, width, height));
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Float fValueOf = Float.valueOf(-1.0f);
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Map<Integer, BlurRect> map = this.blurRects;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<Integer, BlurRect>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, BlurRect> next = it.next();
            int iIntValue = next.getKey().intValue();
            BlurRect value = next.getValue();
            boolean z5 = (value.getWidth() == 0 || value.getHeight() == 0) ? false : true;
            boolean z6 = this.blurAmounts.getOrDefault(Integer.valueOf(iIntValue), fValueOf).floatValue() > 0.0f;
            if (z5 && z6) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        this.blurContentRenderNode.setPosition(0, 0, this.blurViewTargetWidth, this.blurViewTargetHeight);
        RecordingCanvas recordingCanvasBeginRecording = this.blurContentRenderNode.beginRecording();
        Intrinsics.checkNotNull(recordingCanvasBeginRecording);
        super.dispatchDraw(recordingCanvasBeginRecording);
        this.blurContentRenderNode.endRecording();
        canvas.drawRenderNode(this.blurContentRenderNode);
        for (Map.Entry<Integer, RenderNode> entry : this.blurRectRenderNodes.entrySet()) {
            int iIntValue2 = entry.getKey().intValue();
            RenderNode value2 = entry.getValue();
            BlurRect blurRect = (BlurRect) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (blurRect != null) {
                float fFloatValue = this.blurAmounts.getOrDefault(Integer.valueOf(iIntValue2), fValueOf).floatValue();
                value2.setRenderEffect(RenderEffect.createBlurEffect(Math.abs(fFloatValue), Math.abs(fFloatValue), Shader.TileMode.CLAMP));
                value2.setPosition(0, 0, blurRect.getWidth(), blurRect.getHeight());
                value2.setTranslationX(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX);
                value2.setTranslationY(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY);
                RecordingCanvas recordingCanvasBeginRecording2 = value2.beginRecording();
                recordingCanvasBeginRecording2.translate(-(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX), -(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY));
                recordingCanvasBeginRecording2.drawRenderNode(this.blurContentRenderNode);
                value2.endRecording();
                canvas.drawRenderNode(value2);
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getLocationInWindow(this.blurViewTargetLocation);
        this.blurViewTargetWidth = getWidth();
        this.blurViewTargetHeight = getHeight();
        int[] iArr = this.blurViewTargetLocation;
        this.blurViewTargetWindowOffsetX = iArr[0];
        this.blurViewTargetWindowOffsetY = iArr[1];
    }

    @Override // com.discord.blur.BlurViewAPI.Target
    public void removeBlurRect(int rectId) {
        boolean z5 = this.blurRects.remove(Integer.valueOf(rectId)) != null;
        boolean z6 = this.blurRectRenderNodes.remove(Integer.valueOf(rectId)) != null;
        boolean z7 = this.blurAmounts.remove(Integer.valueOf(rectId)) != null;
        if (z5 || z6 || z7) {
            invalidate();
        }
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurAmount(int rectId, float blurAmount) {
        float dpToPx = SizeUtilsKt.getDpToPx(BlurView.Companion.mapRadius$blur_release$default(BlurView.INSTANCE, blurAmount, 36.0f, 0.0f, 4, null));
        if (Intrinsics.areEqual(this.blurAmounts.get(Integer.valueOf(rectId)), dpToPx)) {
            return;
        }
        this.blurAmounts.put(Integer.valueOf(rectId), Float.valueOf(dpToPx));
        invalidate();
    }
}
