package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5406d;

    public i0(Context context, String str, boolean z5) {
        super(new File(a3.e.o(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str)), z5 ? 1 : 0);
        this.f5406d = context;
    }

    public static void i(File file, byte b10, boolean z5) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z5) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (SyncFailedException e10) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.b0
    public void d(int i7) {
        File file = this.f5386a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        q qVar = null;
        try {
            try {
                q qVarD = c0.d(file, new File(file, "dso_lock"));
                try {
                    r.h("fb-UnpackingSoSource", "locked dso store " + file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!h(qVarD, i7)) {
                        String str = "dso store is up-to-date: " + file;
                        if (r.f("fb-UnpackingSoSource", 4)) {
                            Log.i("fb-UnpackingSoSource", str);
                        }
                        qVar = qVarD;
                    }
                    if (qVar != null) {
                        r.h("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        qVar.close();
                    } else {
                        r.h("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th2) {
                    th = th2;
                    qVar = qVarD;
                    if (qVar != null) {
                        r.h("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        qVar.close();
                    } else {
                        r.h("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th4;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] e() {
        Parcel parcelObtain = Parcel.obtain();
        h0 h0VarG = g();
        try {
            g0[] g0VarArrF = h0VarG.f();
            parcelObtain.writeInt(g0VarArrF.length);
            for (g0 g0Var : g0VarArrF) {
                parcelObtain.writeString(g0Var.f5395d);
                parcelObtain.writeString(g0Var.f5396e);
            }
            h0VarG.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            try {
                h0VarG.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public g0[] f() {
        h0 h0VarG = g();
        try {
            g0[] g0VarArrF = h0VarG.f();
            h0VarG.close();
            return g0VarArrF;
        } catch (Throwable th2) {
            try {
                h0VarG.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public abstract h0 g();

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: all -> 0x0094, IOException -> 0x0097, TRY_LEAVE, TryCatch #1 {IOException -> 0x0097, blocks: (B:34:0x0079, B:36:0x007f), top: B:90:0x0079, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x007f, please report this as an issue */
    public final boolean h(q qVar, int i7) throws IOException {
        byte b10;
        boolean z5;
        RandomAccessFile randomAccessFile;
        File file = this.f5386a;
        File file2 = new File(file, "dso_state");
        byte[] bArrE = e();
        if ((i7 & 2) != 0) {
            b10 = 0;
        } else {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
                try {
                    if (randomAccessFile2.length() != 0) {
                        int length = (int) randomAccessFile2.length();
                        byte[] bArr = new byte[length];
                        if (randomAccessFile2.read(bArr) != length) {
                            r.h("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                        } else {
                            z5 = !Arrays.equals(bArr, bArrE);
                            randomAccessFile2.close();
                        }
                        if (z5) {
                            b10 = 0;
                        } else {
                            randomAccessFile = new RandomAccessFile(file2, "rw");
                            try {
                                if (randomAccessFile.length() == 1) {
                                    try {
                                        b10 = randomAccessFile.readByte();
                                        if (b10 == 1) {
                                            r.h("fb-UnpackingSoSource", "dso store " + file + " regeneration not needed: state file clean");
                                        } else {
                                            b10 = 0;
                                        }
                                    } catch (IOException e10) {
                                        r.h("fb-UnpackingSoSource", "dso store " + file + " regeneration interrupted: " + e10.getMessage());
                                    }
                                } else {
                                    b10 = 0;
                                }
                                randomAccessFile.close();
                            } catch (Throwable th2) {
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    }
                    randomAccessFile2.close();
                    z5 = true;
                    if (z5) {
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        if (randomAccessFile.length() == 1) {
                            b10 = randomAccessFile.readByte();
                            if (b10 == 1) {
                                r.h("fb-UnpackingSoSource", "dso store " + file + " regeneration not needed: state file clean");
                            } else {
                                b10 = 0;
                            }
                        } else {
                            b10 = 0;
                        }
                        randomAccessFile.close();
                    } else {
                        b10 = 0;
                    }
                } catch (Throwable th4) {
                    try {
                        randomAccessFile2.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (IOException e11) {
                Log.w("fb-UnpackingSoSource", "failed to compare whether deps changed", e11);
            }
        }
        if (b10 == 1) {
            return false;
        }
        boolean z6 = (i7 & 4) == 0;
        r.h("fb-UnpackingSoSource", "so store dirty: regenerating");
        i(file2, (byte) 0, z6);
        File[] fileArrListFiles = file.listFiles(new e0(0));
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + file);
        }
        for (File file3 : fileArrListFiles) {
            r.h("fb-UnpackingSoSource", "Deleting " + file3);
            c0.b(file3);
        }
        h0 h0VarG = g();
        try {
            h0VarG.g(file);
            h0VarG.close();
            RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
            try {
                randomAccessFile3.write(bArrE);
                randomAccessFile3.setLength(randomAccessFile3.getFilePointer());
                randomAccessFile3.close();
                f0 f0Var = new f0(this, z6, file2, qVar);
                if ((i7 & 1) != 0) {
                    new Thread(f0Var, "SoSync:" + file.getName()).start();
                } else {
                    f0Var.run();
                }
                return true;
            } catch (Throwable th6) {
                try {
                    randomAccessFile3.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            try {
                h0VarG.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }
}
