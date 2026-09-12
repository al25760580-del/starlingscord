package e5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8085c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RCTEventEmitter f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8087b = -1;

    public j(ThemedReactContext themedReactContext) {
        this.f8086a = (RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class);
    }

    public final void a(double d6, int i7, int i10, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("bitrate", d6);
        writableMapCreateMap.putInt("width", i10);
        writableMapCreateMap.putInt("height", i7);
        writableMapCreateMap.putString("trackId", str);
        c("onVideoBandwidthUpdate", writableMapCreateMap);
    }

    public final void b(String str, Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("errorString", str);
        writableMapCreateMap.putString("errorException", exc.toString());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("error", writableMapCreateMap);
        c("onVideoError", writableMapCreateMap2);
    }

    public final void c(String str, WritableMap writableMap) {
        int i7 = this.f8087b;
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        this.f8086a.receiveEvent(i7, str, writableMap);
    }
}
