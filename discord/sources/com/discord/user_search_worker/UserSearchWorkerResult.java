package com.discord.user_search_worker;

import a3.e;
import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorkerResult;", "", StackTraceHelper.ID_KEY, "", NotificationRenderer.USERNAME, "comparator", "score", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getId", "()Ljava/lang/String;", "getUsername", "getComparator", "getScore", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserSearchWorkerResult {

    @NotNull
    private final String comparator;

    @NotNull
    private final String id;
    private final double score;

    @NotNull
    private final String username;

    public UserSearchWorkerResult(@NotNull String id2, @NotNull String username, @NotNull String comparator, double d6) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.id = id2;
        this.username = username;
        this.comparator = comparator;
        this.score = d6;
    }

    public static /* synthetic */ UserSearchWorkerResult copy$default(UserSearchWorkerResult userSearchWorkerResult, String str, String str2, String str3, double d6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userSearchWorkerResult.id;
        }
        if ((i7 & 2) != 0) {
            str2 = userSearchWorkerResult.username;
        }
        if ((i7 & 4) != 0) {
            str3 = userSearchWorkerResult.comparator;
        }
        if ((i7 & 8) != 0) {
            d6 = userSearchWorkerResult.score;
        }
        String str4 = str3;
        return userSearchWorkerResult.copy(str, str2, str4, d6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComparator() {
        return this.comparator;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    @NotNull
    public final UserSearchWorkerResult copy(@NotNull String id2, @NotNull String username, @NotNull String comparator, double score) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new UserSearchWorkerResult(id2, username, comparator, score);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSearchWorkerResult)) {
            return false;
        }
        UserSearchWorkerResult userSearchWorkerResult = (UserSearchWorkerResult) other;
        return Intrinsics.areEqual(this.id, userSearchWorkerResult.id) && Intrinsics.areEqual(this.username, userSearchWorkerResult.username) && Intrinsics.areEqual(this.comparator, userSearchWorkerResult.comparator) && Double.compare(this.score, userSearchWorkerResult.score) == 0;
    }

    @NotNull
    public final String getComparator() {
        return this.comparator;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getScore() {
        return this.score;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Double.hashCode(this.score) + e.d(e.d(this.id.hashCode() * 31, 31, this.username), 31, this.comparator);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.username;
        String str3 = this.comparator;
        double d6 = this.score;
        StringBuilder sbU = e.u("UserSearchWorkerResult(id=", str, ", username=", str2, ", comparator=");
        sbU.append(str3);
        sbU.append(", score=");
        sbU.append(d6);
        sbU.append(")");
        return sbU.toString();
    }
}
