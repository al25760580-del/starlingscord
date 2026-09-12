package com.margelo.nitro.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/core/NullType;", "", "<init>", "()V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "com/margelo/nitro/core/d", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NullType {

    @NotNull
    public static final d Companion = new d();

    @xa.a
    @Keep
    @NotNull
    public static final NullType NULL = new NullType();

    private NullType() {
    }

    public boolean equals(Object other) {
        return other instanceof NullType;
    }

    public int hashCode() {
        return 0;
    }
}
