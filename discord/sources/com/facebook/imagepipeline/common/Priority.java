package com.facebook.imagepipeline.common;

import com.facebook.imagepipeline.nativecode.b;
import ga.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Priority {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f4812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Priority f4813e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Priority f4814i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Priority f4815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f4816w;

    static {
        Priority priority = new Priority("LOW", 0);
        f4813e = priority;
        Priority priority2 = new Priority("MEDIUM", 1);
        f4814i = priority2;
        Priority priority3 = new Priority("HIGH", 2);
        f4815v = priority3;
        Priority[] priorityArr = {priority, priority2, priority3};
        f4816w = priorityArr;
        b.l(priorityArr);
        f4812d = new k();
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f4816w.clone();
    }
}
