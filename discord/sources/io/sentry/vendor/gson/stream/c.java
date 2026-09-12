package io.sentry.vendor.gson.stream;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable, Flushable {
    public static final String[] F = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
    public final boolean E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Writer f13262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f13263e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13264i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13268y;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            F[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = F;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f13263e = iArr;
        this.f13264i = 0;
        if (iArr.length == 0) {
            this.f13263e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f13263e;
        int i7 = this.f13264i;
        this.f13264i = i7 + 1;
        iArr2[i7] = 6;
        this.f13266w = ":";
        this.E = true;
        this.f13262d = writer;
    }

    public final void c() throws IOException {
        int iL = l();
        if (iL == 1) {
            this.f13263e[this.f13264i - 1] = 2;
            g();
            return;
        }
        Writer writer = this.f13262d;
        if (iL == 2) {
            writer.append(',');
            g();
        } else {
            if (iL == 4) {
                writer.append((CharSequence) this.f13266w);
                this.f13263e[this.f13264i - 1] = 5;
                return;
            }
            if (iL != 6) {
                if (iL != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f13267x) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f13263e[this.f13264i - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13262d.close();
        int i7 = this.f13264i;
        if (i7 > 1 || (i7 == 1 && this.f13263e[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f13264i = 0;
    }

    public final void f(char c8, int i7, int i10) throws IOException {
        int iL = l();
        if (iL != i10 && iL != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f13268y != null) {
            throw new IllegalStateException("Dangling name: " + this.f13268y);
        }
        this.f13264i--;
        if (iL == i10) {
            g();
        }
        this.f13262d.write(c8);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f13264i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f13262d.flush();
    }

    public final void g() throws IOException {
        if (this.f13265v == null) {
            return;
        }
        Writer writer = this.f13262d;
        writer.write(10);
        int i7 = this.f13264i;
        for (int i10 = 1; i10 < i7; i10++) {
            writer.write(this.f13265v);
        }
    }

    public final void i() throws IOException {
        if (this.f13268y != null) {
            if (!this.E) {
                this.f13268y = null;
                return;
            }
            q();
        }
        c();
        this.f13262d.write("null");
    }

    public final int l() {
        int i7 = this.f13264i;
        if (i7 != 0) {
            return this.f13263e[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void n(String str) throws IOException {
        String str2;
        Writer writer = this.f13262d;
        writer.write(34);
        int length = str.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = F[cCharAt];
                if (str2 != null) {
                    if (i7 < i10) {
                        writer.write(str, i7, i10 - i7);
                    }
                    writer.write(str2);
                    i7 = i10 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i7 < i10) {
                    writer.write(str, i7, i10 - i7);
                }
                writer.write(str2);
                i7 = i10 + 1;
            }
        }
        if (i7 < length) {
            writer.write(str, i7, length - i7);
        }
        writer.write(34);
    }

    public final void q() throws IOException {
        if (this.f13268y != null) {
            int iL = l();
            if (iL == 5) {
                this.f13262d.write(44);
            } else if (iL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            g();
            this.f13263e[this.f13264i - 1] = 4;
            n(this.f13268y);
            this.f13268y = null;
        }
    }
}
