package com.facebook.react.views.text;

import a3.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.core.view.u0;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.DrawCommandSpan;
import com.facebook.react.views.text.internal.span.ReactFragmentIndexSpan;
import com.facebook.react.views.text.internal.span.ReactLinkSpan;
import com.facebook.react.views.text.internal.span.StrokeStyleSpan;
import ho.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0003LMNB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0014J0\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001aH\u0014J\u0016\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aJ\u0006\u00103\u001a\u00020%J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0016J3\u00107\u001a\u0004\u0018\u0001H8\"\u0004\b\u0000\u001082\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H80<H\u0002¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001aH\u0002J\u0010\u0010?\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0016J\"\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020\u001a2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010E\u001a\u00020+2\u0006\u00105\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020+H\u0016J\u0018\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020JH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006O"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ReactCompoundView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "clickableSpans", "", "Landroid/text/style/ClickableSpan;", "selection", "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "value", "Lcom/facebook/react/views/text/PreparedLayout;", "preparedLayout", "getPreparedLayout", "()Lcom/facebook/react/views/text/PreparedLayout;", "setPreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;)V", "Lcom/facebook/react/uimanager/style/Overflow;", ViewProps.OVERFLOW, "getOverflow", "()Lcom/facebook/react/uimanager/style/Overflow;", "setOverflow", "(Lcom/facebook/react/uimanager/style/Overflow;)V", "selectionColor", "", "getSelectionColor", "()Ljava/lang/Integer;", "setSelectionColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "text", "", "getText", "()Ljava/lang/CharSequence;", "recycleView", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", "b", "setSelection", ViewProps.START, ViewProps.END, "clearSelection", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "getSpanInCoords", "T", "x", "y", "clazz", "Ljava/lang/Class;", "(IILjava/lang/Class;)Ljava/lang/Object;", "getTextOffsetAt", "dispatchHoverEvent", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "hasOverlappingRendering", "reactTagForTouch", "touchX", "", "touchY", "Api34Utils", "TextSelection", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreparedLayoutTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreparedLayoutTextView.kt\ncom/facebook/react/views/text/PreparedLayoutTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
public final class PreparedLayoutTextView extends ViewGroup implements ReactCompoundView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Paint selectionPaint = new Paint();

    @NotNull
    private List<? extends ClickableSpan> clickableSpans;

    @NotNull
    private Overflow overflow;
    private PreparedLayout preparedLayout;
    private TextSelection selection;
    private Integer selectionColor;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;", "", "<init>", "()V", "highlightPaths", "", "Landroid/graphics/Path;", "highlightPaints", "Landroid/graphics/Paint;", "draw", "", "layout", "Landroid/text/Layout;", "canvas", "Landroid/graphics/Canvas;", "selectionPath", "selectionPaint", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api34Utils {

        @NotNull
        public static final Api34Utils INSTANCE = new Api34Utils();
        private static List<? extends Paint> highlightPaints;
        private static List<? extends Path> highlightPaths;

        private Api34Utils() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void draw(@NotNull Layout layout, @NotNull Canvas canvas, Path selectionPath, Paint selectionPaint) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (selectionPath != null) {
                if (highlightPaths == null) {
                    highlightPaths = new ArrayList();
                }
                if (highlightPaints == null) {
                    highlightPaints = new ArrayList();
                }
            }
            layout.draw(canvas, highlightPaths, highlightPaints, selectionPath, selectionPaint, 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;", "", "<init>", "()V", "selectionPaint", "Landroid/graphics/Paint;", "filterClickableSpans", "", "Landroid/text/style/ClickableSpan;", "text", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ClickableSpan> filterClickableSpans(CharSequence text) {
            if (!(text instanceof Spanned)) {
                return n0.f14659d;
            }
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < text.length()) {
                Spanned spanned = (Spanned) text;
                int iNextSpanTransition = spanned.nextSpanTransition(i7, text.length(), ClickableSpan.class);
                Object[] spans = spanned.getSpans(i7, iNextSpanTransition, ClickableSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                i0.q(arrayList, spans);
                i7 = iNextSpanTransition;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "", ViewProps.START, "", ViewProps.END, "path", "Landroid/graphics/Path;", "<init>", "(IILandroid/graphics/Path;)V", "getStart", "()I", "setStart", "(I)V", "getEnd", "setEnd", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextSelection {
        private int end;

        @NotNull
        private Path path;
        private int start;

        public TextSelection(int i7, int i10, @NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.start = i7;
            this.end = i10;
            this.path = path;
        }

        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final int getStart() {
            return this.start;
        }

        public final void setEnd(int i7) {
            this.end = i7;
        }

        public final void setPath(@NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "<set-?>");
            this.path = path;
        }

        public final void setStart(int i7) {
            this.start = i7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedLayoutTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickableSpans = n0.f14659d;
        this.overflow = Overflow.VISIBLE;
        setWillNotDraw(false);
    }

    private final <T> T getSpanInCoords(int x5, int y5, Class<T> clazz) {
        int textOffsetAt = getTextOffsetAt(x5, y5);
        if (textOffsetAt < 0) {
            return null;
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return null;
        }
        Object[] spans = spanned.getSpans(textOffsetAt, textOffsetAt, clazz);
        Intrinsics.checkNotNull(spans);
        if (spans.length == 0) {
            return null;
        }
        if (spans.length > 2) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = ArrayIteratorKt.iterator(spans);
        while (it.hasNext()) {
            T t5 = (T) it.next();
            int spanFlags = spanned.getSpanFlags(t5);
            int i7 = spanFlags & 18;
            int spanStart = (i7 == 0 && (spanFlags & 17) == 0) ? spanned.getSpanStart(t5) + 1 : spanned.getSpanStart(t5);
            int spanEnd = (i7 == 0 && (spanFlags & 34) == 0) ? spanned.getSpanEnd(t5) - 1 : spanned.getSpanEnd(t5);
            if (textOffsetAt >= spanStart && textOffsetAt <= spanEnd) {
                return t5;
            }
        }
        return null;
    }

    private final int getTextOffsetAt(int x5, int y5) {
        Layout layout;
        float paragraphRight;
        float lineLeft;
        int paddingLeft = x5 - getPaddingLeft();
        int paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        int iB = y5 - (paddingTop + (preparedLayout != null ? c.b(preparedLayout.getVerticalOffset()) : 0));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        if (preparedLayout2 != null && (layout = preparedLayout2.getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(iB);
            if (layout.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                lineLeft = layout.getLineLeft(lineForVertical);
                paragraphRight = layout.getLineRight(lineForVertical);
            } else {
                boolean z5 = layout.getParagraphDirection(lineForVertical) == -1;
                float width = z5 ? layout.getWidth() - layout.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
                paragraphRight = z5 ? layout.getParagraphRight(lineForVertical) : layout.getLineMax(lineForVertical);
                lineLeft = width;
            }
            float f2 = paddingLeft;
            if (f2 >= lineLeft && f2 <= paragraphRight) {
                try {
                    return layout.getOffsetForHorizontal(lineForVertical, f2);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDraw$lambda$1(Layout layout, Canvas canvas, PreparedLayoutTextView preparedLayoutTextView) {
        if (Build.VERSION.SDK_INT < 34) {
            TextSelection textSelection = preparedLayoutTextView.selection;
            layout.draw(canvas, textSelection != null ? textSelection.getPath() : null, selectionPaint, 0);
        } else {
            Api34Utils api34Utils = Api34Utils.INSTANCE;
            TextSelection textSelection2 = preparedLayoutTextView.selection;
            api34Utils.draw(layout, canvas, textSelection2 != null ? textSelection2.getPath() : null, selectionPaint);
        }
    }

    public final void clearSelection() {
        this.selection = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVarE = u0.e(this);
        return ((bVarE instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) bVarE).dispatchKeyEvent(event)) || super.dispatchKeyEvent(event);
    }

    @NotNull
    public final Overflow getOverflow() {
        return this.overflow;
    }

    public final PreparedLayout getPreparedLayout() {
        return this.preparedLayout;
    }

    public final Integer getSelectionColor() {
        return this.selectionColor;
    }

    @a
    public final CharSequence getText() {
        Layout layout;
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        DrawCommandSpan[] drawCommandSpanArr;
        int defaultTextColorHighlight;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.overflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        canvas.translate(paddingLeft, paddingTop + (preparedLayout != null ? preparedLayout.getVerticalOffset() : 0.0f));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        Layout layout = preparedLayout2 != null ? preparedLayout2.getLayout() : null;
        if (layout != null) {
            if (this.selection != null) {
                Paint paint = selectionPaint;
                Integer num = this.selectionColor;
                if (num != null) {
                    defaultTextColorHighlight = num.intValue();
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
                }
                paint.setColor(defaultTextColorHighlight);
            }
            CharSequence text = getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned == null || (drawCommandSpanArr = (DrawCommandSpan[]) spanned.getSpans(0, spanned.length(), DrawCommandSpan.class)) == null) {
                drawCommandSpanArr = new DrawCommandSpan[0];
            }
            if (spanned != null) {
                for (DrawCommandSpan drawCommandSpan : drawCommandSpanArr) {
                    drawCommandSpan.onPreDraw(spanned.getSpanStart(drawCommandSpan), spanned.getSpanEnd(drawCommandSpan), canvas, layout);
                }
            }
            ac.a aVar = new ac.a(layout, canvas, this, 12);
            StrokeStyleSpan.Companion companion = StrokeStyleSpan.INSTANCE;
            CharSequence text2 = layout.getText();
            StrokeStyleSpan strokeSpan = companion.getStrokeSpan(text2 instanceof Spanned ? (Spanned) text2 : null);
            if (strokeSpan != null) {
                TextPaint paint2 = layout.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
                if (!strokeSpan.draw(paint2, aVar)) {
                    aVar.run();
                }
            } else {
                aVar.run();
            }
            if (spanned != null) {
                for (DrawCommandSpan drawCommandSpan2 : drawCommandSpanArr) {
                    drawCommandSpan2.onDraw(spanned.getSpanStart(drawCommandSpan2), spanned.getSpanEnd(drawCommandSpan2), canvas, layout);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        if (!this.clickableSpans.isEmpty() && !gainFocus) {
            clearSelection();
        }
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        b bVarE = u0.e(this);
        if (bVarE == null || !(bVarE instanceof ReactTextViewAccessibilityDelegate)) {
            return;
        }
        ((ReactTextViewAccessibilityDelegate) bVarE).onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t5, int r5, int b10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled() || this.clickableSpans.isEmpty()) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 3) {
            clearSelection();
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) getSpanInCoords((int) event.getX(), (int) event.getY(), ClickableSpan.class);
        if (clickableSpan == null) {
            clearSelection();
            return super.onTouchEvent(event);
        }
        if (actionMasked == 1) {
            clearSelection();
            if (!(clickableSpan instanceof ReactLinkSpan)) {
                clickableSpan.onClick(this);
            }
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float touchX, float touchY) {
        ReactFragmentIndexSpan reactFragmentIndexSpan = (ReactFragmentIndexSpan) getSpanInCoords(c.b(touchX), c.b(touchY), ReactFragmentIndexSpan.class);
        if (reactFragmentIndexSpan != null) {
            int fragmentIndex = reactFragmentIndexSpan.getFragmentIndex();
            PreparedLayout preparedLayout = this.preparedLayout;
            Integer numValueOf = preparedLayout != null ? Integer.valueOf(preparedLayout.getReactTags()[fragmentIndex]) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return getId();
    }

    public final void recycleView() {
        BackgroundStyleApplicator.reset(this);
        setOverflow(Overflow.VISIBLE);
        this.clickableSpans = n0.f14659d;
        this.selection = null;
        this.selectionColor = null;
        setPreparedLayout(null);
    }

    public final void setOverflow(@NotNull Overflow value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.overflow != value) {
            this.overflow = value;
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    public final void setPreparedLayout(PreparedLayout preparedLayout) {
        List<? extends ClickableSpan> listFilterClickableSpans;
        Layout layout;
        CharSequence text;
        Layout layout2;
        if (Intrinsics.areEqual(this.preparedLayout, preparedLayout)) {
            return;
        }
        TextSelection textSelection = this.selection;
        if (textSelection != null) {
            if (preparedLayout == null) {
                clearSelection();
            } else {
                PreparedLayout preparedLayout2 = this.preparedLayout;
                if (Intrinsics.areEqual(String.valueOf((preparedLayout2 == null || (layout2 = preparedLayout2.getLayout()) == null) ? null : layout2.getText()), preparedLayout.getLayout().getText().toString())) {
                    preparedLayout.getLayout().getSelectionPath(textSelection.getStart(), textSelection.getEnd(), textSelection.getPath());
                } else {
                    clearSelection();
                }
            }
        }
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null || (text = layout.getText()) == null || (listFilterClickableSpans = Companion.filterClickableSpans(text)) == null) {
            listFilterClickableSpans = n0.f14659d;
        }
        this.clickableSpans = listFilterClickableSpans;
        this.preparedLayout = preparedLayout;
        invalidate();
    }

    public final void setSelection(int start, int end) {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Layout layout = preparedLayout.getLayout();
        if (start < 0 || end > layout.getText().length() || start >= end) {
            int length = layout.getText().length();
            StringBuilder sbR = e.r(start, "setSelection start and end are not in valid range. start: ", end, ", end: ", ", text length: ");
            sbR.append(length);
            throw new IllegalArgumentException(sbR.toString());
        }
        TextSelection textSelection = this.selection;
        if (textSelection == null) {
            Path path = new Path();
            layout.getSelectionPath(start, end, path);
            this.selection = new TextSelection(start, end, path);
        } else {
            textSelection.setStart(start);
            textSelection.setEnd(end);
            layout.getSelectionPath(start, end, textSelection.getPath());
        }
        invalidate();
    }

    public final void setSelectionColor(Integer num) {
        this.selectionColor = num;
    }
}
