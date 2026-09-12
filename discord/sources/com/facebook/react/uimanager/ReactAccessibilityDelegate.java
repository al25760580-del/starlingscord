package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.u0;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import l1.c;
import org.jetbrains.annotations.NotNull;
import rn.n;
import z0.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 =2\u00020\u0001:\u0004>?@=B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b.\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u00106R4\u0010:\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010807j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u000108`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010/¨\u0006A"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;", "Landroidx/customview/widget/a;", "Landroid/view/View;", "hostView", "", "originalFocus", "", "originalImportantForAccessibility", "<init>", "(Landroid/view/View;ZI)V", "host", "", "scheduleAccessibilityEventSender", "(Landroid/view/View;)V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "action", "Landroid/os/Bundle;", "args", "performAccessibilityAction", "(Landroid/view/View;ILandroid/os/Bundle;)Z", "", "x", "y", "getVirtualViewAt", "(FF)I", "", "virtualViewIds", "getVisibleVirtualViews", "(Ljava/util/List;)V", "virtualViewId", "node", "onPopulateNodeForVirtualView", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "arguments", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "superGetAccessibilityNodeProvider", "Landroid/view/View;", "getHostView", "()Landroid/view/View;", "Landroid/os/Handler;", "accessibilityEventHandler", "Landroid/os/Handler;", "getAccessibilityEventHandler$annotations", "()V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "accessibilityActionsMap", "Ljava/util/HashMap;", ViewProps.ACCESSIBILITY_LABELLED_BY, "Companion", "Role", "AccessibilityActionEvent", "AccessibilityRole", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactAccessibilityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1020:1\n1#2:1021\n384#3,7:1022\n*S KotlinDebug\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate\n*L\n131#1:1022,7\n*E\n"})
public class ReactAccessibilityDelegate extends androidx.customview.widget.a {
    private static final int SEND_EVENT = 1;

    @NotNull
    private static final String STATE_CHECKED = "checked";

    @NotNull
    private static final String STATE_DISABLED = "disabled";

    @NotNull
    private static final String STATE_SELECTED = "selected";

    @NotNull
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;

    @NotNull
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";

    @NotNull
    private static final String delimiter = ", ";
    private static final int delimiterLength = 2;

    @NotNull
    private final HashMap<Integer, String> accessibilityActionsMap;

    @NotNull
    private final Handler accessibilityEventHandler;
    private View accessibilityLabelledBy;

    @NotNull
    private final View hostView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Integer> actionIdMap = w0.g(new Pair("activate", Integer.valueOf(androidx.core.view.accessibility.a.f1618g.a())), new Pair("longpress", Integer.valueOf(androidx.core.view.accessibility.a.f1619h.a())), new Pair("increment", Integer.valueOf(androidx.core.view.accessibility.a.f1620i.a())), new Pair("decrement", Integer.valueOf(androidx.core.view.accessibility.a.j.a())), new Pair("expand", Integer.valueOf(androidx.core.view.accessibility.a.k.a())), new Pair(StackTraceHelper.COLLAPSE_KEY, Integer.valueOf(androidx.core.view.accessibility.a.f1621l.a())));
    private static int customActionCounter = 1056964608;

    @NotNull
    private static final Map<String, Integer> customActionIdMap = new HashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityActionEvent;", "Lcom/facebook/react/uimanager/events/Event;", "accessibilityEventData", "Lcom/facebook/react/bridge/WritableMap;", "surfaceId", "", "viewId", "<init>", "(Lcom/facebook/react/bridge/WritableMap;II)V", "getEventName", "", "getEventData", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccessibilityActionEvent extends Event<AccessibilityActionEvent> {

        @NotNull
        private final WritableMap accessibilityEventData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessibilityActionEvent(@NotNull WritableMap accessibilityEventData, int i7, int i10) {
            super(i7, i10);
            Intrinsics.checkNotNullParameter(accessibilityEventData, "accessibilityEventData");
            this.accessibilityEventData = accessibilityEventData;
        }

        @Override // com.facebook.react.uimanager.events.Event
        /* JADX INFO: renamed from: getEventData, reason: from getter */
        public WritableMap getAccessibilityEventData() {
            return this.accessibilityEventData;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        /* JADX INFO: renamed from: getEventName */
        public String getName() {
            return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b+\b\u0086\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BUTTON", "DROPDOWNLIST", "TOGGLEBUTTON", "LINK", "SEARCH", "IMAGE", "IMAGEBUTTON", "KEYBOARDKEY", "TEXT", "ADJUSTABLE", "SUMMARY", "HEADER", "ALERT", "CHECKBOX", "COMBOBOX", "MENU", "MENUBAR", "MENUITEM", "PROGRESSBAR", "RADIO", "RADIOGROUP", "SCROLLBAR", "SPINBUTTON", "SWITCH", "TAB", "TABLIST", "TIMER", "LIST", "GRID", "PAGER", "SCROLLVIEW", "HORIZONTALSCROLLVIEW", "VIEWGROUP", "WEBVIEW", "DRAWERLAYOUT", "SLIDINGDRAWER", "ICONMENU", "TOOLBAR", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum AccessibilityRole {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole$Companion;", "", "<init>", "()V", "getValue", "", ViewProps.ROLE, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "fromValue", "value", "fromRole", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "fromViewTag", "view", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[AccessibilityRole.values().length];
                    try {
                        iArr[AccessibilityRole.BUTTON.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AccessibilityRole.SEARCH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AccessibilityRole.IMAGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[AccessibilityRole.TEXT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[AccessibilityRole.CHECKBOX.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[AccessibilityRole.RADIO.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[AccessibilityRole.SWITCH.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[AccessibilityRole.LIST.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[AccessibilityRole.GRID.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[AccessibilityRole.PAGER.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[AccessibilityRole.ICONMENU.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[AccessibilityRole.WEBVIEW.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[AccessibilityRole.NONE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[AccessibilityRole.LINK.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[AccessibilityRole.SUMMARY.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[AccessibilityRole.HEADER.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[AccessibilityRole.ALERT.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[AccessibilityRole.COMBOBOX.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[AccessibilityRole.MENU.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[AccessibilityRole.MENUBAR.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[AccessibilityRole.MENUITEM.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[AccessibilityRole.TAB.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[AccessibilityRole.TABLIST.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[AccessibilityRole.TIMER.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[AccessibilityRole.TOOLBAR.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[Role.values().length];
                    try {
                        iArr2[Role.ALERT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr2[Role.BUTTON.ordinal()] = 2;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr2[Role.CHECKBOX.ordinal()] = 3;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr2[Role.COMBOBOX.ordinal()] = 4;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr2[Role.GRID.ordinal()] = 5;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr2[Role.HEADING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr2[Role.IMG.ordinal()] = 7;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr2[Role.LINK.ordinal()] = 8;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr2[Role.LIST.ordinal()] = 9;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr2[Role.MENU.ordinal()] = 10;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr2[Role.MENUBAR.ordinal()] = 11;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr2[Role.MENUITEM.ordinal()] = 12;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr2[Role.NONE.ordinal()] = 13;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr2[Role.PROGRESSBAR.ordinal()] = 14;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr2[Role.RADIO.ordinal()] = 15;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr2[Role.RADIOGROUP.ordinal()] = 16;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr2[Role.SCROLLBAR.ordinal()] = 17;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr2[Role.SEARCHBOX.ordinal()] = 18;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr2[Role.SLIDER.ordinal()] = 19;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr2[Role.SPINBUTTON.ordinal()] = 20;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr2[Role.SUMMARY.ordinal()] = 21;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr2[Role.SWITCH.ordinal()] = 22;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr2[Role.TAB.ordinal()] = 23;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr2[Role.TABLIST.ordinal()] = 24;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr2[Role.TIMER.ordinal()] = 25;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr2[Role.TOOLBAR.ordinal()] = 26;
                    } catch (NoSuchFieldError unused65) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AccessibilityRole fromRole(@NotNull Role role) {
                Intrinsics.checkNotNullParameter(role, "role");
                switch (WhenMappings.$EnumSwitchMapping$1[role.ordinal()]) {
                    case 1:
                        return AccessibilityRole.ALERT;
                    case 2:
                        return AccessibilityRole.BUTTON;
                    case 3:
                        return AccessibilityRole.CHECKBOX;
                    case 4:
                        return AccessibilityRole.COMBOBOX;
                    case 5:
                        return AccessibilityRole.GRID;
                    case 6:
                        return AccessibilityRole.HEADER;
                    case 7:
                        return AccessibilityRole.IMAGE;
                    case 8:
                        return AccessibilityRole.LINK;
                    case 9:
                        return AccessibilityRole.LIST;
                    case 10:
                        return AccessibilityRole.MENU;
                    case 11:
                        return AccessibilityRole.MENUBAR;
                    case 12:
                        return AccessibilityRole.MENUITEM;
                    case 13:
                        return AccessibilityRole.NONE;
                    case 14:
                        return AccessibilityRole.PROGRESSBAR;
                    case 15:
                        return AccessibilityRole.RADIO;
                    case 16:
                        return AccessibilityRole.RADIOGROUP;
                    case 17:
                        return AccessibilityRole.SCROLLBAR;
                    case 18:
                        return AccessibilityRole.SEARCH;
                    case 19:
                        return AccessibilityRole.ADJUSTABLE;
                    case 20:
                        return AccessibilityRole.SPINBUTTON;
                    case 21:
                        return AccessibilityRole.SUMMARY;
                    case 22:
                        return AccessibilityRole.SWITCH;
                    case 23:
                        return AccessibilityRole.TAB;
                    case 24:
                        return AccessibilityRole.TABLIST;
                    case 25:
                        return AccessibilityRole.TIMER;
                    case 26:
                        return AccessibilityRole.TOOLBAR;
                    default:
                        return null;
                }
            }

            @NotNull
            public final AccessibilityRole fromValue(String value) {
                if (value == null) {
                    return AccessibilityRole.NONE;
                }
                for (AccessibilityRole accessibilityRole : AccessibilityRole.getEntries()) {
                    if (x.i(accessibilityRole.name(), value, true)) {
                        return accessibilityRole;
                    }
                }
                throw new IllegalArgumentException("Invalid accessibility role value: ".concat(value));
            }

            public final AccessibilityRole fromViewTag(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                Role role = (Role) view.getTag(R.id.role);
                return role != null ? fromRole(role) : (AccessibilityRole) view.getTag(R.id.accessibility_role);
            }

            @NotNull
            public final String getValue(@NotNull AccessibilityRole role) {
                Intrinsics.checkNotNullParameter(role, "role");
                switch (WhenMappings.$EnumSwitchMapping$0[role.ordinal()]) {
                    case 1:
                        return "android.widget.Button";
                    case 2:
                        return "android.widget.Spinner";
                    case 3:
                        return "android.widget.ToggleButton";
                    case 4:
                        return "android.widget.EditText";
                    case 5:
                        return "android.widget.ImageView";
                    case 6:
                        return "android.widget.ImageButton";
                    case 7:
                        return "android.inputmethodservice.Keyboard$Key";
                    case 8:
                        return "android.widget.TextView";
                    case 9:
                        return "android.widget.SeekBar";
                    case 10:
                        return "android.widget.CheckBox";
                    case 11:
                        return "android.widget.RadioButton";
                    case 12:
                        return "android.widget.SpinButton";
                    case 13:
                        return "android.widget.Switch";
                    case 14:
                        return "android.widget.AbsListView";
                    case 15:
                        return "android.widget.GridView";
                    case 16:
                        return "android.widget.ScrollView";
                    case 17:
                        return "android.widget.HorizontalScrollView";
                    case 18:
                        return "androidx.viewpager.widget.ViewPager";
                    case 19:
                        return "androidx.drawerlayout.widget.DrawerLayout";
                    case 20:
                        return "android.widget.SlidingDrawer";
                    case 21:
                        return "com.android.internal.view.menu.IconMenuView";
                    case 22:
                        return "android.view.ViewGroup";
                    case 23:
                        return "android.webkit.WebView";
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        return "android.view.View";
                    default:
                        throw new n();
                }
            }

            private Companion() {
            }
        }

        public static final AccessibilityRole fromRole(@NotNull Role role) {
            return INSTANCE.fromRole(role);
        }

        @NotNull
        public static final AccessibilityRole fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        public static final AccessibilityRole fromViewTag(@NotNull View view) {
            return INSTANCE.fromViewTag(view);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public static final String getValue(@NotNull AccessibilityRole accessibilityRole) {
            return INSTANCE.getValue(accessibilityRole);
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0007J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0007J\u001c\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010)\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010*\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0002J\u001c\u0010+\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010,\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010-\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010.\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0007J\u0014\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u001c\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0014\u00102\u001a\u00020\u00052\n\u00103\u001a\u000604j\u0002`5H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;", "", "<init>", "()V", "TOP_ACCESSIBILITY_ACTION_EVENT", "", "actionIdMap", "", "", "TAG", "customActionCounter", "customActionIdMap", "", "TIMEOUT_SEND_ACCESSIBILITY_EVENT", "SEND_EVENT", "delimiter", "delimiterLength", "STATE_DISABLED", "STATE_SELECTED", "STATE_CHECKED", "setDelegate", "", "view", "Landroid/view/View;", "originalFocus", "", "originalImportantForAccessibility", "resetDelegate", "setState", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", ViewProps.ACCESSIBILITY_STATE, "Lcom/facebook/react/bridge/ReadableMap;", "setRole", "nodeInfo", ViewProps.ROLE, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "context", "Landroid/content/Context;", "hasNonActionableSpeakingDescendants", "node", "hasValidRangeInfo", "hasStateDescription", "isSpeakingNode", "hasText", "isAccessibilityFocusable", "isActionableForAccessibility", "createNodeInfoFromView", "getTalkbackDescription", "", "removeFinalDelimiter", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactAccessibilityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1020:1\n1761#2,3:1021\n*S KotlinDebug\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion\n*L\n894#1:1021,3\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccessibilityRole.values().length];
                try {
                    iArr[AccessibilityRole.LINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccessibilityRole.IMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccessibilityRole.IMAGEBUTTON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccessibilityRole.BUTTON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccessibilityRole.SUMMARY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AccessibilityRole.HEADER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AccessibilityRole.ALERT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AccessibilityRole.COMBOBOX.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AccessibilityRole.MENU.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AccessibilityRole.MENUBAR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AccessibilityRole.MENUITEM.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AccessibilityRole.PROGRESSBAR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AccessibilityRole.RADIOGROUP.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AccessibilityRole.SCROLLBAR.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AccessibilityRole.SPINBUTTON.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AccessibilityRole.TAB.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AccessibilityRole.TABLIST.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AccessibilityRole.TIMER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AccessibilityRole.TOOLBAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean hasStateDescription(AccessibilityNodeInfoCompat node) {
            if (node == null) {
                return false;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = node.f1613a;
            CharSequence charSequenceG = Build.VERSION.SDK_INT >= 30 ? d.g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
            return !(charSequenceG == null || charSequenceG.length() == 0) || accessibilityNodeInfo.isCheckable() || hasValidRangeInfo(node);
        }

        private final String removeFinalDelimiter(StringBuilder builder) {
            int length = builder.length();
            if (length > 0) {
                builder.delete(length - 2, length);
            }
            String string = builder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setState(AccessibilityNodeInfoCompat info, ReadableMap accessibilityState) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = accessibilityState.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic = accessibilityState.getDynamic(strNextKey);
                if (Intrinsics.areEqual(strNextKey, ReactAccessibilityDelegate.STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                    info.f1613a.setSelected(dynamic.asBoolean());
                } else if (Intrinsics.areEqual(strNextKey, ReactAccessibilityDelegate.STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                    info.f1613a.setEnabled(!dynamic.asBoolean());
                } else if (Intrinsics.areEqual(strNextKey, ReactAccessibilityDelegate.STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                    boolean zAsBoolean = dynamic.asBoolean();
                    info.n(true);
                    info.f1613a.setChecked(zAsBoolean);
                }
            }
        }

        public final AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
            try {
                WeakHashMap weakHashMap = u0.f1729a;
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                return accessibilityNodeInfoCompat;
            } catch (NullPointerException unused) {
                return null;
            }
        }

        public final CharSequence getTalkbackDescription(@NotNull View view, AccessibilityNodeInfoCompat info) {
            Intrinsics.checkNotNullParameter(view, "view");
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = info == null ? createNodeInfoFromView(view) : new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(info.f1613a));
            if (accessibilityNodeInfoCompatCreateNodeInfoFromView != null) {
                CharSequence contentDescription = accessibilityNodeInfoCompatCreateNodeInfoFromView.f1613a.getContentDescription();
                CharSequence charSequenceI = accessibilityNodeInfoCompatCreateNodeInfoFromView.i();
                boolean z5 = charSequenceI == null || charSequenceI.length() == 0;
                boolean z6 = view instanceof EditText;
                StringBuilder sb2 = new StringBuilder();
                if (contentDescription != null && contentDescription.length() != 0 && (!z6 || z5)) {
                    sb2.append(contentDescription);
                    return sb2;
                }
                if (!z5) {
                    sb2.append(charSequenceI);
                    return sb2;
                }
                if (view instanceof ViewGroup) {
                    StringBuilder sb3 = new StringBuilder();
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = viewGroup.getChildAt(i7);
                        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
                        WeakHashMap weakHashMap = u0.f1729a;
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                        if (isSpeakingNode(accessibilityNodeInfoCompat, childAt) && !isAccessibilityFocusable(accessibilityNodeInfoCompat, childAt)) {
                            Intrinsics.checkNotNull(childAt);
                            CharSequence talkbackDescription = getTalkbackDescription(childAt, null);
                            if (talkbackDescription != null && talkbackDescription.length() != 0) {
                                sb3.append(((Object) talkbackDescription) + ReactAccessibilityDelegate.delimiter);
                            }
                        }
                    }
                    return removeFinalDelimiter(sb3);
                }
            }
            return null;
        }

        public final boolean hasNonActionableSpeakingDescendants(AccessibilityNodeInfoCompat node, View view) {
            if (node != null && view != null && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt != null) {
                        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
                        WeakHashMap weakHashMap = u0.f1729a;
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                        if (accessibilityNodeInfoObtain.isVisibleToUser() && !isAccessibilityFocusable(accessibilityNodeInfoCompat, childAt) && isSpeakingNode(accessibilityNodeInfoCompat, childAt)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final boolean hasText(AccessibilityNodeInfoCompat node) {
            c cVar;
            if (node == null) {
                return false;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = node.f1613a;
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                cVar = new c();
                cVar.f14815a = collectionInfo;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                return false;
            }
            CharSequence charSequenceI = node.i();
            if (charSequenceI != null && charSequenceI.length() != 0) {
                return true;
            }
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription != null && contentDescription.length() != 0) {
                return true;
            }
            CharSequence charSequenceH = node.h();
            return (charSequenceH == null || charSequenceH.length() == 0) ? false : true;
        }

        public final boolean hasValidRangeInfo(AccessibilityNodeInfoCompat node) {
            if (node == null) {
                return false;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = node.f1613a.getRangeInfo();
            fj.c cVar = rangeInfo != null ? new fj.c(24, rangeInfo) : null;
            if (cVar == null) {
                return false;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo2 = (AccessibilityNodeInfo.RangeInfo) cVar.f9267e;
            float max = rangeInfo2.getMax();
            float min = rangeInfo2.getMin();
            float current = rangeInfo2.getCurrent();
            return max - min > 0.0f && current >= min && current <= max;
        }

        public final boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat node, View view) {
            if (node == null || view == null || !node.f1613a.isVisibleToUser()) {
                return false;
            }
            return node.j() || isActionableForAccessibility(node);
        }

        public final boolean isActionableForAccessibility(AccessibilityNodeInfoCompat node) {
            if (node == null) {
                return false;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = node.f1613a;
            if (accessibilityNodeInfo.isClickable() || accessibilityNodeInfo.isLongClickable() || accessibilityNodeInfo.isFocusable()) {
                return true;
            }
            ArrayList<androidx.core.view.accessibility.a> arrayListD = node.d();
            Intrinsics.checkNotNullExpressionValue(arrayListD, "getActionList(...)");
            if (arrayListD.isEmpty()) {
                return false;
            }
            for (androidx.core.view.accessibility.a aVar : arrayListD) {
                if (Intrinsics.areEqual(aVar, androidx.core.view.accessibility.a.f1618g) || Intrinsics.areEqual(aVar, androidx.core.view.accessibility.a.f1619h) || Intrinsics.areEqual(aVar, androidx.core.view.accessibility.a.f1616e)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isSpeakingNode(AccessibilityNodeInfoCompat node, View view) {
            if (node != null) {
                AccessibilityNodeInfo accessibilityNodeInfo = node.f1613a;
                if (view != null) {
                    WeakHashMap weakHashMap = u0.f1729a;
                    int importantForAccessibility = view.getImportantForAccessibility();
                    if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfo.getChildCount() > 0)) {
                        return hasText(node) || hasStateDescription(node) || accessibilityNodeInfo.isCheckable() || hasNonActionableSpeakingDescendants(node, view);
                    }
                }
            }
            return false;
        }

        public final void resetDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            u0.p(view, new ReactAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        public final void setDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (u0.f(view) != null) {
                return;
            }
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
                return;
            }
            u0.p(view, new ReactAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        public final void setRole(@NotNull AccessibilityNodeInfoCompat nodeInfo, AccessibilityRole role, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(nodeInfo, "nodeInfo");
            Intrinsics.checkNotNullParameter(context, "context");
            if (role == null) {
                role = AccessibilityRole.NONE;
            }
            nodeInfo.o(AccessibilityRole.INSTANCE.getValue(role));
            switch (WhenMappings.$EnumSwitchMapping$0[role.ordinal()]) {
                case 1:
                    nodeInfo.w(context.getString(R.string.link_description));
                    break;
                case 2:
                    nodeInfo.w(context.getString(R.string.image_description));
                    break;
                case 3:
                    nodeInfo.w(context.getString(R.string.imagebutton_description));
                    nodeInfo.p(true);
                    break;
                case 4:
                    nodeInfo.p(true);
                    break;
                case 5:
                    nodeInfo.p(true);
                    nodeInfo.n(true);
                    break;
                case 6:
                    nodeInfo.w(context.getString(R.string.summary_description));
                    break;
                case 7:
                    nodeInfo.t(true);
                    break;
                case 8:
                    nodeInfo.w(context.getString(R.string.alert_description));
                    break;
                case 9:
                    nodeInfo.w(context.getString(R.string.combobox_description));
                    break;
                case 10:
                    nodeInfo.w(context.getString(R.string.menu_description));
                    break;
                case 11:
                    nodeInfo.w(context.getString(R.string.menubar_description));
                    break;
                case 12:
                    nodeInfo.w(context.getString(R.string.menuitem_description));
                    break;
                case 13:
                    nodeInfo.w(context.getString(R.string.progressbar_description));
                    break;
                case 14:
                    nodeInfo.w(context.getString(R.string.radiogroup_description));
                    break;
                case 15:
                    nodeInfo.w(context.getString(R.string.scrollbar_description));
                    break;
                case 16:
                    nodeInfo.w(context.getString(R.string.spinbutton_description));
                    break;
                case 17:
                    nodeInfo.w(context.getString(R.string.rn_tab_description));
                    break;
                case 18:
                    nodeInfo.w(context.getString(R.string.tablist_description));
                    break;
                case 19:
                    nodeInfo.w(context.getString(R.string.timer_description));
                    break;
                case 20:
                    nodeInfo.w(context.getString(R.string.toolbar_description));
                    break;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bE\b\u0086\u0081\u0002\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001EB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bD¨\u0006F"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT", "ALERTDIALOG", "APPLICATION", "ARTICLE", "BANNER", "BUTTON", "CELL", "CHECKBOX", "COLUMNHEADER", "COMBOBOX", "COMPLEMENTARY", "CONTENTINFO", "DEFINITION", "DIALOG", "DIRECTORY", "DOCUMENT", "FEED", "FIGURE", "FORM", "GRID", "GROUP", "HEADING", "IMG", "LINK", "LIST", "LISTITEM", "LOG", "MAIN", "MARQUEE", "MATH", "MENU", "MENUBAR", "MENUITEM", "METER", "NAVIGATION", "NONE", "NOTE", "OPTION", "PRESENTATION", "PROGRESSBAR", "RADIO", "RADIOGROUP", "REGION", "ROW", "ROWGROUP", "ROWHEADER", "SCROLLBAR", "SEARCHBOX", "SEPARATOR", "SLIDER", "SPINBUTTON", "STATUS", "SUMMARY", "SWITCH", "TAB", "TABLE", "TABLIST", "TABPANEL", "TERM", "TIMER", "TOOLBAR", "TOOLTIP", "TREE", "TREEGRID", "TREEITEM", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Role {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role$Companion;", "", "<init>", "()V", "fromValue", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "value", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Role fromValue(String value) {
                for (Role role : Role.getEntries()) {
                    if (x.i(role.name(), value, true)) {
                        return role;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public static final Role fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAccessibilityDelegate(@NotNull View hostView, boolean z5, int i7) {
        super(hostView);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.hostView = hostView;
        this.accessibilityEventHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate$accessibilityEventHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                View view = (View) msg.obj;
                if (view != null) {
                    view.sendAccessibilityEvent(4);
                }
            }
        };
        this.accessibilityActionsMap = new HashMap<>();
        hostView.setFocusable(z5);
        hostView.setImportantForAccessibility(i7);
    }

    public static final AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        return INSTANCE.createNodeInfoFromView(view);
    }

    private static /* synthetic */ void getAccessibilityEventHandler$annotations() {
    }

    public static final CharSequence getTalkbackDescription(@NotNull View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return INSTANCE.getTalkbackDescription(view, accessibilityNodeInfoCompat);
    }

    public static final boolean hasNonActionableSpeakingDescendants(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        return INSTANCE.hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view);
    }

    public static final boolean hasText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return INSTANCE.hasText(accessibilityNodeInfoCompat);
    }

    public static final boolean hasValidRangeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return INSTANCE.hasValidRangeInfo(accessibilityNodeInfoCompat);
    }

    public static final boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        return INSTANCE.isAccessibilityFocusable(accessibilityNodeInfoCompat, view);
    }

    public static final boolean isActionableForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return INSTANCE.isActionableForAccessibility(accessibilityNodeInfoCompat);
    }

    public static final boolean isSpeakingNode(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        return INSTANCE.isSpeakingNode(accessibilityNodeInfoCompat, view);
    }

    public static final void resetDelegate(@NotNull View view, boolean z5, int i7) {
        INSTANCE.resetDelegate(view, z5, i7);
    }

    private final void scheduleAccessibilityEventSender(View host) {
        if (this.accessibilityEventHandler.hasMessages(1, host)) {
            this.accessibilityEventHandler.removeMessages(1, host);
        }
        Message messageObtainMessage = this.accessibilityEventHandler.obtainMessage(1, host);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
        this.accessibilityEventHandler.sendMessageDelayed(messageObtainMessage, 200L);
    }

    public static final void setDelegate(@NotNull View view, boolean z5, int i7) {
        INSTANCE.setDelegate(view, z5, i7);
    }

    public static final void setRole(@NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityRole accessibilityRole, @NotNull Context context) {
        INSTANCE.setRole(accessibilityNodeInfoCompat, accessibilityRole, context);
    }

    @Override // androidx.customview.widget.a, androidx.core.view.b
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return null;
    }

    @NotNull
    public final View getHostView() {
        return this.hostView;
    }

    @Override // androidx.customview.widget.a
    public int getVirtualViewAt(float x5, float y5) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.a
    public void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
    }

    @Override // androidx.customview.widget.a, androidx.core.view.b
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int iAsInt = dynamic.asInt();
                int iAsInt2 = dynamic2.asInt();
                int iAsInt3 = dynamic3.asInt();
                if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                    return;
                }
                event.setItemCount(iAsInt3 - iAsInt);
                event.setCurrentItemIndex(iAsInt2);
            }
        }
    }

    @Override // androidx.customview.widget.a, androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        String string;
        int iIntValue;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host.getTag(R.id.accessibility_state_expanded) != null) {
            Object tag = host.getTag(R.id.accessibility_state_expanded);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
            info.a(((Boolean) tag).booleanValue() ? 524288 : 262144);
        }
        AccessibilityRole accessibilityRoleFromViewTag = AccessibilityRole.INSTANCE.fromViewTag(host);
        String str = (String) host.getTag(R.id.accessibility_hint);
        if (accessibilityRoleFromViewTag != null) {
            Companion companion = INSTANCE;
            Context context = host.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.setRole(info, accessibilityRoleFromViewTag, context);
        }
        if (str != null) {
            info.B(str);
        }
        Object tag2 = host.getTag(R.id.labelled_by);
        if (tag2 != null) {
            View rootView = host.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            View viewFindView = ReactFindViewUtil.findView(rootView, (String) tag2);
            this.accessibilityLabelledBy = viewFindView;
            if (viewFindView != null) {
                info.f1613a.setLabeledBy(viewFindView);
            }
        }
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_state);
        if (readableMap != null) {
            INSTANCE.setState(info, readableMap);
        }
        ReadableArray readableArray = (ReadableArray) host.getTag(R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) host.getTag(R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            info.f1613a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (map == null || !map.hasKey(StackTraceHelper.NAME_KEY)) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                String string2 = map.getString(StackTraceHelper.NAME_KEY);
                if (map.hasKey("label")) {
                    string = map.getString("label");
                    io.sentry.config.a.f(string);
                } else {
                    string = "";
                }
                Integer num = actionIdMap.get(string2);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    Map<String, Integer> map2 = customActionIdMap;
                    Integer numValueOf = map2.get(string2);
                    if (numValueOf == null) {
                        int i10 = customActionCounter;
                        customActionCounter = i10 + 1;
                        numValueOf = Integer.valueOf(i10);
                        map2.put(string2, numValueOf);
                    }
                    iIntValue = numValueOf.intValue();
                }
                this.accessibilityActionsMap.put(Integer.valueOf(iIntValue), string2);
                info.b(new androidx.core.view.accessibility.a(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int iAsInt = dynamic.asInt();
                int iAsInt2 = dynamic2.asInt();
                int iAsInt3 = dynamic3.asInt();
                if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                    info.f1613a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, iAsInt, iAsInt3, iAsInt2));
                }
            }
        }
        String str2 = (String) host.getTag(R.id.react_test_id);
        if (str2 != null) {
            info.f1613a.setViewIdResourceName(str2);
        }
        CharSequence contentDescription = info.f1613a.getContentDescription();
        boolean z5 = contentDescription == null || contentDescription.length() == 0;
        CharSequence charSequenceI = info.i();
        boolean z6 = z5 && (charSequenceI == null || charSequenceI.length() == 0);
        boolean z7 = (readableArray == null && readableMap == null && tag2 == null && accessibilityRoleFromViewTag == null) ? false : true;
        if (z6 && z7) {
            info.s(INSTANCE.getTalkbackDescription(host, info));
        }
    }

    @Override // androidx.customview.widget.a
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    @Override // androidx.customview.widget.a
    public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.s("");
        node.m(new Rect(0, 0, 1, 1));
    }

    @Override // androidx.core.view.b
    public boolean performAccessibilityAction(@NotNull View host, int action, Bundle args) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (action == 524288) {
            host.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (action == 262144) {
            host.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        if (!this.accessibilityActionsMap.containsKey(Integer.valueOf(action))) {
            return super.performAccessibilityAction(host, action, args);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.accessibilityActionsMap.get(Integer.valueOf(action)));
        Context context = host.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        if (reactContext.hasActiveReactInstance()) {
            int id2 = host.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
            if (uIManager != null) {
                uIManager.getEventDispatcher().dispatchEvent(new AccessibilityActionEvent(writableMapCreateMap, surfaceId, id2));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) host.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE) {
            return true;
        }
        if (action != androidx.core.view.accessibility.a.f1620i.a() && action != androidx.core.view.accessibility.a.j.a()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            scheduleAccessibilityEventSender(host);
        }
        return super.performAccessibilityAction(host, action, args);
    }

    public final AccessibilityNodeProviderCompat superGetAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return super.getAccessibilityNodeProvider(host);
    }
}
