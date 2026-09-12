package com.discord.jank_stats;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/discord/jank_stats/JankReport;", "", "numFrames", "", "numJankFrames", "<init>", "(II)V", "getNumFrames", "()I", "getNumJankFrames", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JankReport {
    private final int numFrames;
    private final int numJankFrames;

    public JankReport(int i7, int i10) {
        this.numFrames = i7;
        this.numJankFrames = i10;
    }

    public final int getNumFrames() {
        return this.numFrames;
    }

    public final int getNumJankFrames() {
        return this.numJankFrames;
    }
}
