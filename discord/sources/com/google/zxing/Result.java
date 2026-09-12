package com.google.zxing;

import ij.a;
import ij.l;
import ij.m;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m[] f6650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f6651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f6652e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(String str, byte[] bArr, m[] mVarArr, a aVar) {
        this(str, bArr, mVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.f6652e;
            if (map2 == null) {
                this.f6652e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(l lVar, Object obj) {
        if (this.f6652e == null) {
            this.f6652e = new EnumMap(l.class);
        }
        this.f6652e.put(lVar, obj);
    }

    public final String toString() {
        return this.f6648a;
    }

    public Result(String str, byte[] bArr, m[] mVarArr, a aVar, int i7) {
        this.f6648a = str;
        this.f6649b = bArr;
        this.f6650c = mVarArr;
        this.f6651d = aVar;
        this.f6652e = null;
    }
}
