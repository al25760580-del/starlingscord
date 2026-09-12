package com.facebook.react.views.text.internal.span;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "height", "", "<init>", "(F)V", ViewProps.LINE_HEIGHT, "", "getLineHeight", "()I", "chooseHeight", "", "text", "", ViewProps.START, ViewProps.END, "spanstartv", "v", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomLineHeightSpan implements LineHeightSpan, ReactSpan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static Callback chooseHeightOverride;
    private final int lineHeight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan$Companion;", "", "<init>", "()V", "chooseHeightOverride", "Lcom/facebook/react/bridge/Callback;", "getChooseHeightOverride", "()Lcom/facebook/react/bridge/Callback;", "setChooseHeightOverride", "(Lcom/facebook/react/bridge/Callback;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Callback getChooseHeightOverride() {
            return CustomLineHeightSpan.chooseHeightOverride;
        }

        public final void setChooseHeightOverride(Callback callback) {
            CustomLineHeightSpan.chooseHeightOverride = callback;
        }

        private Companion() {
        }
    }

    public CustomLineHeightSpan(float f2) {
        this.lineHeight = (int) Math.ceil(f2);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartv, int v6, @NotNull Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Callback callback = chooseHeightOverride;
        if (callback != null) {
            callback.invoke(fm2, Integer.valueOf(this.lineHeight));
            return;
        }
        int i7 = this.lineHeight;
        int i10 = fm2.ascent;
        double d6 = (i7 - ((-i10) + fm2.descent)) / 2.0f;
        fm2.ascent = i10 - ((int) Math.ceil(d6));
        fm2.descent += (int) Math.floor(d6);
        if (start == 0) {
            fm2.top = fm2.ascent;
        }
        if (end == text.length()) {
            fm2.bottom = fm2.descent;
        }
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}
