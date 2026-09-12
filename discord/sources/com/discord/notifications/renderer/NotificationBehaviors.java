package com.discord.notifications.renderer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/discord/notifications/renderer/NotificationBehaviors;", "", "soundsEnabled", "", "vibrationsEnabled", "lightsEnabled", "<init>", "(ZZZ)V", "getSoundsEnabled", "()Z", "getVibrationsEnabled", "getLightsEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "notification_renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotificationBehaviors {
    private final boolean lightsEnabled;
    private final boolean soundsEnabled;
    private final boolean vibrationsEnabled;

    public NotificationBehaviors(boolean z5, boolean z6, boolean z7) {
        this.soundsEnabled = z5;
        this.vibrationsEnabled = z6;
        this.lightsEnabled = z7;
    }

    public static /* synthetic */ NotificationBehaviors copy$default(NotificationBehaviors notificationBehaviors, boolean z5, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = notificationBehaviors.soundsEnabled;
        }
        if ((i7 & 2) != 0) {
            z6 = notificationBehaviors.vibrationsEnabled;
        }
        if ((i7 & 4) != 0) {
            z7 = notificationBehaviors.lightsEnabled;
        }
        return notificationBehaviors.copy(z5, z6, z7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSoundsEnabled() {
        return this.soundsEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVibrationsEnabled() {
        return this.vibrationsEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLightsEnabled() {
        return this.lightsEnabled;
    }

    @NotNull
    public final NotificationBehaviors copy(boolean soundsEnabled, boolean vibrationsEnabled, boolean lightsEnabled) {
        return new NotificationBehaviors(soundsEnabled, vibrationsEnabled, lightsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBehaviors)) {
            return false;
        }
        NotificationBehaviors notificationBehaviors = (NotificationBehaviors) other;
        return this.soundsEnabled == notificationBehaviors.soundsEnabled && this.vibrationsEnabled == notificationBehaviors.vibrationsEnabled && this.lightsEnabled == notificationBehaviors.lightsEnabled;
    }

    public final boolean getLightsEnabled() {
        return this.lightsEnabled;
    }

    public final boolean getSoundsEnabled() {
        return this.soundsEnabled;
    }

    public final boolean getVibrationsEnabled() {
        return this.vibrationsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.lightsEnabled) + com.discord.chat.presentation.list.a.g(Boolean.hashCode(this.soundsEnabled) * 31, 31, this.vibrationsEnabled);
    }

    @NotNull
    public String toString() {
        boolean z5 = this.soundsEnabled;
        boolean z6 = this.vibrationsEnabled;
        boolean z7 = this.lightsEnabled;
        StringBuilder sb2 = new StringBuilder("NotificationBehaviors(soundsEnabled=");
        sb2.append(z5);
        sb2.append(", vibrationsEnabled=");
        sb2.append(z6);
        sb2.append(", lightsEnabled=");
        return com.discord.chat.presentation.list.a.m(sb2, z7, ")");
    }
}
