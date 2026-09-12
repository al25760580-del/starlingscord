package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z2 f5972e;

    public a3(z2 z2Var, Object obj) {
        this.f5972e = z2Var;
        this.f5971d = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ((a3) obj).getClass();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    return false;
                }
                Object obj2 = this.f5971d;
                Object value = entry.getValue();
                if (obj2 == null) {
                    zEquals = value == null;
                } else {
                    zEquals = obj2.equals(value);
                }
                if (zEquals) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5971d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5971d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5972e.f();
        Object obj2 = this.f5971d;
        this.f5971d = obj;
        return obj2;
    }

    public final String toString() {
        return "null=".concat(String.valueOf(this.f5971d));
    }
}
