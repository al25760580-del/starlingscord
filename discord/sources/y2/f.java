package y2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23155d;

    public f(int i7, int i10, long j, long j5) {
        this.f23152a = i7;
        this.f23153b = i10;
        this.f23154c = j;
        this.f23155d = j5;
    }

    public static f a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            f fVar = new f(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return fVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f23152a);
            dataOutputStream.writeInt(this.f23153b);
            dataOutputStream.writeLong(this.f23154c);
            dataOutputStream.writeLong(this.f23155d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f)) {
            f fVar = (f) obj;
            if (this.f23153b == fVar.f23153b && this.f23154c == fVar.f23154c && this.f23152a == fVar.f23152a && this.f23155d == fVar.f23155d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f23153b), Long.valueOf(this.f23154c), Integer.valueOf(this.f23152a), Long.valueOf(this.f23155d));
    }
}
