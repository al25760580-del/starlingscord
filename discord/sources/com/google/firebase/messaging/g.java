package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.tasks.Task;
import ei.q0;
import ei.r0;
import java.util.Arrays;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements ig.a, fe.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6584e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6585i;

    public /* synthetic */ g(Object obj, Object obj2, boolean z5) {
        this.f6584e = obj;
        this.f6585i = obj2;
        this.f6583d = z5;
    }

    @Override // fe.l
    public r0 c(int i7, x0 x0Var, int[] iArr) {
        Object[] objArrCopyOf;
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) this.f6584e;
        com.google.android.exoplayer2.trackselection.a aVar = (com.google.android.exoplayer2.trackselection.a) this.f6585i;
        q0 q0Var = DefaultTrackSelector.k;
        defaultTrackSelector.getClass();
        fe.d dVar = new fe.d(defaultTrackSelector);
        ei.c0 c0Var = ei.e0.f8303e;
        ei.p.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        while (i10 < x0Var.f15727d) {
            int i12 = i7;
            x0 x0Var2 = x0Var;
            fe.e eVar = new fe.e(i12, x0Var2, i10, aVar, iArr[i10], this.f6583d, dVar);
            int i13 = i11 + 1;
            if (objArr.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArr, ei.y.d(objArr.length, i13));
            } else {
                if (z5) {
                    objArrCopyOf = (Object[]) objArr.clone();
                }
                objArr[i11] = eVar;
                i10++;
                i11++;
                i7 = i12;
                x0Var = x0Var2;
            }
            objArr = objArrCopyOf;
            z5 = false;
            objArr[i11] = eVar;
            i10++;
            i11++;
            i7 = i12;
            x0Var = x0Var2;
        }
        return ei.e0.j(i11, objArr);
    }

    @Override // ig.a
    public Object f(Task task) {
        return (ff.c.c() && ((Integer) task.i()).intValue() == 402) ? h.a((Context) this.f6584e, (Intent) this.f6585i, this.f6583d).f(new com.discord.misc.utilities.threading.a(1), new com.facebook.react.a(27)) : task;
    }
}
