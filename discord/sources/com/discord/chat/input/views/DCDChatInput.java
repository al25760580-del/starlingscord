package com.discord.chat.input.views;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatEditText;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\nR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R*\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00100¨\u00068"}, d2 = {"Lcom/discord/chat/input/views/DCDChatInput;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "measureAndLayoutToContentHeight", "()V", "setupExternalKeyboardSendRequests", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lkotlin/Function2;", "onSelectionChanged", "setOnSelectionChanged", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onRequestSend", "setOnRequestSend", "(Lkotlin/jvm/functions/Function0;)V", "", ViewProps.ENABLED, "setNoExtractUI", "(Z)V", "requestLayout", "forceLayout", "onDetachedFromWindow", "selStart", "selEnd", StackTraceHelper.ID_KEY, "onTextContextMenuItem", "(I)Z", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "clearFocus", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function2;", "value", "contentMaxHeightPx", "I", "getContentMaxHeightPx", "()I", "setContentMaxHeightPx", "(I)V", "Ljava/lang/Runnable;", "measureAndLayoutRunnable", "Ljava/lang/Runnable;", "getTargetHeight", Snapshot.TARGET_HEIGHT, "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDCDChatInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DCDChatInput.kt\ncom/discord/chat/input/views/DCDChatInput\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n30#2:266\n55#2,12:267\n84#2,3:279\n1#3:282\n*S KotlinDebug\n*F\n+ 1 DCDChatInput.kt\ncom/discord/chat/input/views/DCDChatInput\n*L\n84#1:266\n84#1:267,12\n84#1:279,3\n*E\n"})
public final class DCDChatInput extends AppCompatEditText {
    private int contentMaxHeightPx;

    @NotNull
    private final Runnable measureAndLayoutRunnable;
    private Function0<Unit> onRequestSend;
    private Function2<? super Integer, ? super Integer, Unit> onSelectionChanged;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DCDChatInput(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getTargetHeight() {
        Layout layout;
        if (this.contentMaxHeightPx > 0 && (layout = getLayout()) != null) {
            return Math.min(getCompoundPaddingBottom() + getCompoundPaddingTop() + layout.getHeight(), this.contentMaxHeightPx);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void measureAndLayoutToContentHeight() {
        int height;
        if (getWidth() == 0) {
            return;
        }
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            height = getHeight();
        } else {
            int height2 = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            height = height2 < 0 ? 0 : height2;
        }
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        layout(getLeft(), getTop(), getRight(), getMeasuredHeight() + getTop());
    }

    private final void setupExternalKeyboardSendRequests() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        setOnKeyListener(new View.OnKeyListener() { // from class: com.discord.chat.input.views.e
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
                return DCDChatInput.setupExternalKeyboardSendRequests$lambda$3(booleanRef, this, view, i7, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupExternalKeyboardSendRequests$lambda$3(Ref.BooleanRef booleanRef, DCDChatInput dCDChatInput, View view, int i7, KeyEvent event) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event.getFlags() & 2) != 2 && i7 == 66) {
            boolean z5 = booleanRef.element;
            if (event.getAction() == 0) {
                booleanRef.element = true;
                if (event.hasModifiers(1)) {
                    return false;
                }
                if (!z5 && (function0 = dCDChatInput.onRequestSend) != null) {
                    function0.invoke();
                }
                return true;
            }
            if (event.getAction() == 1) {
                booleanRef.element = false;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void clearFocus() {
        super.clearFocus();
        Window window = ViewUtilsKt.getWindow(getContext());
        if (window != null) {
            KeyboardExtensionsKt.hideKeyboard(this, window);
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        boolean zIsLayoutRequested = isLayoutRequested();
        super.forceLayout();
        if (zIsLayoutRequested) {
            return;
        }
        post(this.measureAndLayoutRunnable);
    }

    public final int getContentMaxHeightPx() {
        return this.contentMaxHeightPx;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.measureAndLayoutRunnable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int targetHeight;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 && (targetHeight = getTargetHeight()) > getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), targetHeight);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onSelectionChanged;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(selStart), Integer.valueOf(selEnd));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int id2) {
        if (id2 == 16908322) {
            id2 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(id2);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ViewGroup discordGestureHandlerEnabledRootView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0 && (discordGestureHandlerEnabledRootView = GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this)) != null) {
            discordGestureHandlerEnabledRootView.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void requestLayout() {
        boolean zIsLayoutRequested = isLayoutRequested();
        super.requestLayout();
        if (zIsLayoutRequested) {
            return;
        }
        post(this.measureAndLayoutRunnable);
    }

    public final void setContentMaxHeightPx(int i7) {
        if (this.contentMaxHeightPx == i7) {
            return;
        }
        this.contentMaxHeightPx = i7;
        requestLayout();
    }

    public final void setNoExtractUI(boolean enabled) {
        setImeOptions(enabled ? getImeOptions() | 268435456 : getImeOptions() & (-268435457));
    }

    public final void setOnRequestSend(@NotNull Function0<Unit> onRequestSend) {
        Intrinsics.checkNotNullParameter(onRequestSend, "onRequestSend");
        this.onRequestSend = onRequestSend;
    }

    public final void setOnSelectionChanged(@NotNull Function2<? super Integer, ? super Integer, Unit> onSelectionChanged) {
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
        this.onSelectionChanged = onSelectionChanged;
    }

    public /* synthetic */ DCDChatInput(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDChatInput(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.measureAndLayoutRunnable = new am.c(5, this);
        setupExternalKeyboardSendRequests();
        addTextChangedListener(new TextWatcher() { // from class: com.discord.chat.input.views.DCDChatInput$special$$inlined$doBeforeTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s2) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                if (this.this$0.getContentMaxHeightPx() > 0) {
                    this.this$0.requestLayout();
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }
}
