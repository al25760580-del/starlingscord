package androidx.core.view.accessibility;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1616e = new a(1, (CharSequence) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f1617f = new a(2, (CharSequence) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1620i;
    public static final a j;
    public static final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f1621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f1622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f1624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f1625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f1626q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f1629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewCommand f1630d;

    static {
        new a(4, (CharSequence) null);
        new a(8, (CharSequence) null);
        f1618g = new a(16, (CharSequence) null);
        f1619h = new a(32, (CharSequence) null);
        new a(64, (CharSequence) null);
        new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, (CharSequence) null);
        new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, b.class);
        new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, b.class);
        new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, c.class);
        new a(RecyclerView.ItemAnimator.FLAG_MOVED, c.class);
        f1620i = new a(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, (CharSequence) null);
        j = new a(8192, (CharSequence) null);
        new a(16384, (CharSequence) null);
        new a(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, (CharSequence) null);
        new a(65536, (CharSequence) null);
        new a(131072, g.class);
        k = new a(262144, (CharSequence) null);
        f1621l = new a(524288, (CharSequence) null);
        f1622m = new a(1048576, (CharSequence) null);
        new a(2097152, h.class);
        int i7 = Build.VERSION.SDK_INT;
        new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f1623n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, e.class);
        f1624o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f1625p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, f.class);
        new a(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, d.class);
        new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f1626q = new a(i7 >= 34 ? a2.a.e() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public a(int i7, CharSequence charSequence) {
        this(null, i7, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1627a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        Object obj2 = ((a) obj).f1627a;
        Object obj3 = this.f1627a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1627a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strE = AccessibilityNodeInfoCompat.e(this.f1628b);
        if (strE.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1627a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strE = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strE);
        return sb2.toString();
    }

    public a(int i7, Class cls) {
        this(null, i7, null, null, cls);
    }

    public a(Object obj, int i7, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
        this.f1628b = i7;
        this.f1630d = accessibilityViewCommand;
        if (obj == null) {
            this.f1627a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
        } else {
            this.f1627a = obj;
        }
        this.f1629c = cls;
    }
}
