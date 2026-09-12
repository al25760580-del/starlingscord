package com.facebook.react.uimanager.events;

import com.discord.media.engine.MediaEngine;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/events/KeyEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "keyEvent", "Landroid/view/KeyEvent;", "<init>", "(IILandroid/view/KeyEvent;)V", "keyCode", "unicodeChar", "isAltPressed", "", "isCtrlPressed", "isMetaPressed", "isShiftPressed", "canCoalesce", "getEventCategory", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "getKeyString", "", "getCodeString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class KeyEvent extends Event<KeyEvent> {

    @NotNull
    private static final Lazy CODE_MAP$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy KEY_NAME_MAP$delegate;

    @NotNull
    private static final String UNIDENTIFIED = "Unidentified";
    private final boolean isAltPressed;
    private final boolean isCtrlPressed;
    private final boolean isMetaPressed;
    private final boolean isShiftPressed;
    private final int keyCode;
    private final int unicodeChar;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/uimanager/events/KeyEvent$Companion;", "", "<init>", "()V", "UNIDENTIFIED", "", "CODE_MAP", "", "", "getCODE_MAP", "()Ljava/util/Map;", "CODE_MAP$delegate", "Lkotlin/Lazy;", "KEY_NAME_MAP", "getKEY_NAME_MAP", "KEY_NAME_MAP$delegate", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<Integer, String> getCODE_MAP() {
            return (Map) KeyEvent.CODE_MAP$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<Integer, String> getKEY_NAME_MAP() {
            return (Map) KeyEvent.KEY_NAME_MAP$delegate.getValue();
        }

        private Companion() {
        }
    }

    static {
        m mVar = m.f19486e;
        CODE_MAP$delegate = l.a(mVar, new com.discord.sticker.sticker_types.c(8));
        KEY_NAME_MAP$delegate = l.a(mVar, new com.discord.sticker.sticker_types.c(9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyEvent(int i7, int i10, @NotNull android.view.KeyEvent keyEvent) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        this.keyCode = keyEvent.getKeyCode();
        this.unicodeChar = keyEvent.getUnicodeChar();
        this.isAltPressed = keyEvent.isAltPressed();
        this.isCtrlPressed = keyEvent.isCtrlPressed();
        this.isMetaPressed = keyEvent.isMetaPressed();
        this.isShiftPressed = keyEvent.isShiftPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map CODE_MAP_delegate$lambda$0() {
        return w0.g(new Pair(29, "KeyA"), new Pair(30, "KeyB"), new Pair(31, "KeyC"), new Pair(32, "KeyD"), new Pair(33, "KeyE"), new Pair(34, "KeyF"), new Pair(35, "KeyG"), new Pair(36, "KeyH"), new Pair(37, "KeyI"), new Pair(38, "KeyJ"), new Pair(39, "KeyK"), new Pair(40, "KeyL"), new Pair(41, "KeyM"), new Pair(42, "KeyN"), new Pair(43, "KeyO"), new Pair(44, "KeyP"), new Pair(45, "KeyQ"), new Pair(46, "KeyR"), new Pair(47, "KeyS"), new Pair(48, "KeyT"), new Pair(49, "KeyU"), new Pair(50, "KeyV"), new Pair(51, "KeyW"), new Pair(52, "KeyX"), new Pair(53, "KeyY"), new Pair(54, "KeyZ"), new Pair(7, "Digit0"), new Pair(8, "Digit1"), new Pair(9, "Digit2"), new Pair(10, "Digit3"), new Pair(11, "Digit4"), new Pair(12, "Digit5"), new Pair(13, "Digit6"), new Pair(14, "Digit7"), new Pair(15, "Digit8"), new Pair(16, "Digit9"), new Pair(66, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE), new Pair(62, "Space"), new Pair(61, "Tab"), new Pair(67, ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE), new Pair(111, "Escape"), new Pair(59, "ShiftLeft"), new Pair(60, "ShiftRight"), new Pair(113, "ControlLeft"), new Pair(Integer.valueOf(MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION), "ControlRight"), new Pair(57, "AltLeft"), new Pair(58, "AltRight"), new Pair(117, "MetaLeft"), new Pair(118, "MetaRight"), new Pair(19, "ArrowUp"), new Pair(20, "ArrowDown"), new Pair(21, "ArrowLeft"), new Pair(22, "ArrowRight"), new Pair(23, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map KEY_NAME_MAP_delegate$lambda$1() {
        return w0.g(new Pair(66, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE), new Pair(23, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE), new Pair(62, " "), new Pair(61, "Tab"), new Pair(67, ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE), new Pair(111, "Escape"), new Pair(59, "Shift"), new Pair(60, "Shift"), new Pair(113, "Control"), new Pair(Integer.valueOf(MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION), "Control"), new Pair(57, "Alt"), new Pair(58, "Alt"), new Pair(117, "Meta"), new Pair(118, "Meta"), new Pair(19, "ArrowUp"), new Pair(20, "ArrowDown"), new Pair(21, "ArrowLeft"), new Pair(22, "ArrowRight"));
    }

    private final String getCodeString() {
        String str = (String) INSTANCE.getCODE_MAP().get(Integer.valueOf(this.keyCode));
        return str == null ? UNIDENTIFIED : str;
    }

    private final String getKeyString() {
        int i7 = this.unicodeChar;
        if (i7 != 0 && !Character.isISOControl(i7)) {
            return String.valueOf((char) this.unicodeChar);
        }
        String str = (String) INSTANCE.getKEY_NAME_MAP().get(Integer.valueOf(this.keyCode));
        return str == null ? UNIDENTIFIED : str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public int getEventCategory() {
        return 3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("key", getKeyString());
        writableMapCreateMap.putString("code", getCodeString());
        writableMapCreateMap.putBoolean("altKey", this.isAltPressed);
        writableMapCreateMap.putBoolean("ctrlKey", this.isCtrlPressed);
        writableMapCreateMap.putBoolean("metaKey", this.isMetaPressed);
        writableMapCreateMap.putBoolean("shiftKey", this.isShiftPressed);
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        return writableMapCreateMap;
    }
}
