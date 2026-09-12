package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.webrtc.PeerConnection;
import s.l;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.b {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy$BoundsAdapter NODE_ADAPTER = new i8.c(2);
    private static final FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER = new j(2);
    private final View mHost;
    private final AccessibilityManager mManager;
    private ExploreByTouchHelper$MyNodeProvider mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = u0.f1729a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final AccessibilityEvent a(int i7, int i10) {
        if (i7 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i10);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i7);
        accessibilityEventObtain2.getText().add(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.i());
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.f1613a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i7, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(this.mHost, i7);
        accessibilityEventObtain2.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final AccessibilityNodeInfoCompat b(int i7) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoCompat.o(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoCompat.m(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        accessibilityNodeInfoObtain.setParent(this.mHost);
        onPopulateNodeForVirtualView(i7, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.i() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompat.g(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(this.mHost.getContext().getPackageName());
        View view = this.mHost;
        accessibilityNodeInfoCompat.f1614b = i7;
        accessibilityNodeInfoObtain.setSource(view, i7);
        if (this.mAccessibilityFocusedVirtualViewId == i7) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z5 = this.mKeyboardFocusedVirtualViewId == i7;
        if (z5) {
            accessibilityNodeInfoCompat.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z5);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfoObtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            accessibilityNodeInfoCompat.g(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(this.mTempScreenRect);
                Rect rect2 = this.mTempScreenRect;
                if (rect2 != null && !rect2.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoCompat.f1613a.setVisibleToUser(true);
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    public final boolean c(int i7, Rect rect) {
        Object obj;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int iD;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sparseArrayCompat.e(((Integer) arrayList.get(i10)).intValue(), b(((Integer) arrayList.get(i10)).intValue()));
        }
        int i11 = this.mKeyboardFocusedVirtualViewId;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i11 == Integer.MIN_VALUE ? null : (AccessibilityNodeInfoCompat) sparseArrayCompat.c(i11);
        int i12 = -1;
        if (i7 == 1 || i7 == 2) {
            View view = this.mHost;
            WeakHashMap weakHashMap = u0.f1729a;
            boolean z5 = view.getLayoutDirection() == 1;
            FocusStrategy$CollectionAdapter focusStrategy$CollectionAdapter = SPARSE_VALUES_ADAPTER;
            FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter = NODE_ADAPTER;
            int iT = focusStrategy$CollectionAdapter.t(sparseArrayCompat);
            ArrayList arrayList2 = new ArrayList(iT);
            for (int i13 = 0; i13 < iT; i13++) {
                arrayList2.add(focusStrategy$CollectionAdapter.s(sparseArrayCompat, i13));
            }
            Collections.sort(arrayList2, new b(z5, focusStrategy$BoundsAdapter));
            if (i7 == 1) {
                int size = arrayList2.size();
                if (accessibilityNodeInfoCompat2 != null) {
                    size = arrayList2.indexOf(accessibilityNodeInfoCompat2);
                }
                int i14 = size - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                } else {
                    obj = null;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (accessibilityNodeInfoCompat2 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        } else {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i15 = this.mKeyboardFocusedVirtualViewId;
            if (i15 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i15).g(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.mHost;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i7 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i7 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i7 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            FocusStrategy$CollectionAdapter focusStrategy$CollectionAdapter2 = SPARSE_VALUES_ADAPTER;
            FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter2 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i7 == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i7 == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i7 == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i7 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            int iT2 = focusStrategy$CollectionAdapter2.t(sparseArrayCompat);
            Rect rect4 = new Rect();
            accessibilityNodeInfoCompat = null;
            for (int i16 = 0; i16 < iT2; i16++) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatS = focusStrategy$CollectionAdapter2.s(sparseArrayCompat, i16);
                if (accessibilityNodeInfoCompatS != accessibilityNodeInfoCompat2) {
                    focusStrategy$BoundsAdapter2.i(accessibilityNodeInfoCompatS, rect4);
                    if (q.p(i7, rect2, rect4)) {
                        if (!q.p(i7, rect2, rect3) || q.e(i7, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            accessibilityNodeInfoCompat = accessibilityNodeInfoCompatS;
                        } else if (!q.e(i7, rect2, rect3, rect4)) {
                            int iS = q.s(i7, rect2, rect4);
                            int iT3 = q.t(i7, rect2, rect4);
                            int i17 = (iT3 * iT3) + (iS * 13 * iS);
                            int iS2 = q.s(i7, rect2, rect3);
                            int iT4 = q.t(i7, rect2, rect3);
                            if (i17 < (iT4 * iT4) + (iS2 * 13 * iS2)) {
                                rect3.set(rect4);
                                accessibilityNodeInfoCompat = accessibilityNodeInfoCompatS;
                            }
                        }
                    }
                }
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        if (accessibilityNodeInfoCompat3 == null) {
            iD = Integer.MIN_VALUE;
        } else {
            if (sparseArrayCompat.f1223d) {
                l.a(sparseArrayCompat);
            }
            int i18 = sparseArrayCompat.f1226v;
            for (int i19 = 0; i19 < i18; i19++) {
                if (sparseArrayCompat.f1225i[i19] == accessibilityNodeInfoCompat3) {
                    i12 = i19;
                    break;
                }
            }
            iD = sparseArrayCompat.d(i12);
        }
        return requestKeyboardFocusForVirtualView(iD);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i7) {
        if (this.mKeyboardFocusedVirtualViewId != i7) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i7, false);
        sendEventForVirtualView(i7, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i7;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i10 = this.mHoveredVirtualViewId;
            if (i10 != virtualViewAt) {
                this.mHoveredVirtualViewId = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                sendEventForVirtualView(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            if (virtualViewAt == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i7 = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
                return false;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.mHoveredVirtualViewId = Integer.MIN_VALUE;
                sendEventForVirtualView(Integer.MIN_VALUE, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                sendEventForVirtualView(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i7;
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z5 = false;
                                while (i10 < repeatCount && c(i11, null)) {
                                    i10++;
                                    z5 = true;
                                }
                                return z5;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i7 = this.mKeyboardFocusedVirtualViewId;
                                if (i7 != Integer.MIN_VALUE) {
                                    onPerformActionForVirtualView(i7, 16, null);
                                }
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i7 = this.mKeyboardFocusedVirtualViewId;
                    if (i7 != Integer.MIN_VALUE) {
                        onPerformActionForVirtualView(i7, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return c(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider] */
    @Override // androidx.core.view.b
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new AccessibilityNodeProviderCompat() { // from class: androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider
                @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
                public final AccessibilityNodeInfoCompat a(int i7) {
                    return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.f1790b.obtainAccessibilityNodeInfo(i7).f1613a));
                }

                @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
                public final AccessibilityNodeInfoCompat b(int i7) {
                    a aVar = this.f1790b;
                    int i10 = i7 == 2 ? aVar.mAccessibilityFocusedVirtualViewId : aVar.mKeyboardFocusedVirtualViewId;
                    if (i10 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return a(i10);
                }

                @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
                public final boolean c(int i7, int i10, Bundle bundle) {
                    return this.f1790b.performAction(i7, i10, bundle);
                }
            };
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f2, float f7);

    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i7) {
        invalidateVirtualView(i7, 0);
    }

    @NonNull
    public AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i7) {
        if (i7 != -1) {
            return b(i7);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.mHost);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        View view = this.mHost;
        WeakHashMap weakHashMap = u0.f1729a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            accessibilityNodeInfoCompat.f1613a.addChild(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (z5) {
            c(i7, rect);
        }
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    public abstract boolean onPerformActionForVirtualView(int i7, int i10, Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i7, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void onPopulateNodeForVirtualView(int i7, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void onVirtualViewKeyboardFocusChanged(int i7, boolean z5) {
    }

    public boolean performAction(int i7, int i10, Bundle bundle) {
        int i11;
        if (i7 == -1) {
            View view = this.mHost;
            WeakHashMap weakHashMap = u0.f1729a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return requestKeyboardFocusForVirtualView(i7);
        }
        if (i10 == 2) {
            return clearKeyboardFocusForVirtualView(i7);
        }
        if (i10 != 64) {
            if (i10 != 128) {
                return onPerformActionForVirtualView(i7, i10, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId != i7) {
                return false;
            }
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i7, 65536);
            return true;
        }
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i7) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i11, 65536);
        }
        this.mAccessibilityFocusedVirtualViewId = i7;
        this.mHost.invalidate();
        sendEventForVirtualView(i7, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i7) {
        int i10;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i10 = this.mKeyboardFocusedVirtualViewId) == i7) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i7;
        onVirtualViewKeyboardFocusChanged(i7, true);
        sendEventForVirtualView(i7, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i7, int i10) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i7, i10));
    }

    public final void invalidateVirtualView(int i7, int i10) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventA = a(i7, RecyclerView.ItemAnimator.FLAG_MOVED);
        accessibilityEventA.setContentChangeTypes(i10);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventA);
    }
}
