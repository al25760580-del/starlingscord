package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.android.replay.R;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.w5;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 32\u00020\u0001:\u000534567Bm\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0002J\u000e\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fJ\u001a\u00100\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f02R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b\u0082\u0001\u000389:¨\u0006;"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "", "x", "", "y", "width", "", "height", ViewProps.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getDistance", "()I", "getElevation", "()F", "getHeight", "()Z", "setImportantForContentCapture", "(Z)V", "getParent", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getShouldMask", "getVisibleRect", "()Landroid/graphics/Rect;", "getWidth", "getX", "getY", "findLCA", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "node", "otherNode", "isObscured", "setImportantForCaptureToAncestors", "", "isImportant", "traverse", "callback", "Lkotlin/Function1;", "Companion", "GenericViewHierarchyNode", "ImageViewHierarchyNode", "LCAResult", "TextViewHierarchyNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1855#2,2:392\n*S KotlinDebug\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n*L\n149#1:392,2\n*E\n"})
public abstract class ViewHierarchyNode {

    @NotNull
    private static final String SENTRY_MASK_TAG = "sentry-mask";

    @NotNull
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;
    private final Rect visibleRect;
    private final int width;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "", "", "set", "", "isAssignableFrom", "(Ljava/lang/Class;Ljava/util/Set;)Z", "Landroid/view/View;", "Lio/sentry/w5;", "options", "shouldMask", "(Landroid/view/View;Lio/sentry/w5;)Z", "Landroid/view/ViewParent;", "isUnmaskContainer", "(Landroid/view/ViewParent;Lio/sentry/w5;)Z", "isMaskContainer", "view", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parent", "", "distance", "fromView", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ILio/sentry/w5;)Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "SENTRY_MASK_TAG", "Ljava/lang/String;", "SENTRY_UNMASK_TAG", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, w5 w5Var) {
            String str = w5Var.getSessionReplay().f12053e;
            if (str == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), str);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, w5 w5Var) {
            String str = w5Var.getSessionReplay().f12054f;
            if (str == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), str);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        /* JADX WARN: Code duplicated, block: B:20:0x0044  */
        /* JADX WARN: Code duplicated, block: B:28:0x0067  */
        /* JADX WARN: Code duplicated, block: B:35:0x0083  */
        /* JADX WARN: Code duplicated, block: B:38:0x0099  */
        private final boolean shouldMask(View view, w5 w5Var) {
            String str;
            Class<?> cls;
            CopyOnWriteArraySet copyOnWriteArraySet;
            String lowerCase;
            Object tag = view.getTag();
            String str2 = tag instanceof String ? (String) tag : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null || !StringsKt.D(lowerCase2, ViewHierarchyNode.SENTRY_UNMASK_TAG, false)) {
                    if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "unmask")) {
                        Object tag2 = view.getTag();
                        str = tag2 instanceof String ? (String) tag2 : null;
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null || !StringsKt.D(lowerCase, ViewHierarchyNode.SENTRY_MASK_TAG, false)) {
                            }
                            return true;
                        }
                        if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "mask")) {
                            if (!isMaskContainer(view, w5Var) || view.getParent() == null) {
                                cls = view.getClass();
                                copyOnWriteArraySet = w5Var.getSessionReplay().f12052d;
                                Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                if (!isAssignableFrom(cls, copyOnWriteArraySet)) {
                                    Class<?> cls2 = view.getClass();
                                    CopyOnWriteArraySet copyOnWriteArraySet2 = w5Var.getSessionReplay().f12051c;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                    return isAssignableFrom(cls2, copyOnWriteArraySet2);
                                }
                            } else {
                                ViewParent parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                if (!isUnmaskContainer(parent, w5Var)) {
                                    cls = view.getClass();
                                    copyOnWriteArraySet = w5Var.getSessionReplay().f12052d;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                    if (!isAssignableFrom(cls, copyOnWriteArraySet)) {
                                        Class<?> cls3 = view.getClass();
                                        CopyOnWriteArraySet copyOnWriteArraySet3 = w5Var.getSessionReplay().f12051c;
                                        Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet3, "getMaskViewClasses(...)");
                                        return isAssignableFrom(cls3, copyOnWriteArraySet3);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            } else if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "unmask")) {
                Object tag3 = view.getTag();
                if (tag3 instanceof String) {
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                    }
                }
                if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "mask")) {
                    if (isMaskContainer(view, w5Var)) {
                        cls = view.getClass();
                        copyOnWriteArraySet = w5Var.getSessionReplay().f12052d;
                        Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                        if (!isAssignableFrom(cls, copyOnWriteArraySet)) {
                            Class<?> cls4 = view.getClass();
                            CopyOnWriteArraySet copyOnWriteArraySet4 = w5Var.getSessionReplay().f12051c;
                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet4, "getMaskViewClasses(...)");
                            return isAssignableFrom(cls4, copyOnWriteArraySet4);
                        }
                    } else {
                        cls = view.getClass();
                        copyOnWriteArraySet = w5Var.getSessionReplay().f12052d;
                        Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                        if (!isAssignableFrom(cls, copyOnWriteArraySet)) {
                            Class<?> cls5 = view.getClass();
                            CopyOnWriteArraySet copyOnWriteArraySet5 = w5Var.getSessionReplay().f12051c;
                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet5, "getMaskViewClasses(...)");
                            return isAssignableFrom(cls5, copyOnWriteArraySet5);
                        }
                    }
                }
                return true;
            }
            return false;
        }

        @NotNull
        public final ViewHierarchyNode fromView(@NotNull View view, ViewHierarchyNode parent, int distance, @NotNull w5 options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = ((Boolean) pairIsVisibleToUser.f14612d).booleanValue();
            Rect rect = (Rect) pairIsVisibleToUser.f14613e;
            boolean z5 = zBooleanValue && shouldMask(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z5, false, zBooleanValue, rect);
                }
                if (parent != null) {
                    parent.setImportantForCaptureToAncestors(true);
                }
                ImageView imageView = (ImageView) view;
                return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (parent != null ? parent.getElevation() : 0.0f), distance, parent, z5 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rect);
            }
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            AndroidTextLayout androidTextLayout = layout != null ? new AndroidTextLayout(layout) : null;
            int opaque = ViewsKt.toOpaque(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTopSafe = ViewsKt.getTotalPaddingTopSafe(textView);
            float x5 = textView.getX();
            float y5 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (parent != null) {
                elevation = parent.getElevation();
            }
            return new TextViewHierarchyNode(androidTextLayout, Integer.valueOf(opaque), totalPaddingLeft, totalPaddingTopSafe, x5, y5, width, height, elevation + textView.getElevation(), distance, parent, z5, true, zBooleanValue, rect);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", ViewProps.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ GenericViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, f7, i7, i10, f10, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z6, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z7, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect) {
            super(f2, f7, i7, i10, f10, i11, viewHierarchyNode, z5, z6, z7, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", ViewProps.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ ImageViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, f7, i7, i10, f10, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z6, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z7, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect) {
            super(f2, f7, i7, i10, f10, i11, viewHierarchyNode, z5, z6, z7, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "", "lca", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "nodeSubtree", "otherNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getLca", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getNodeSubtree", "setNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getOtherNodeSubtree", "setOtherNodeSubtree", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LCAResult {
        private final ViewHierarchyNode lca;
        private ViewHierarchyNode nodeSubtree;
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i7 & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i7 & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        @NotNull
        public final LCAResult copy(ViewHierarchyNode lca, ViewHierarchyNode nodeSubtree, ViewHierarchyNode otherNodeSubtree) {
            return new LCAResult(lca, nodeSubtree, otherNodeSubtree);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) other;
            return Intrinsics.areEqual(this.lca, lCAResult.lca) && Intrinsics.areEqual(this.nodeSubtree, lCAResult.nodeSubtree) && Intrinsics.areEqual(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        @NotNull
        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "layout", "Lio/sentry/android/replay/util/TextLayout;", "dominantColor", "", ViewProps.PADDING_LEFT, ViewProps.PADDING_TOP, "x", "", "y", "width", "height", ViewProps.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(Lio/sentry/android/replay/util/TextLayout;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "getDominantColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Lio/sentry/android/replay/util/TextLayout;", "getPaddingLeft", "()I", "getPaddingTop", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;
        private final Integer dominantColor;
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i7, int i10, float f2, float f7, int i11, int i12, float f10, int i13, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : textLayout, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? 0 : i7, (i14 & 8) != 0 ? 0 : i10, f2, f7, i11, i12, f10, i13, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : viewHierarchyNode, (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? false : z5, (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z6, (i14 & 8192) != 0 ? false : z7, (i14 & 16384) != 0 ? null : rect);
        }

        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public TextViewHierarchyNode(TextLayout textLayout, Integer num, int i7, int i10, float f2, float f7, int i11, int i12, float f10, int i13, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect) {
            super(f2, f7, i11, i12, f10, i13, viewHierarchyNode, z5, z6, z7, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i7;
            this.paddingTop = i10;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f7, i7, i10, f10, i11, viewHierarchyNode, z5, z6, z7, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode node, ViewHierarchyNode otherNode) {
        ViewHierarchyNode viewHierarchyNode = null;
        ViewHierarchyNode viewHierarchyNode2 = Intrinsics.areEqual(this, node) ? this : null;
        ViewHierarchyNode viewHierarchyNode3 = Intrinsics.areEqual(this, otherNode) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            for (ViewHierarchyNode viewHierarchyNode4 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode4.findLCA(node, otherNode);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode2 = viewHierarchyNode4;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode3 = viewHierarchyNode4;
                }
            }
        }
        if (viewHierarchyNode2 != null && viewHierarchyNode3 != null) {
            viewHierarchyNode = this;
        }
        return new LCAResult(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
    }

    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: isImportantForContentCapture, reason: from getter */
    public final boolean getIsImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(@NotNull final ViewHierarchyNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
        }
        if (node.visibleRect == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.isObscured.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ViewHierarchyNode otherNode) {
                Intrinsics.checkNotNullParameter(otherNode, "otherNode");
                if (otherNode.getVisibleRect() == null || booleanRef.element) {
                    return Boolean.FALSE;
                }
                if (!otherNode.getIsVisible() || !otherNode.getIsImportantForContentCapture() || !otherNode.getVisibleRect().contains(node.getVisibleRect())) {
                    return Boolean.FALSE;
                }
                if (otherNode.getElevation() > node.getElevation()) {
                    booleanRef.element = true;
                    return Boolean.FALSE;
                }
                if (otherNode.getElevation() == node.getElevation()) {
                    LCAResult lCAResultFindLCA = this.findLCA(node, otherNode);
                    ViewHierarchyNode lca = lCAResultFindLCA.getLca();
                    ViewHierarchyNode nodeSubtree = lCAResultFindLCA.getNodeSubtree();
                    ViewHierarchyNode otherNodeSubtree = lCAResultFindLCA.getOtherNodeSubtree();
                    if (!Intrinsics.areEqual(lca, otherNode) && otherNodeSubtree != null && nodeSubtree != null) {
                        booleanRef.element = otherNodeSubtree.getDistance() > nodeSubtree.getDistance();
                        return Boolean.valueOf(!booleanRef.element);
                    }
                }
                return Boolean.TRUE;
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setChildren(List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean isImportant) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = isImportant;
        }
    }

    public final void setImportantForContentCapture(boolean z5) {
        this.isImportantForContentCapture = z5;
    }

    public final void traverse(@NotNull Function1<? super ViewHierarchyNode, Boolean> callback) {
        List<? extends ViewHierarchyNode> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.children) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }

    private ViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect) {
        this.x = f2;
        this.y = f7;
        this.width = i7;
        this.height = i10;
        this.elevation = f10;
        this.distance = i11;
        this.parent = viewHierarchyNode;
        this.shouldMask = z5;
        this.isImportantForContentCapture = z6;
        this.isVisible = z7;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f2, float f7, int i7, int i10, float f10, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z6, boolean z7, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f7, i7, i10, f10, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z6, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z7, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : rect, null);
    }
}
