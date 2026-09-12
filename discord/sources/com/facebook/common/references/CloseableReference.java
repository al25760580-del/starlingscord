package com.facebook.common.references;

import android.graphics.Bitmap;
import androidx.datastore.preferences.protobuf.d1;
import ga.k;
import i8.b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import n8.i;
import r8.a;
import r8.c;
import r8.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CloseableReference implements Cloneable, Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f4622w = new k();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f4623x = new b(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4624d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f4625e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f4626i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Throwable f4627v;

    public CloseableReference(d dVar, a aVar, Throwable th2) {
        int i7;
        boolean z5;
        dVar.getClass();
        this.f4625e = dVar;
        synchronized (dVar) {
            synchronized (dVar) {
                i7 = dVar.f19212b;
                z5 = i7 > 0;
            }
            this.f4626i = aVar;
            this.f4627v = th2;
        }
        if (!z5) {
            throw new d1("Null shared reference");
        }
        dVar.f19212b = i7 + 1;
        this.f4626i = aVar;
        this.f4627v = th2;
    }

    public static r8.b B(Closeable closeable) {
        return O(closeable, f4622w, f4623x);
    }

    public static r8.b O(Object obj, c cVar, a aVar) {
        if (obj == null) {
            return null;
        }
        aVar.E();
        if (!(obj instanceof Bitmap)) {
            boolean z5 = obj instanceof na.c;
        }
        return new r8.b(obj, cVar, aVar, null, true);
    }

    public static CloseableReference g(CloseableReference closeableReference) {
        if (closeableReference != null) {
            return closeableReference.f();
        }
        return null;
    }

    public static void l(CloseableReference closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    public static void n(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l((CloseableReference) it.next());
            }
        }
    }

    public static boolean z(CloseableReference closeableReference) {
        return closeableReference != null && closeableReference.u();
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract CloseableReference clone();

    /* JADX WARN: Code duplicated, block: B:27:0x002b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0034  */
    /* JADX WARN: Code duplicated, block: B:33:0x0038  */
    /* JADX WARN: Code duplicated, block: B:38:0x0046 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0058 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x005e A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0062 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0075 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i7;
        boolean z5;
        int i10;
        Object obj;
        c cVar;
        IdentityHashMap identityHashMap;
        Integer num;
        synchronized (this) {
            try {
                if (this.f4624d) {
                    return;
                }
                this.f4624d = true;
                d dVar = this.f4625e;
                synchronized (dVar) {
                    synchronized (dVar) {
                        i7 = dVar.f19212b;
                        z5 = i7 > 0;
                    }
                    if (i10 == 0) {
                        synchronized (dVar) {
                            obj = dVar.f19211a;
                            dVar.f19211a = null;
                        }
                        if (obj != null) {
                            cVar = dVar.f19213c;
                            if (cVar != null) {
                                cVar.release(obj);
                            }
                            identityHashMap = d.f19210d;
                            synchronized (identityHashMap) {
                                try {
                                    num = (Integer) identityHashMap.get(obj);
                                    if (num == null) {
                                        o8.a.z("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                                    } else if (num.intValue() == 1) {
                                        identityHashMap.remove(obj);
                                    } else {
                                        identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                if (!z5) {
                    throw new d1("Null shared reference");
                }
                if (!(i7 > 0)) {
                    throw new IllegalArgumentException();
                }
                i10 = dVar.f19212b - 1;
                dVar.f19212b = i10;
                if (i10 == 0) {
                    synchronized (dVar) {
                        obj = dVar.f19211a;
                        dVar.f19211a = null;
                        if (obj != null) {
                            cVar = dVar.f19213c;
                            if (cVar != null) {
                                cVar.release(obj);
                            }
                            identityHashMap = d.f19210d;
                            synchronized (identityHashMap) {
                                num = (Integer) identityHashMap.get(obj);
                                if (num == null) {
                                    o8.a.z("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                                } else if (num.intValue() == 1) {
                                    identityHashMap.remove(obj);
                                } else {
                                    identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public synchronized CloseableReference f() {
        if (!u()) {
            return null;
        }
        return clone();
    }

    public final synchronized Object q() {
        Object objA;
        i.e(!this.f4624d);
        objA = this.f4625e.a();
        objA.getClass();
        return objA;
    }

    public synchronized boolean u() {
        return !this.f4624d;
    }

    public CloseableReference(Object obj, c cVar, a aVar, Throwable th2, boolean z5) {
        this.f4625e = new d(obj, cVar, z5);
        this.f4626i = aVar;
        this.f4627v = th2;
    }
}
