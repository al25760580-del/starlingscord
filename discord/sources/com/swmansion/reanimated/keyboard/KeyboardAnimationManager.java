package com.swmansion.reanimated.keyboard;

import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardAnimationManager {
    private final Keyboard mKeyboard;
    private final WindowsInsetsManager mWindowsInsetsManager;
    private int mNextListenerId = 0;
    private final ConcurrentHashMap<Integer, KeyboardWorkletWrapper> mListeners = new ConcurrentHashMap<>();

    public KeyboardAnimationManager(WeakReference<ReactApplicationContext> weakReference) {
        Keyboard keyboard = new Keyboard();
        this.mKeyboard = keyboard;
        this.mWindowsInsetsManager = new WindowsInsetsManager(weakReference, keyboard, new a(this));
    }

    public void notifyAboutKeyboardChange() {
        Iterator<KeyboardWorkletWrapper> it = this.mListeners.values().iterator();
        while (it.hasNext()) {
            it.next().invoke(this.mKeyboard.getState().asInt(), this.mKeyboard.getHeight());
        }
    }

    public int subscribeForKeyboardUpdates(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z5, boolean z6) {
        int i7 = this.mNextListenerId;
        this.mNextListenerId = i7 + 1;
        if (this.mListeners.isEmpty()) {
            this.mWindowsInsetsManager.startObservingChanges(new KeyboardAnimationCallback(this.mKeyboard, new a(this), z6), z5, z6);
        }
        this.mListeners.put(Integer.valueOf(i7), keyboardWorkletWrapper);
        return i7;
    }

    public void unsubscribeFromKeyboardUpdates(int i7) {
        this.mListeners.remove(Integer.valueOf(i7));
        if (this.mListeners.isEmpty()) {
            this.mWindowsInsetsManager.stopObservingChanges();
        }
    }
}
