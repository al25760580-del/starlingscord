package im;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.imagepipeline.nativecode.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11865c;

    public /* synthetic */ a(int i7) {
        this.f11865c = i7;
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public void O(f fVar, ReadableMap config) {
        boolean z5;
        switch (this.f11865c) {
            case 0:
                b handler = (b) fVar;
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(config, "config");
                super.O(handler, config);
                if (config.hasKey("numberOfPointers")) {
                    handler.R = config.getInt("numberOfPointers");
                }
                if (config.hasKey("direction")) {
                    handler.S = config.getInt("direction");
                }
                break;
            case 1:
            case 3:
            case 6:
            case 7:
            default:
                super.O(fVar, config);
                break;
            case 2:
                i handler2 = (i) fVar;
                Intrinsics.checkNotNullParameter(handler2, "handler");
                Intrinsics.checkNotNullParameter(config, "config");
                super.O(handler2, config);
                if (config.hasKey("minDurationMs")) {
                    handler2.R = config.getInt("minDurationMs");
                }
                if (config.hasKey("maxDist")) {
                    handler2.T = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
                }
                if (config.hasKey("numberOfPointers")) {
                    handler2.U = config.getInt("numberOfPointers");
                }
                break;
            case 4:
                q handler3 = (q) fVar;
                Intrinsics.checkNotNullParameter(handler3, "handler");
                Intrinsics.checkNotNullParameter(config, "config");
                super.O(handler3, config);
                if (config.hasKey("shouldActivateOnStart")) {
                    handler3.S = config.getBoolean("shouldActivateOnStart");
                }
                if (config.hasKey("disallowInterruption")) {
                    handler3.T = config.getBoolean("disallowInterruption");
                }
                if (config.hasKey("yieldsToContinuousGestures")) {
                    handler3.U = config.getBoolean("yieldsToContinuousGestures");
                }
                if (config.hasKey("delaysChildPressedState")) {
                    handler3.V = Boolean.valueOf(config.getBoolean("delaysChildPressedState"));
                }
                break;
            case 5:
                s handler4 = (s) fVar;
                Intrinsics.checkNotNullParameter(handler4, "handler");
                Intrinsics.checkNotNullParameter(config, "config");
                super.O(handler4, config);
                boolean z6 = true;
                if (config.hasKey("activeOffsetXStart")) {
                    handler4.W = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXStart"));
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (config.hasKey("activeOffsetXEnd")) {
                    handler4.X = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXEnd"));
                    z5 = true;
                }
                if (config.hasKey("failOffsetXStart")) {
                    handler4.Y = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXStart"));
                    z5 = true;
                }
                if (config.hasKey("failOffsetXEnd")) {
                    handler4.Z = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXEnd"));
                    z5 = true;
                }
                if (config.hasKey("activeOffsetYStart")) {
                    handler4.a0 = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYStart"));
                    z5 = true;
                }
                if (config.hasKey("activeOffsetYEnd")) {
                    handler4.f11947b0 = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYEnd"));
                    z5 = true;
                }
                if (config.hasKey("failOffsetYStart")) {
                    handler4.f11948c0 = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYStart"));
                    z5 = true;
                }
                if (config.hasKey("failOffsetYEnd")) {
                    handler4.f11949d0 = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYEnd"));
                    z5 = true;
                }
                if (config.hasKey("minVelocity")) {
                    handler4.f11952g0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocity"));
                    z5 = true;
                }
                if (config.hasKey("minVelocityX")) {
                    handler4.f11950e0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityX"));
                    z5 = true;
                }
                if (config.hasKey("minVelocityY")) {
                    handler4.f11951f0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityY"));
                } else {
                    z6 = z5;
                }
                if (config.hasKey("minDist")) {
                    handler4.V = PixelUtil.toPixelFromDIP(config.getDouble("minDist"));
                } else if (z6) {
                    handler4.V = Float.MAX_VALUE;
                }
                if (config.hasKey("minPointers")) {
                    handler4.h0 = config.getInt("minPointers");
                }
                if (config.hasKey("maxPointers")) {
                    handler4.f11953i0 = config.getInt("maxPointers");
                }
                if (config.hasKey("avgTouches")) {
                    handler4.f11961q0 = config.getBoolean("avgTouches");
                }
                if (config.hasKey("activateAfterLongPress")) {
                    handler4.f11962r0 = config.getInt("activateAfterLongPress");
                }
                break;
            case 8:
                a0 handler5 = (a0) fVar;
                Intrinsics.checkNotNullParameter(handler5, "handler");
                Intrinsics.checkNotNullParameter(config, "config");
                super.O(handler5, config);
                if (config.hasKey("numberOfTaps")) {
                    handler5.W = config.getInt("numberOfTaps");
                }
                if (config.hasKey("maxDurationMs")) {
                    handler5.U = config.getInt("maxDurationMs");
                }
                if (config.hasKey("maxDelayMs")) {
                    handler5.V = config.getInt("maxDelayMs");
                }
                if (config.hasKey("maxDeltaX")) {
                    handler5.R = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaX"));
                }
                if (config.hasKey("maxDeltaY")) {
                    handler5.S = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaY"));
                }
                if (config.hasKey("maxDist")) {
                    handler5.T = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
                }
                if (config.hasKey("minPointers")) {
                    handler5.X = config.getInt("minPointers");
                }
                break;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public final f l(ReactApplicationContext reactApplicationContext) {
        switch (this.f11865c) {
            case 0:
                return new b();
            case 1:
                return new h();
            case 2:
                Intrinsics.checkNotNull(reactApplicationContext);
                return new i(reactApplicationContext);
            case 3:
                return new j();
            case 4:
                return new q();
            case 5:
                return new s(reactApplicationContext);
            case 6:
                return new t();
            case 7:
                return new w();
            default:
                return new a0();
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public final lm.b p(f fVar) {
        switch (this.f11865c) {
            case 0:
                b handler = (b) fVar;
                Intrinsics.checkNotNullParameter(handler, "handler");
                return new lm.a(handler);
            case 1:
                h handler2 = (h) fVar;
                Intrinsics.checkNotNullParameter(handler2, "handler");
                return new lm.c(handler2);
            case 2:
                i handler3 = (i) fVar;
                Intrinsics.checkNotNullParameter(handler3, "handler");
                return new lm.d(handler3);
            case 3:
                j handler4 = (j) fVar;
                Intrinsics.checkNotNullParameter(handler4, "handler");
                Intrinsics.checkNotNullParameter(handler4, "handler");
                return new lm.e(handler4);
            case 4:
                q handler5 = (q) fVar;
                Intrinsics.checkNotNullParameter(handler5, "handler");
                return new lm.f(handler5);
            case 5:
                s handler6 = (s) fVar;
                Intrinsics.checkNotNullParameter(handler6, "handler");
                return new lm.g(handler6);
            case 6:
                t handler7 = (t) fVar;
                Intrinsics.checkNotNullParameter(handler7, "handler");
                return new lm.h(handler7);
            case 7:
                w handler8 = (w) fVar;
                Intrinsics.checkNotNullParameter(handler8, "handler");
                return new lm.h(handler8);
            default:
                a0 handler9 = (a0) fVar;
                Intrinsics.checkNotNullParameter(handler9, "handler");
                return new lm.a(handler9);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public final String x() {
        switch (this.f11865c) {
            case 0:
                return "FlingGestureHandler";
            case 1:
                return "HoverGestureHandler";
            case 2:
                return "LongPressGestureHandler";
            case 3:
                return "ManualGestureHandler";
            case 4:
                return "NativeViewGestureHandler";
            case 5:
                return "PanGestureHandler";
            case 6:
                return "PinchGestureHandler";
            case 7:
                return "RotationGestureHandler";
            default:
                return "TapGestureHandler";
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public final Class y() {
        switch (this.f11865c) {
            case 0:
                return b.class;
            case 1:
                return h.class;
            case 2:
                return i.class;
            case 3:
                return j.class;
            case 4:
                return q.class;
            case 5:
                return s.class;
            case 6:
                return t.class;
            case 7:
                return w.class;
            default:
                return a0.class;
        }
    }
}
