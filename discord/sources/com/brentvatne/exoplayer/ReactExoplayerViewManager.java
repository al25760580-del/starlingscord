package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.discord.jank_stats.JankStatsAggregatorKt;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.a;
import e5.b;
import e5.e;
import e5.i;
import e5.j;
import fe.g;
import gc.h;
import gc.j1;
import gc.n1;
import gc.u1;
import gc.v1;
import he.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import je.a0;
import je.e0;
import je.z;
import m3.m;
import md.r0;

/* JADX INFO: loaded from: classes.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<i> {
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_DRM = "drm";
    private static final String PROP_DRM_HEADERS = "headers";
    private static final String PROP_DRM_LICENSESERVER = "licenseServer";
    private static final String PROP_DRM_TYPE = "type";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_HTTP_ENGINE = "httpEngine";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RNVVideo";
    private e config;
    private float lastSeekPosition = Float.NaN;

    public ReactExoplayerViewManager(e eVar) {
        this.config = eVar;
    }

    private int convertToIntDef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i7 = Integer.parseInt(str);
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    i10 = 4;
                    if (i7 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i10;
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        if (!readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            return null;
        }
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, readableMap.getString(strNextKey));
        }
        return map;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        for (int i7 = 0; i7 < 20; i7++) {
            String str = j.f8085c[i7];
            builder.put(ReactNativeFeatureFlags.enableFabricRenderer() ? ViewProps.TOP + str.replaceFirst("^on", "") : str, MapBuilder.of("registrationName", str));
        }
        return builder.build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.of("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(i iVar, int i7) {
        iVar.S = i7;
        iVar.k();
        iVar.i();
    }

    @ReactProp(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(i iVar, ReadableMap readableMap) {
        if (readableMap != null) {
            int i7 = readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) : 50000;
            int i10 = readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) : 50000;
            int i11 = readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) : 2500;
            int i12 = readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) : 5000;
            iVar.U = i7;
            iVar.V = i10;
            iVar.W = i11;
            iVar.a0 = i12;
            iVar.k();
            iVar.i();
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(i iVar, boolean z5) {
        iVar.m(z5);
    }

    @ReactProp(name = PROP_DRM)
    public void setDRM(i iVar, ReadableMap readableMap) {
        UUID uuidFromString;
        if (readableMap == null || !readableMap.hasKey("type")) {
            return;
        }
        UUID uuidFromString2 = null;
        String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        String string2 = readableMap.hasKey(PROP_DRM_LICENSESERVER) ? readableMap.getString(PROP_DRM_LICENSESERVER) : null;
        ReadableMap map = readableMap.hasKey(PROP_DRM_HEADERS) ? readableMap.getMap(PROP_DRM_HEADERS) : null;
        if (string == null || string2 == null) {
            return;
        }
        int i7 = e0.f13788a;
        String strT = m.T(string);
        strT.getClass();
        switch (strT) {
            case "playready":
                uuidFromString = h.f9673e;
                break;
            case "widevine":
                uuidFromString = h.f9672d;
                break;
            case "clearkey":
                uuidFromString = h.f9671c;
                break;
            default:
                try {
                    uuidFromString = UUID.fromString(string);
                    break;
                } catch (RuntimeException unused) {
                    uuidFromString = null;
                    break;
                }
                break;
        }
        if (uuidFromString != null) {
            String strT2 = m.T(string);
            strT2.getClass();
            switch (strT2) {
                case "playready":
                    uuidFromString2 = h.f9673e;
                    break;
                case "widevine":
                    uuidFromString2 = h.f9672d;
                    break;
                case "clearkey":
                    uuidFromString2 = h.f9671c;
                    break;
                default:
                    try {
                        uuidFromString2 = UUID.fromString(string);
                        break;
                    } catch (RuntimeException unused2) {
                        break;
                    }
                    break;
            }
            iVar.f8075t0 = uuidFromString2;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    arrayList.add(strNextKey);
                    arrayList.add(map.getString(strNextKey));
                }
            }
            iVar.f8083y.setUseTextureView(false);
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(i iVar, boolean z5) {
        iVar.f8068m0 = z5;
    }

    @ReactProp(defaultBoolean = false, name = PROP_FULLSCREEN)
    public void setFullscreen(i iVar, boolean z5) {
        iVar.n(z5);
    }

    @ReactProp(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(i iVar, boolean z5) {
        iVar.f8083y.setHideShutterView(z5);
    }

    @ReactProp(name = PROP_HTTP_ENGINE)
    public void setHttpEngine(i iVar, String str) {
        boolean zEquals = Objects.equals(iVar.f8073r0, str);
        iVar.f8073r0 = str;
        if (zEquals || iVar.f8056c0 == null) {
            return;
        }
        iVar.E = b.a(iVar.f8078v0, iVar.f8063i, iVar.f8072q0, str);
        iVar.H = true;
        iVar.i();
    }

    @ReactProp(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(i iVar, int i7) {
        iVar.T = i7;
        if (iVar.F != null) {
            DefaultTrackSelector defaultTrackSelector = iVar.G;
            a aVarC = defaultTrackSelector.c();
            aVarC.getClass();
            g gVar = new g(aVarC);
            int i10 = iVar.T;
            if (i10 == 0) {
                i10 = Integer.MAX_VALUE;
            }
            gVar.f9124d = i10;
            defaultTrackSelector.i(new a(gVar));
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(i iVar, boolean z5) {
        iVar.o(z5);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(i iVar, boolean z5) {
        iVar.q(z5);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(i iVar, boolean z5) {
        iVar.f8071p0 = z5;
    }

    @ReactProp(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public void setPreventsDisplaySleepDuringVideoPlayback(i iVar, boolean z5) {
        iVar.f8069n0 = z5;
    }

    @ReactProp(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(i iVar, float f2) {
        iVar.f8070o0 = f2;
    }

    @ReactProp(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(i iVar, ReadableArray readableArray) {
        iVar.f8067l0 = readableArray;
        iVar.H = true;
        iVar.i();
    }

    @ReactProp(name = PROP_RATE)
    public void setRate(i iVar, float f2) {
        iVar.Q = f2;
        if (iVar.F != null) {
            iVar.F.e0(new PlaybackParameters(iVar.Q, 1.0f));
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(i iVar, boolean z5) {
        SimpleExoPlayer simpleExoPlayer = iVar.F;
        if (simpleExoPlayer != null) {
            if (z5) {
                simpleExoPlayer.F(1);
            } else {
                simpleExoPlayer.F(0);
            }
        }
        iVar.f8060e0 = z5;
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(i iVar, boolean z5) {
        iVar.f8074s0 = z5;
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(i iVar, String str) {
        iVar.f8083y.setResizeMode(convertToIntDef(str));
    }

    @ReactProp(name = PROP_SEEK)
    public void setSeek(i iVar, float f2) {
        if (f2 != this.lastSeekPosition) {
            this.lastSeekPosition = f2;
            long jRound = Math.round(f2 * 1000.0f);
            SimpleExoPlayer simpleExoPlayer = iVar.F;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.b0(5, jRound);
            }
        }
    }

    @ReactProp(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(i iVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        iVar.f8061f0 = str;
        iVar.f8062g0 = dynamic;
        iVar.v(1, str, dynamic);
    }

    @ReactProp(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(i iVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        iVar.f8065j0 = str;
        iVar.f8066k0 = dynamic;
        iVar.v(3, str, dynamic);
    }

    @ReactProp(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(i iVar, ReadableMap readableMap) {
        Dynamic dynamic;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            str = string;
        } else {
            dynamic = null;
        }
        iVar.h0 = str;
        iVar.f8064i0 = dynamic;
        iVar.v(2, str, dynamic);
    }

    @ReactProp(name = PROP_SRC)
    public void setSrc(i iVar, ReadableMap readableMap) {
        Uri uriBuildRawResourceUri;
        n1 n1Var;
        Pair pairK0;
        Context applicationContext = iVar.getContext().getApplicationContext();
        String string = readableMap.hasKey(PROP_SRC_URI) ? readableMap.getString(PROP_SRC_URI) : null;
        String string2 = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        Map<String, String> stringMap = readableMap.hasKey(PROP_SRC_HEADERS) ? toStringMap(readableMap.getMap(PROP_SRC_HEADERS)) : null;
        if (!TextUtils.isEmpty(string)) {
            if (startsWithValidScheme(string)) {
                Uri uri = Uri.parse(string);
                if (uri != null) {
                    boolean zEquals = uri.equals(iVar.f8056c0);
                    iVar.f8056c0 = uri;
                    iVar.f8058d0 = string2;
                    iVar.f8072q0 = stringMap;
                    iVar.E = b.a(iVar.f8078v0, iVar.f8063i, stringMap, iVar.f8073r0);
                    if (zEquals) {
                        return;
                    }
                    iVar.H = true;
                    iVar.i();
                    return;
                }
                return;
            }
            int identifier = applicationContext.getResources().getIdentifier(string, "drawable", applicationContext.getPackageName());
            if (identifier == 0) {
                identifier = applicationContext.getResources().getIdentifier(string, "raw", applicationContext.getPackageName());
            }
            if (identifier <= 0 || (uriBuildRawResourceUri = p0.buildRawResourceUri(identifier)) == null) {
                return;
            }
            boolean zEquals2 = uriBuildRawResourceUri.equals(iVar.f8056c0);
            iVar.f8056c0 = uriBuildRawResourceUri;
            iVar.f8058d0 = string2;
            iVar.E = iVar.c(true);
            if (zEquals2) {
                return;
            }
            iVar.H = true;
            iVar.i();
            return;
        }
        if (iVar.f8056c0 != null) {
            iVar.F.g0();
            SimpleExoPlayer simpleExoPlayer = iVar.F;
            simpleExoPlayer.c0();
            c cVar = simpleExoPlayer.f5586b;
            ArrayList arrayList = cVar.f5657o;
            cVar.x0();
            int size = arrayList.size();
            int iMin = Math.min(Integer.MAX_VALUE, size);
            if (size > 0 && iMin != 0) {
                j1 j1Var = cVar.f5650g0;
                int iH0 = cVar.h0(j1Var);
                long jF0 = cVar.f0(j1Var);
                Timeline timeline = j1Var.f9714a;
                int size2 = arrayList.size();
                cVar.F++;
                cVar.m0(iMin);
                n1 n1Var2 = new n1(arrayList, cVar.K);
                u1 u1Var = cVar.f5656n;
                if (timeline.p() || n1Var2.p()) {
                    n1Var = n1Var2;
                    boolean z5 = !timeline.p() && n1Var.p();
                    pairK0 = cVar.k0(n1Var, z5 ? -1 : iH0, z5 ? -9223372036854775807L : jF0);
                } else {
                    pairK0 = timeline.i(cVar.f5591a, cVar.f5656n, iH0, e0.I(jF0));
                    Object obj = pairK0.first;
                    if (n1Var2.b(obj) != -1) {
                        n1Var = n1Var2;
                    } else {
                        Object objF = gc.e0.F(cVar.f5591a, cVar.f5656n, cVar.D, cVar.E, obj, timeline, n1Var2);
                        n1Var = n1Var2;
                        if (objF != null) {
                            n1Var.g(objF, u1Var);
                            int i7 = u1Var.f9888i;
                            v1 v1Var = cVar.f5591a;
                            n1Var.m(i7, v1Var, 0L);
                            pairK0 = cVar.k0(n1Var, i7, e0.U(v1Var.J));
                        } else {
                            pairK0 = cVar.k0(n1Var, -1, -9223372036854775807L);
                        }
                    }
                }
                j1 j1VarJ0 = cVar.j0(j1Var, n1Var, pairK0);
                int i10 = j1VarJ0.f9718e;
                if (i10 != 1 && i10 != 4 && iMin > 0 && iMin == size2 && iH0 >= j1VarJ0.f9714a.o()) {
                    j1VarJ0 = j1VarJ0.g(4);
                }
                gc.e0 e0Var = cVar.k;
                r0 r0Var = cVar.K;
                a0 a0Var = e0Var.E;
                a0Var.getClass();
                z zVarB = a0.b();
                zVarB.f13867a = a0Var.f13757a.obtainMessage(20, 0, iMin, r0Var);
                zVarB.b();
                cVar.v0(j1VarJ0, 0, 1, !j1VarJ0.f9715b.f15689a.equals(cVar.f5650g0.f9715b.f15689a), 4, cVar.g0(j1VarJ0), -1, false);
            }
            iVar.f8056c0 = null;
            iVar.f8058d0 = null;
            iVar.f8072q0 = null;
            iVar.E = null;
            iVar.I = -1;
            iVar.J = -9223372036854775807;
        }
    }

    @ReactProp(defaultBoolean = true, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(i iVar, boolean z5) {
        iVar.f8083y.setUseTextureView(z5 && iVar.f8075t0 == null);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = PROP_VOLUME)
    public void setVolume(i iVar, float f2) {
        iVar.R = f2;
        SimpleExoPlayer simpleExoPlayer = iVar.F;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.f0(f2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(ThemedReactContext themedReactContext) {
        return new i(themedReactContext, this.config);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(i iVar) {
        if (iVar.L) {
            iVar.n(false);
        }
        iVar.f8080w0.abandonAudioFocus(iVar);
        iVar.k();
    }
}
