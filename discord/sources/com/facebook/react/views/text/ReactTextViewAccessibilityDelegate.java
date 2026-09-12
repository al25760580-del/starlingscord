package com.facebook.react.views.text;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.u0;
import com.facebook.react.R;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import tn.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 22\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0014J\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J5\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u000e\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u001e\u0018\u00010\"H\u0004¢\u0006\u0002\u0010#J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0018\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010+\u001a\u00020)H\u0014J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010'\u001a\u00020\u0003H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;", "view", "Landroid/view/View;", "originalFocus", "", "originalImportantForAccessibility", "", "<init>", "(Landroid/view/View;ZI)V", "accessibilityLinks", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;", "onVirtualViewKeyboardFocusChanged", "", "virtualViewId", "hasFocus", "onPerformActionForVirtualView", "action", "arguments", "Landroid/os/Bundle;", "getVisibleVirtualViews", "virtualViewIds", "", "getVirtualViewAt", "x", "", "y", "getLayoutFromHost", "Landroid/text/Layout;", "getFirstSpan", "T", ViewProps.START, ViewProps.END, "classType", "Ljava/lang/Class;", "(IILjava/lang/Class;)Ljava/lang/Object;", "getSpannedFromHost", "Landroid/text/Spanned;", "onInitializeAccessibilityNodeInfo", "host", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "onPopulateNodeForVirtualView", "node", "getBoundsInParent", "Landroid/graphics/Rect;", "accessibleLink", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", "getAccessibilityNodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "Companion", "AccessibilityLinks", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextViewAccessibilityDelegate extends ReactAccessibilityDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private AccessibilityLinks accessibilityLinks;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;", "", "text", "Landroid/text/Spanned;", "<init>", "(Landroid/text/Spanned;)V", "links", "", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", "getLinkById", StackTraceHelper.ID_KEY, "", "getLinkBySpanPos", ViewProps.START, ViewProps.END, "size", "AccessibleLink", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactTextViewAccessibilityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactTextViewAccessibilityDelegate.kt\ncom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,367:1\n6181#2,2:368\n*S KotlinDebug\n*F\n+ 1 ReactTextViewAccessibilityDelegate.kt\ncom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks\n*L\n303#1:368,2\n*E\n"})
    public static final class AccessibilityLinks {

        @NotNull
        private final List<AccessibleLink> links;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", "", "<init>", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", ViewProps.START, "", "getStart", "()I", "setStart", "(I)V", ViewProps.END, "getEnd", "setEnd", StackTraceHelper.ID_KEY, "getId", "setId", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AccessibleLink {
            private String description;
            private int end;
            private int id;
            private int start;

            public final String getDescription() {
                return this.description;
            }

            public final int getEnd() {
                return this.end;
            }

            public final int getId() {
                return this.id;
            }

            public final int getStart() {
                return this.start;
            }

            public final void setDescription(String str) {
                this.description = str;
            }

            public final void setEnd(int i7) {
                this.end = i7;
            }

            public final void setId(int i7) {
                this.id = i7;
            }

            public final void setStart(int i7) {
                this.start = i7;
            }
        }

        public AccessibilityLinks(@NotNull final Spanned text) {
            Intrinsics.checkNotNullParameter(text, "text");
            ArrayList arrayList = new ArrayList();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) text.getSpans(0, text.length(), ClickableSpan.class);
            Intrinsics.checkNotNull(clickableSpanArr);
            if (!ReactTextViewAccessibilityDelegateKt.isWholeTextSingleLink(text, clickableSpanArr)) {
                if (clickableSpanArr.length > 1) {
                    w.n(clickableSpanArr, new Comparator() { // from class: com.facebook.react.views.text.ReactTextViewAccessibilityDelegate$AccessibilityLinks$special$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t5, T t10) {
                            return a.a(Integer.valueOf(text.getSpanStart((ClickableSpan) t5)), Integer.valueOf(text.getSpanStart((ClickableSpan) t10)));
                        }
                    });
                }
                int length = clickableSpanArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i7];
                    int spanStart = text.getSpanStart(clickableSpan);
                    int spanEnd = text.getSpanEnd(clickableSpan);
                    if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= text.length() && spanEnd <= text.length()) {
                        AccessibleLink accessibleLink = new AccessibleLink();
                        accessibleLink.setDescription(text.subSequence(spanStart, spanEnd).toString());
                        accessibleLink.setStart(spanStart);
                        accessibleLink.setEnd(spanEnd);
                        accessibleLink.setId(i7);
                        arrayList.add(accessibleLink);
                    }
                }
            }
            this.links = arrayList;
        }

        public final AccessibleLink getLinkById(int id2) {
            for (AccessibleLink accessibleLink : this.links) {
                if (accessibleLink.getId() == id2) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public final AccessibleLink getLinkBySpanPos(int start, int end) {
            for (AccessibleLink accessibleLink : this.links) {
                if (accessibleLink.getStart() == start && accessibleLink.getEnd() == end) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public final int size() {
            return this.links.size();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;", "", "<init>", "()V", "setDelegate", "", "view", "Landroid/view/View;", "originalFocus", "", "originalImportantForAccessibility", "", "resetDelegate", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            u0.p(view, new ReactTextViewAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        public final void setDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (u0.f(view) != null) {
                return;
            }
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
                return;
            }
            u0.p(view, new ReactTextViewAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextViewAccessibilityDelegate(@NotNull View view, boolean z5, int i7) {
        super(view, z5, i7);
        Intrinsics.checkNotNullParameter(view, "view");
        this.accessibilityLinks = (AccessibilityLinks) getHostView().getTag(R.id.accessibility_links);
    }

    private final Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        if (!(getHostView() instanceof TextView) && !(getHostView() instanceof PreparedLayoutTextView)) {
            return new Rect(0, 0, getHostView().getWidth(), getHostView().getHeight());
        }
        Layout layoutFromHost = getLayoutFromHost();
        if (layoutFromHost == null) {
            return new Rect(0, 0, getHostView().getWidth(), getHostView().getHeight());
        }
        int start = accessibleLink.getStart();
        int end = accessibleLink.getEnd();
        int lineForOffset = layoutFromHost.getLineForOffset(start);
        int lineEnd = layoutFromHost.getLineEnd(lineForOffset);
        int lineForOffset2 = layoutFromHost.getLineForOffset(end);
        int lineEnd2 = layoutFromHost.getLineEnd(lineForOffset2);
        if (start > lineEnd || end > lineEnd2) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layoutFromHost.getPrimaryHorizontal(start);
        boolean z5 = lineForOffset != lineForOffset2;
        layoutFromHost.getLineBounds(lineForOffset, rect);
        int paddingTop = getHostView().getPaddingTop() + getHostView().getScrollY();
        rect.top += paddingTop;
        rect.bottom += paddingTop;
        rect.left = (int) (((primaryHorizontal + ((double) getHostView().getPaddingLeft())) - ((double) getHostView().getScrollX())) + ((double) rect.left));
        if (z5) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        return new Rect(rect.left, rect.top, (int) layoutFromHost.getPrimaryHorizontal(end), rect.bottom);
    }

    private final Layout getLayoutFromHost() {
        if (getHostView() instanceof PreparedLayoutTextView) {
            View hostView = getHostView();
            Intrinsics.checkNotNull(hostView, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
            PreparedLayout preparedLayout = ((PreparedLayoutTextView) hostView).getPreparedLayout();
            if (preparedLayout != null) {
                return preparedLayout.getLayout();
            }
            return null;
        }
        if (getHostView() instanceof ReactTextView) {
            View hostView2 = getHostView();
            Intrinsics.checkNotNull(hostView2, "null cannot be cast to non-null type com.facebook.react.views.text.ReactTextView");
            if (((ReactTextView) hostView2).getPreparedLayout() != null) {
                View hostView3 = getHostView();
                Intrinsics.checkNotNull(hostView3, "null cannot be cast to non-null type com.facebook.react.views.text.ReactTextView");
                PreparedLayout preparedLayout2 = ((ReactTextView) hostView3).getPreparedLayout();
                if (preparedLayout2 != null) {
                    return preparedLayout2.getLayout();
                }
                return null;
            }
        }
        if (!(getHostView() instanceof TextView)) {
            return null;
        }
        View hostView4 = getHostView();
        Intrinsics.checkNotNull(hostView4, "null cannot be cast to non-null type android.widget.TextView");
        return ((TextView) hostView4).getLayout();
    }

    private final Spanned getSpannedFromHost() {
        Layout layout;
        Layout layout2;
        View hostView = getHostView();
        if (hostView instanceof PreparedLayoutTextView) {
            PreparedLayout preparedLayout = ((PreparedLayoutTextView) hostView).getPreparedLayout();
            CharSequence text = (preparedLayout == null || (layout2 = preparedLayout.getLayout()) == null) ? null : layout2.getText();
            if (text instanceof Spanned) {
                return (Spanned) text;
            }
            return null;
        }
        if (hostView instanceof ReactTextView) {
            ReactTextView reactTextView = (ReactTextView) hostView;
            if (reactTextView.getPreparedLayout() != null) {
                PreparedLayout preparedLayout2 = reactTextView.getPreparedLayout();
                CharSequence text2 = (preparedLayout2 == null || (layout = preparedLayout2.getLayout()) == null) ? null : layout.getText();
                if (text2 instanceof Spanned) {
                    return (Spanned) text2;
                }
                return null;
            }
        }
        if (hostView instanceof TextView) {
            CharSequence text3 = ((TextView) hostView).getText();
            if (text3 instanceof Spanned) {
                return (Spanned) text3;
            }
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a, androidx.core.view.b
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (this.accessibilityLinks != null) {
            return superGetAccessibilityNodeProvider(host);
        }
        return null;
    }

    public final <T> T getFirstSpan(int start, int end, Class<T> classType) {
        Spanned spannedFromHost = getSpannedFromHost();
        if (spannedFromHost == null) {
            return null;
        }
        Object[] spans = spannedFromHost.getSpans(start, end, classType);
        Intrinsics.checkNotNull(spans);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[0];
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    public int getVirtualViewAt(float x5, float y5) {
        Spanned spannedFromHost;
        AccessibilityLinks.AccessibleLink linkBySpanPos;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks != null && accessibilityLinks.size() != 0 && ((getHostView() instanceof TextView) || (getHostView() instanceof PreparedLayoutTextView))) {
            float paddingLeft = x5 - getHostView().getPaddingLeft();
            float paddingTop = y5 - getHostView().getPaddingTop();
            float scrollX = paddingLeft + getHostView().getScrollX();
            float scrollY = paddingTop + getHostView().getScrollY();
            Layout layoutFromHost = getLayoutFromHost();
            if (layoutFromHost == null) {
                return Integer.MIN_VALUE;
            }
            int offsetForHorizontal = layoutFromHost.getOffsetForHorizontal(layoutFromHost.getLineForVertical((int) scrollY), scrollX);
            ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpan != null && (spannedFromHost = getSpannedFromHost()) != null && (linkBySpanPos = accessibilityLinks.getLinkBySpanPos(spannedFromHost.getSpanStart(clickableSpan), spannedFromHost.getSpanEnd(clickableSpan))) != null) {
                return linkBySpanPos.getId();
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    public void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null) {
            return;
        }
        int size = accessibilityLinks.size();
        for (int i7 = 0; i7 < size; i7++) {
            virtualViewIds.add(Integer.valueOf(i7));
        }
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a, androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host instanceof PreparedLayoutTextView) {
            info.A(((PreparedLayoutTextView) host).getText());
        }
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
        AccessibilityLinks.AccessibleLink linkById;
        ClickableSpan clickableSpan;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks == null || (linkById = accessibilityLinks.getLinkById(virtualViewId)) == null || (clickableSpan = (ClickableSpan) getFirstSpan(linkById.getStart(), linkById.getEnd(), ClickableSpan.class)) == null || action != 16) {
            return false;
        }
        clickableSpan.onClick(getHostView());
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null) {
            node.s("");
            node.m(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(virtualViewId);
        if (linkById == null) {
            node.s("");
            node.m(new Rect(0, 0, 1, 1));
            return;
        }
        Rect boundsInParent = getBoundsInParent(linkById);
        if (boundsInParent == null) {
            node.s("");
            node.m(new Rect(0, 0, 1, 1));
            return;
        }
        node.s(linkById.getDescription());
        node.a(16);
        node.m(boundsInParent);
        node.p(true);
        node.w(getHostView().getResources().getString(R.string.link_description));
        node.o(ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.getValue(ReactAccessibilityDelegate.AccessibilityRole.BUTTON));
    }

    @Override // androidx.customview.widget.a
    public void onVirtualViewKeyboardFocusChanged(int virtualViewId, boolean hasFocus) {
        AccessibilityLinks.AccessibleLink linkById;
        ClickableSpan clickableSpan;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks == null || (linkById = accessibilityLinks.getLinkById(virtualViewId)) == null || (clickableSpan = (ClickableSpan) getFirstSpan(linkById.getStart(), linkById.getEnd(), ClickableSpan.class)) == null) {
            return;
        }
        if ((clickableSpan instanceof ReactClickableSpan) && (getHostView() instanceof TextView)) {
            ReactClickableSpan reactClickableSpan = (ReactClickableSpan) clickableSpan;
            reactClickableSpan.setKeyboardFocused(hasFocus);
            View hostView = getHostView();
            Intrinsics.checkNotNull(hostView, "null cannot be cast to non-null type android.widget.TextView");
            reactClickableSpan.setFocusBgColor(((TextView) hostView).getHighlightColor());
            getHostView().invalidate();
            return;
        }
        if (getHostView() instanceof PreparedLayoutTextView) {
            if (hasFocus) {
                View hostView2 = getHostView();
                Intrinsics.checkNotNull(hostView2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) hostView2).setSelection(linkById.getStart(), linkById.getEnd());
            } else {
                View hostView3 = getHostView();
                Intrinsics.checkNotNull(hostView3, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) hostView3).clearSelection();
            }
        }
    }
}
