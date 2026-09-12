package com.discord.chat.bridge.spoiler;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerManager;", "", "<init>", "()V", "revealedSpoilers", "", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "isRevealed", "", StackTraceHelper.ID_KEY, "isRevealed-V2PEE7g", "(Ljava/lang/String;)Z", "isNotRevealed", "isNotRevealed-V2PEE7g", "markRevealed", "", "markRevealed-V2PEE7g", "(Ljava/lang/String;)V", "markHidden", "markHidden-V2PEE7g", "reset", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpoilerManager {

    @NotNull
    public static final SpoilerManager INSTANCE = new SpoilerManager();

    @NotNull
    private static final Set<SpoilerIdentifier> revealedSpoilers = new LinkedHashSet();

    private SpoilerManager() {
    }

    /* JADX INFO: renamed from: isNotRevealed-V2PEE7g, reason: not valid java name */
    public final boolean m450isNotRevealedV2PEE7g(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return !m451isRevealedV2PEE7g(id2);
    }

    /* JADX INFO: renamed from: isRevealed-V2PEE7g, reason: not valid java name */
    public final boolean m451isRevealedV2PEE7g(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return revealedSpoilers.contains(SpoilerIdentifier.m442boximpl(id2));
    }

    /* JADX INFO: renamed from: markHidden-V2PEE7g, reason: not valid java name */
    public final void m452markHiddenV2PEE7g(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        revealedSpoilers.remove(SpoilerIdentifier.m442boximpl(id2));
    }

    /* JADX INFO: renamed from: markRevealed-V2PEE7g, reason: not valid java name */
    public final void m453markRevealedV2PEE7g(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        revealedSpoilers.add(SpoilerIdentifier.m442boximpl(id2));
    }

    public final void reset() {
        revealedSpoilers.clear();
    }
}
