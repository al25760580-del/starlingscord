package nm;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f16977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, String str, int i10, int i11) {
        super(i7, i10);
        this.f16976d = i11;
        this.f16977e = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        switch (this.f16976d) {
        }
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        switch (this.f16976d) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("text", (String) this.f16977e);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("text", (String) this.f16977e);
                return writableMapCreateMap2;
            case 2:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("text", (String) this.f16977e);
                return writableMapCreateMap3;
            default:
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                writableMapCreateMap4.putString("error", ((Throwable) this.f16977e).getMessage());
                return writableMapCreateMap4;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventName */
    public final String getName() {
        switch (this.f16976d) {
            case 0:
                return "topChangeText";
            case 1:
                return "topSearchButtonPress";
            case 2:
                return "topFocusedInputTextChanged";
            default:
                return "topAnimationFailure";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i7, int i10, Throwable error) {
        super(i7, i10);
        this.f16976d = 3;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16977e = error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i7, int i10, String text) {
        super(i7, i10);
        this.f16976d = 2;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16977e = text;
    }
}
