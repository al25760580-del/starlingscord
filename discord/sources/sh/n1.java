package sh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a5.o f20123h = new a5.o("SliceMetadataManager", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20129f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20124a = new byte[8192];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20130g = -1;

    public n1(s sVar, String str, int i7, long j, String str2) {
        this.f20125b = sVar;
        this.f20126c = str;
        this.f20127d = i7;
        this.f20128e = j;
        this.f20129f = str2;
    }

    public final int a() throws IOException {
        s sVar = this.f20125b;
        sVar.getClass();
        File file = new File(new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new l0("Slice checkpoint file corrupt.");
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final y b() throws IOException {
        s sVar = this.f20125b;
        sVar.getClass();
        File file = new File(new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f), "checkpoint.dat");
        if (!file.exists()) {
            throw new l0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new l0("Slice checkpoint file corrupt.");
            }
            try {
                int i7 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j5 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i10 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f20130g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new y(j, j5, property, i7, i10);
            } catch (NumberFormatException e10) {
                throw new l0("Slice checkpoint file corrupt.", e10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final File c() {
        s sVar = this.f20125b;
        sVar.getClass();
        File file = new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, this.f20130g + "-NAM.dat");
    }

    public final void d(long j, byte[] bArr, int i7, int i10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i7, i10);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void e(int i7) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i7));
        properties.put("metadataFileCounter", String.valueOf(this.f20130g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f(long j, long j5, String str, int i7) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j5));
        properties.put("previousChunk", String.valueOf(i7));
        properties.put("metadataFileCounter", String.valueOf(this.f20130g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(byte[] bArr, int i7) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i7));
        properties.put("metadataFileCounter", String.valueOf(this.f20130g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            s sVar = this.f20125b;
            sVar.getClass();
            File file = new File(new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                fileOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public final void h(int i7) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i7));
        properties.put("metadataFileCounter", String.valueOf(this.f20130g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(byte[] bArr) {
        this.f20130g++;
        s sVar = this.f20125b;
        sVar.getClass();
        File file = new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, this.f20130g + "-LFH.dat"));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new l0("Could not write metadata file.", e10);
        }
    }

    public final void j(InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f20124a;
        this.f20130g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i7 = inputStream.read(bArr2);
            while (i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                i7 = inputStream.read(bArr2);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(byte[] bArr, int i7) throws IOException {
        this.f20130g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i7);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final File l() throws IOException {
        s sVar = this.f20125b;
        sVar.getClass();
        File file = new File(new File(new File(new File(sVar.c(this.f20127d, this.f20128e, this.f20126c), "_slices"), "_metadata"), this.f20129f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
