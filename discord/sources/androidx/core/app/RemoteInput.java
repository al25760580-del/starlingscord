package androidx.core.app;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f1533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f1536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f1537g;

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z5, int i7, Bundle bundle, HashSet hashSet) {
        this.f1531a = str;
        this.f1532b = charSequence;
        this.f1533c = charSequenceArr;
        this.f1534d = z5;
        this.f1535e = i7;
        this.f1536f = bundle;
        this.f1537g = hashSet;
        if (i7 == 2 && !z5) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
