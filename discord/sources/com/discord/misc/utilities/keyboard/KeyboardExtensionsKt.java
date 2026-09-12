package com.discord.misc.utilities.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.core.view.WindowInsetsControllerCompat;
import ar.b0;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.coroutines.MainImmediateScopeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"showKeyboard", "", "Landroid/app/Activity;", "hideKeyboard", "Landroid/view/View;", "window", "Landroid/view/Window;", "getInsetsController", "Landroidx/core/view/WindowInsetsControllerCompat;", "view", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class KeyboardExtensionsKt {

    /* JADX INFO: renamed from: com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$hideKeyboard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$hideKeyboard$1", f = "KeyboardExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ View $self;
        final /* synthetic */ Window $window;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Window window, View view, Continuation continuation) {
            super(2, continuation);
            this.$window = window;
            this.$self = view;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$window, this.$self, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            KeyboardExtensionsKt.getInsetsController(this.$window, this.$self).a(8);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$showKeyboard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$showKeyboard$1", f = "KeyboardExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class C02021 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ View $self;
        final /* synthetic */ Window $window;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02021(Window window, View view, Continuation continuation) {
            super(2, continuation);
            this.$window = window;
            this.$self = view;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02021(this.$window, this.$self, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            KeyboardExtensionsKt.getInsetsController(this.$window, this.$self).e(8);
            View view = this.$self;
            EditText editText = view instanceof EditText ? (EditText) view : null;
            if (editText != null) {
                editText.requestFocus();
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02021) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        Intrinsics.checkNotNullExpressionValue(windowInsetsControllerCompat, "getInsetsController(...)");
        return windowInsetsControllerCompat;
    }

    public static final void hideKeyboard(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            hideKeyboard(contentView, window);
        }
    }

    public static final void showKeyboard(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            showKeyboard(contentView, window);
        }
    }

    public static final void hideKeyboard(@NotNull View view, @NotNull Window window) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(window, "window");
        b0.t(MainImmediateScopeKt.MainImmediateScope(), null, new AnonymousClass1(window, view, null), 3);
    }

    public static final void showKeyboard(@NotNull View view, @NotNull Window window) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(window, "window");
        b0.t(MainImmediateScopeKt.MainImmediateScope(), null, new C02021(window, view, null), 3);
    }
}
