package com.facebook.react.devsupport;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/DevMenuConfiguration;", "", "devMenuEnabled", "", "shakeGestureEnabled", "keyboardShortcutsEnabled", "<init>", "(ZZZ)V", "getDevMenuEnabled", "()Z", "getShakeGestureEnabled", "getKeyboardShortcutsEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevMenuConfiguration {
    private final boolean devMenuEnabled;
    private final boolean keyboardShortcutsEnabled;
    private final boolean shakeGestureEnabled;

    public DevMenuConfiguration() {
        this(false, false, false, 7, null);
    }

    public final boolean getDevMenuEnabled() {
        return this.devMenuEnabled;
    }

    public final boolean getKeyboardShortcutsEnabled() {
        return this.keyboardShortcutsEnabled;
    }

    public final boolean getShakeGestureEnabled() {
        return this.shakeGestureEnabled;
    }

    public DevMenuConfiguration(boolean z5, boolean z6, boolean z7) {
        this.devMenuEnabled = z5;
        this.shakeGestureEnabled = z6;
        this.keyboardShortcutsEnabled = z7;
    }

    public /* synthetic */ DevMenuConfiguration(boolean z5, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z5, (i7 & 2) != 0 ? true : z6, (i7 & 4) != 0 ? true : z7);
    }
}
