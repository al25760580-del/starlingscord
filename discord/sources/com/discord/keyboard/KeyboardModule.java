package com.discord.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.discord.chat.presentation.message.view.voicemessages.b;
import com.discord.codegen.NativeKeyboardModuleSpec;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/keyboard/KeyboardModule;", "Lcom/discord/codegen/NativeKeyboardModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "dismissGlobalKeyboard", "", "onKeyboardChanged", "opened", "", "clearCurrentFocusAndDismissKeyboard", "keyboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardModule extends NativeKeyboardModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onKeyboardChanged$lambda$0(boolean z5) {
        KeyboardManager.INSTANCE.onKeyboardChanged$keyboard_release(z5);
    }

    @Override // com.discord.codegen.NativeKeyboardModuleSpec
    public void clearCurrentFocusAndDismissKeyboard() {
        View currentFocus;
        Window window = ViewUtilsKt.getWindow(getReactApplicationContext());
        if (window != null && (currentFocus = window.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        dismissGlobalKeyboard();
    }

    @Override // com.discord.codegen.NativeKeyboardModuleSpec
    public void dismissGlobalKeyboard() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            KeyboardExtensionsKt.hideKeyboard(currentActivity);
        }
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeKeyboardModuleSpec
    public void onKeyboardChanged(boolean opened) {
        getReactApplicationContext().runOnUiQueueThread(new b(opened, 1));
    }
}
