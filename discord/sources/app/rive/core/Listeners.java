package app.rive.core;

import androidx.annotation.Keep;
import kk.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001JA\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lapp/rive/core/Listeners;", "Ljava/lang/AutoCloseable;", "fileListener", "", "artboardListener", "stateMachineListener", "viewModelInstanceListener", "imageListener", "audioListener", "fontListener", "(JJJJJJJ)V", "getArtboardListener", "()J", "getAudioListener", "getFileListener", "getFontListener", "getImageListener", "getStateMachineListener", "getViewModelInstanceListener", "close", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "cppDelete", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Listeners implements AutoCloseable {
    public static final int $stable = 0;
    private final long artboardListener;
    private final long audioListener;
    private final long fileListener;
    private final long fontListener;
    private final long imageListener;
    private final long stateMachineListener;
    private final long viewModelInstanceListener;

    public Listeners(long j, long j5, long j7, long j10, long j11, long j12, long j13) {
        this.fileListener = j;
        this.artboardListener = j5;
        this.stateMachineListener = j7;
        this.viewModelInstanceListener = j10;
        this.imageListener = j11;
        this.audioListener = j12;
        this.fontListener = j13;
    }

    private final native void cppDelete(long fileListener, long artboardListener, long stateMachineListener, long viewModelInstanceListener, long imageListener, long audioListener, long fontListener);

    @Override // java.lang.AutoCloseable
    public void close() {
        cppDelete(this.fileListener, this.artboardListener, this.stateMachineListener, this.viewModelInstanceListener, this.imageListener, this.audioListener, this.fontListener);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFileListener() {
        return this.fileListener;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getArtboardListener() {
        return this.artboardListener;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getImageListener() {
        return this.imageListener;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAudioListener() {
        return this.audioListener;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFontListener() {
        return this.fontListener;
    }

    @NotNull
    public final Listeners copy(long fileListener, long artboardListener, long stateMachineListener, long viewModelInstanceListener, long imageListener, long audioListener, long fontListener) {
        return new Listeners(fileListener, artboardListener, stateMachineListener, viewModelInstanceListener, imageListener, audioListener, fontListener);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Listeners)) {
            return false;
        }
        Listeners listeners = (Listeners) other;
        return this.fileListener == listeners.fileListener && this.artboardListener == listeners.artboardListener && this.stateMachineListener == listeners.stateMachineListener && this.viewModelInstanceListener == listeners.viewModelInstanceListener && this.imageListener == listeners.imageListener && this.audioListener == listeners.audioListener && this.fontListener == listeners.fontListener;
    }

    public final long getArtboardListener() {
        return this.artboardListener;
    }

    public final long getAudioListener() {
        return this.audioListener;
    }

    public final long getFileListener() {
        return this.fileListener;
    }

    public final long getFontListener() {
        return this.fontListener;
    }

    public final long getImageListener() {
        return this.imageListener;
    }

    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    public int hashCode() {
        return Long.hashCode(this.fontListener) + com.discord.chat.presentation.list.a.h(this.audioListener, com.discord.chat.presentation.list.a.h(this.imageListener, com.discord.chat.presentation.list.a.h(this.viewModelInstanceListener, com.discord.chat.presentation.list.a.h(this.stateMachineListener, com.discord.chat.presentation.list.a.h(this.artboardListener, Long.hashCode(this.fileListener) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j = this.fileListener;
        long j5 = this.artboardListener;
        long j7 = this.stateMachineListener;
        long j10 = this.viewModelInstanceListener;
        long j11 = this.imageListener;
        long j12 = this.audioListener;
        long j13 = this.fontListener;
        StringBuilder sbM = b.m(j, "Listeners(fileListener=", ", artboardListener=");
        sbM.append(j5);
        sbM.append(", stateMachineListener=");
        sbM.append(j7);
        sbM.append(", viewModelInstanceListener=");
        sbM.append(j10);
        sbM.append(", imageListener=");
        sbM.append(j11);
        sbM.append(", audioListener=");
        sbM.append(j12);
        sbM.append(", fontListener=");
        sbM.append(j13);
        sbM.append(")");
        return sbM.toString();
    }
}
