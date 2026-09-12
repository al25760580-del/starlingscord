package com.facebook.react.uimanager;

import a3.e;
import android.widget.ImageView;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.textinput.ReactContentSizeChangedEvent;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.collections.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/UIManagerModuleConstants;", "", "<init>", "()V", "bubblingEventTypeConstants", "", "", "directEventTypeConstants", "constants", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIManagerModuleConstants {

    @NotNull
    public static final UIManagerModuleConstants INSTANCE = new UIManagerModuleConstants();

    @NotNull
    public static final Map<String, Object> bubblingEventTypeConstants;

    @NotNull
    public static final Map<String, Object> constants;

    @NotNull
    public static final Map<String, Object> directEventTypeConstants;

    static {
        Pair pair = new Pair(ReactTextChangedEvent.EVENT_NAME, v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onChange"), new Pair("captured", "onChangeCapture")))));
        Pair pair2 = new Pair("topSelect", v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onSelect"), new Pair("captured", "onSelectCapture")))));
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        bubblingEventTypeConstants = w0.g(pair, pair2, new Pair(companion.getJSEventName(TouchEventType.START), v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onTouchStart"), new Pair("captured", "onTouchStartCapture"))))), new Pair(companion.getJSEventName(TouchEventType.MOVE), v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onTouchMove"), new Pair("captured", "onTouchMoveCapture"))))), new Pair(companion.getJSEventName(TouchEventType.END), v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onTouchEnd"), new Pair("captured", "onTouchEndCapture"))))), new Pair(companion.getJSEventName(TouchEventType.CANCEL), v0.b(new Pair("phasedRegistrationNames", w0.g(new Pair("bubbled", "onTouchCancel"), new Pair("captured", "onTouchCancelCapture"))))));
        directEventTypeConstants = w0.g(new Pair(ReactContentSizeChangedEvent.EVENT_NAME, e.v("registrationName", "onContentSizeChange")), new Pair("topLayout", e.v("registrationName", "onLayout")), new Pair("topLoadingError", e.v("registrationName", "onLoadingError")), new Pair("topLoadingFinish", e.v("registrationName", "onLoadingFinish")), new Pair("topLoadingStart", e.v("registrationName", "onLoadingStart")), new Pair("topSelectionChange", e.v("registrationName", "onSelectionChange")), new Pair("topMessage", e.v("registrationName", "onMessage")), new Pair("topScrollBeginDrag", e.v("registrationName", "onScrollBeginDrag")), new Pair("topScrollEndDrag", e.v("registrationName", "onScrollEndDrag")), new Pair("topScroll", e.v("registrationName", "onScroll")), new Pair("topMomentumScrollBegin", e.v("registrationName", "onMomentumScrollBegin")), new Pair("topMomentumScrollEnd", e.v("registrationName", "onMomentumScrollEnd")));
        constants = w0.g(new Pair("UIView", v0.b(new Pair("ContentMode", w0.g(new Pair("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), new Pair("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), new Pair("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), new Pair("StyleConstants", v0.b(new Pair("PointerEventsValues", w0.g(new Pair(ViewProps.NONE, Integer.valueOf(PointerEvents.NONE.ordinal())), new Pair("boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal())), new Pair("boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal())), new Pair("unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal())))))), new Pair("AccessibilityEventTypes", w0.g(new Pair("typeWindowStateChanged", 32), new Pair("typeViewFocused", 8), new Pair("typeViewClicked", 1))));
    }

    private UIManagerModuleConstants() {
    }
}
