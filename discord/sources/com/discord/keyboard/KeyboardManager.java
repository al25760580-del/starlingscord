package com.discord.keyboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/keyboard/KeyboardManager;", "", "<init>", "()V", "keyboardListeners", "", "Lcom/discord/keyboard/KeyboardEvent;", "addKeyboardListener", "", "listener", "removeKeyboardListener", "onKeyboardChanged", "opened", "", "onKeyboardChanged$keyboard_release", "keyboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardManager.kt\ncom/discord/keyboard/KeyboardManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1869#2,2:25\n*S KotlinDebug\n*F\n+ 1 KeyboardManager.kt\ncom/discord/keyboard/KeyboardManager\n*L\n20#1:25,2\n*E\n"})
public final class KeyboardManager {

    @NotNull
    public static final KeyboardManager INSTANCE = new KeyboardManager();

    @NotNull
    private static final List<KeyboardEvent> keyboardListeners = new ArrayList();

    private KeyboardManager() {
    }

    public final synchronized void addKeyboardListener(@NotNull KeyboardEvent listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        keyboardListeners.add(listener);
    }

    public final synchronized void onKeyboardChanged$keyboard_release(boolean opened) {
        Iterator<T> it = keyboardListeners.iterator();
        while (it.hasNext()) {
            ((KeyboardEvent) it.next()).onKeyboardStateChanged(opened);
        }
    }

    public final synchronized void removeKeyboardListener(@NotNull KeyboardEvent listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        keyboardListeners.remove(listener);
    }
}
