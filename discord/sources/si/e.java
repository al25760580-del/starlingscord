package si;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import qi.f;
import qi.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements qi.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20271a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f20272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qi.d f20275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20276f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z5) {
        this.f20272b = new JsonWriter(bufferedWriter);
        this.f20273c = map;
        this.f20274d = map2;
        this.f20275e = aVar;
        this.f20276f = z5;
    }

    @Override // qi.e
    public final qi.e a(qi.c cVar, long j) throws IOException {
        String str = cVar.f18899a;
        h();
        JsonWriter jsonWriter = this.f20272b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    @Override // qi.e
    public final qi.e b(qi.c cVar, int i7) throws IOException {
        String str = cVar.f18899a;
        h();
        JsonWriter jsonWriter = this.f20272b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i7);
        return this;
    }

    @Override // qi.g
    public final g c(String str) throws IOException {
        h();
        this.f20272b.value(str);
        return this;
    }

    @Override // qi.g
    public final g d(boolean z5) throws IOException {
        h();
        this.f20272b.value(z5);
        return this;
    }

    @Override // qi.e
    public final qi.e e(qi.c cVar, Object obj) throws IOException {
        g(obj, cVar.f18899a);
        return this;
    }

    public final void f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f20272b;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new qi.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            qi.d dVar = (qi.d) this.f20273c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.f20274d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return;
            } else {
                jsonWriter.beginObject();
                this.f20275e.a(obj, this);
                jsonWriter.endObject();
                return;
            }
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        jsonWriter.beginArray();
        int i7 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i7 < length) {
                jsonWriter.value(iArr[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                long j = jArr[i7];
                h();
                jsonWriter.value(j);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                jsonWriter.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                jsonWriter.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i7 < length5) {
                f(numberArr[i7]);
                i7++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i7 < length6) {
                f(objArr[i7]);
                i7++;
            }
        }
        jsonWriter.endArray();
    }

    public final void g(Object obj, String str) throws IOException {
        boolean z5 = this.f20276f;
        JsonWriter jsonWriter = this.f20272b;
        if (z5) {
            if (obj == null) {
                return;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
    }

    public final void h() {
        if (!this.f20271a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
