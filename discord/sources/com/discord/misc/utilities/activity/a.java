package com.discord.misc.utilities.activity;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.StackFrame;
import java.lang.ref.WeakReference;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4490e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4491i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Cloneable f4493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4494x;

    public /* synthetic */ a(Object obj, Object obj2, Cloneable cloneable, int i7, Object obj3, int i10) {
        this.f4489d = i10;
        this.f4491i = obj;
        this.f4492v = obj2;
        this.f4493w = cloneable;
        this.f4490e = i7;
        this.f4494x = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4489d) {
            case 0:
                ActivityUtilities.startActivityForResultAsyncWithFuture$lambda$1((WeakReference) this.f4491i, (CompletableFuture) this.f4492v, (Intent) this.f4493w, this.f4490e, (Bundle) this.f4494x);
                break;
            default:
                DevSupportManagerBase.showNewError$lambda$7((DevSupportManagerBase) this.f4491i, (String) this.f4492v, (StackFrame[]) this.f4493w, this.f4490e, (ErrorType) this.f4494x);
                break;
        }
    }
}
