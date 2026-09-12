package com.discord.fastest_list.react;

import android.graphics.RectF;
import com.discord.fastest_list.android.FastestListView;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import f0.e;
import java.util.HashMap;
import java.util.Map;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/fastest_list/react/FastestListShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "<init>", "()V", "isDirty", "", "nextUpdateNeedsMeasureAndLayout", ViewProps.PADDING, "Landroid/graphics/RectF;", "paddingPrev", "setReactTag", "", "reactTag", "", "setPadding", "spacingType", "", "setDefaultPadding", "setPaddingPercent", "", "percent", "flushChanges", "view", "Lcom/discord/fastest_list/android/FastestListView;", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListShadowNode extends LayoutShadowNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Integer, FastestListShadowNode> activeShadowNodes = new HashMap();
    private boolean isDirty;
    private boolean nextUpdateNeedsMeasureAndLayout;

    @NotNull
    private RectF padding = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    @NotNull
    private RectF paddingPrev = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\b\u001a\u00020\t*\u00020\nJ\n\u0010\u000b\u001a\u00020\t*\u00020\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/fastest_list/react/FastestListShadowNode$Companion;", "", "<init>", "()V", "activeShadowNodes", "", "", "Lcom/discord/fastest_list/react/FastestListShadowNode;", "updateFromShadowNode", "", "Lcom/discord/fastest_list/android/FastestListView;", "dropShadowNode", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dropShadowNode(@NotNull FastestListView fastestListView) {
            Intrinsics.checkNotNullParameter(fastestListView, "<this>");
            FastestListShadowNode.activeShadowNodes.remove(Integer.valueOf(fastestListView.getId()));
        }

        public final void updateFromShadowNode(@NotNull FastestListView fastestListView) {
            Intrinsics.checkNotNullParameter(fastestListView, "<this>");
            FastestListShadowNode fastestListShadowNode = (FastestListShadowNode) FastestListShadowNode.activeShadowNodes.get(Integer.valueOf(fastestListView.getId()));
            if (fastestListShadowNode != null) {
                fastestListShadowNode.flushChanges(fastestListView);
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.c(9).length];
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushChanges(FastestListView view) {
        if (this.isDirty) {
            RectF rectF = this.padding;
            view.setPadding((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.nextUpdateNeedsMeasureAndLayout) {
                ViewMeasureExtensionsKt.measureAndLayout(view);
            } else {
                this.nextUpdateNeedsMeasureAndLayout = true;
            }
            this.isDirty = false;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int spacingType, float padding) {
        throw new IllegalStateException("FastestListShadowNode does not support default padding".toString());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int spacingType, float padding) {
        super.setPadding(spacingType, padding);
        switch (WhenMappings.$EnumSwitchMapping$0[e.b(b.a(spacingType))]) {
            case -1:
                throw new IllegalStateException(("Unknown spacing type " + spacingType).toString());
            case 0:
            default:
                throw new n();
            case 1:
                RectF rectF = this.padding;
                rectF.left = padding;
                rectF.right = padding;
                break;
            case 2:
                RectF rectF2 = this.padding;
                rectF2.top = padding;
                rectF2.bottom = padding;
                break;
            case 3:
                this.padding.set(padding, padding, padding, padding);
                break;
            case 4:
                this.padding.left = padding;
                break;
            case 5:
                this.padding.top = padding;
                break;
            case 6:
                this.padding.right = padding;
                break;
            case 7:
                this.padding.bottom = padding;
                break;
            case 8:
                this.padding.left = padding;
                break;
            case 9:
                this.padding.right = padding;
                break;
        }
        if (Intrinsics.areEqual(this.paddingPrev, this.padding)) {
            return;
        }
        this.paddingPrev.set(this.padding);
        this.isDirty = true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int reactTag) {
        super.setReactTag(reactTag);
        activeShadowNodes.put(Integer.valueOf(reactTag), this);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @NotNull
    /* JADX INFO: renamed from: setPaddingPercent, reason: merged with bridge method [inline-methods] */
    public Void mo979setPaddingPercent(int spacingType, float percent) {
        throw new IllegalStateException("FastestListShadowNode does not support percentage based padding".toString());
    }
}
