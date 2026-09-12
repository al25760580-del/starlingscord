package ti;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements qi.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f20803f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qi.c f20804g = new qi.c("key", s0.g.i(s0.g.h(e.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qi.c f20805h = new qi.c("value", s0.g.i(s0.g.h(e.class, new a(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final si.a f20806i = new si.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f20807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qi.d f20810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f20811e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, qi.d dVar) {
        this.f20807a = byteArrayOutputStream;
        this.f20808b = map;
        this.f20809c = map2;
        this.f20810d = dVar;
    }

    public static int g(qi.c cVar) {
        e eVar = (e) ((Annotation) cVar.f18900b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f20799b;
        }
        throw new qi.b("Field has no @Protobuf config");
    }

    @Override // qi.e
    public final qi.e a(qi.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f18900b.get(e.class));
        if (eVar == null) {
            throw new qi.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f20799b << 3);
        i(j);
        return this;
    }

    @Override // qi.e
    public final qi.e b(qi.c cVar, int i7) {
        c(cVar, i7, true);
        return this;
    }

    public final void c(qi.c cVar, int i7, boolean z5) {
        if (z5 && i7 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f18900b.get(e.class));
        if (eVar == null) {
            throw new qi.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f20799b << 3);
        h(i7);
    }

    public final void d(qi.c cVar, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20803f);
            h(bytes.length);
            this.f20807a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f20806i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z5 && dDoubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f20807a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z5 && fFloatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f20807a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z5 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f18900b.get(e.class));
            if (eVar == null) {
                throw new qi.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f20799b << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f20807a.write(bArr);
            return;
        }
        qi.d dVar = (qi.d) this.f20808b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z5);
            return;
        }
        qi.f fVar = (qi.f) this.f20809c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f20811e;
            hVar.f20813a = false;
            hVar.f20815c = cVar;
            hVar.f20814b = z5;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            c(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f20810d, cVar, obj, z5);
        }
    }

    @Override // qi.e
    public final qi.e e(qi.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void f(qi.d dVar, qi.c cVar, Object obj, boolean z5) throws IOException {
        b bVar = new b();
        bVar.f20800d = 0L;
        try {
            OutputStream outputStream = this.f20807a;
            this.f20807a = bVar;
            try {
                dVar.a(obj, this);
                this.f20807a = outputStream;
                long j = bVar.f20800d;
                bVar.close();
                if (z5 && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f20807a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f20807a.write((i7 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i7 >>>= 7;
        }
        this.f20807a.write(i7 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f20807a.write((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j >>>= 7;
        }
        this.f20807a.write(((int) j) & 127);
    }
}
