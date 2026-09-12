package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/animated/DecayAnimation;", "Lcom/facebook/react/animated/AnimationDriver;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "velocity", "", "deceleration", "startFrameTimeMillis", "", "fromValue", "lastValue", "iterations", "", "currentLoop", "resetConfig", "", "runAnimationStep", "frameTimeNanos", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDecayAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecayAnimation.kt\ncom/facebook/react/animated/DecayAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class DecayAnimation extends AnimationDriver {
    private int currentLoop;
    private double deceleration;
    private double fromValue;
    private int iterations;
    private double lastValue;
    private long startFrameTimeMillis;
    private double velocity;

    public DecayAnimation(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.startFrameTimeMillis = -1L;
        this.iterations = 1;
        this.currentLoop = 1;
        resetConfig(config);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.velocity = config.getDouble("velocity");
        this.deceleration = config.getDouble("deceleration");
        this.startFrameTimeMillis = -1L;
        this.fromValue = 0.0d;
        this.lastValue = 0.0d;
        int i7 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i7;
        this.currentLoop = 1;
        this.hasFinished = i7 == 0;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long frameTimeNanos) {
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j = frameTimeNanos / ((long) 1000000);
        if (this.startFrameTimeMillis == -1) {
            this.startFrameTimeMillis = j - ((long) 16);
            double d6 = this.fromValue;
            if (d6 == this.lastValue) {
                this.fromValue = valueAnimatedNode.nodeValue;
            } else {
                valueAnimatedNode.nodeValue = d6;
            }
            this.lastValue = valueAnimatedNode.nodeValue;
        }
        double d7 = this.fromValue;
        double d8 = this.velocity;
        double d9 = 1;
        double d10 = this.deceleration;
        double dExp = ((d9 - Math.exp((-(d9 - d10)) * (j - this.startFrameTimeMillis))) * (d8 / (d9 - d10))) + d7;
        if (Math.abs(this.lastValue - dExp) < 0.1d) {
            int i7 = this.iterations;
            if (i7 != -1 && this.currentLoop >= i7) {
                this.hasFinished = true;
                return;
            } else {
                this.startFrameTimeMillis = -1L;
                this.currentLoop++;
            }
        }
        this.lastValue = dExp;
        valueAnimatedNode.nodeValue = dExp;
    }
}
