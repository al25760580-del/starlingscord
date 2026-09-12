package com.discord.appreview;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ig.b, OnCompleteListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppRatingRequester f3958d;

    public /* synthetic */ b(AppRatingRequester appRatingRequester) {
        this.f3958d = appRatingRequester;
    }

    @Override // ig.b
    public void J() {
        AppRatingRequester.executeRequest$lambda$2(this.f3958d);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        AppRatingRequester.executeRequest$lambda$1$lambda$0(this.f3958d, task);
    }
}
