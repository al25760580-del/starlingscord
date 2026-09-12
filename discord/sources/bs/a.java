package bs;

import a3.e;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.tz.j;
import net.time4j.tz.o;
import net.time4j.x0;
import s0.g;
import vr.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o, as.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f3392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f3393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f3394f;

    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public a() throws Throwable {
        InputStream inputStream;
        String string;
        IllegalStateException illegalStateException;
        URI uriC;
        InputStream inputStream2;
        String str = "";
        x0 x0VarZ = (x0) x0.W.f23072y;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z5 = System.getProperty("net.time4j.scale.leapseconds.path") != null;
        if (z5) {
            this.f3394f = Collections.EMPTY_MAP;
        } else {
            this.f3394f = new LinkedHashMap(50);
        }
        String property = System.getProperty("net.time4j.tz.repository.path");
        String property2 = System.getProperty("net.time4j.tz.repository.version");
        String strE = property2 == null ? "tzdata.repository" : g.e("tzdata", property2, ".repository");
        try {
            String str2 = "tzrepo/" + strE;
            if (property != null) {
                File file = new File(property, strE);
                if (!file.isAbsolute()) {
                    uriC = c.f21955b.c("tzdata", file.toString(), f());
                } else {
                    if (!file.exists()) {
                        throw new FileNotFoundException("Path to tz-repository not found: " + file);
                    }
                    uriC = file.toURI();
                }
            } else {
                uriC = c.f21955b.c("tzdata", str2, f());
            }
            if (uriC != null) {
                inputStream2 = c.f21955b.b(uriC);
                try {
                    try {
                        string = uriC.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    string = "";
                    inputStream = inputStream2;
                    try {
                        IllegalStateException illegalStateException2 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        illegalStateException = illegalStateException2;
                        if (illegalStateException != null) {
                            throw illegalStateException;
                        }
                        this.f3389a = str;
                        this.f3390b = string;
                        this.f3391c = Collections.unmodifiableMap(map);
                        this.f3392d = Collections.unmodifiableMap(map2);
                        this.f3393e = x0VarZ;
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                }
            } else {
                string = "";
                inputStream2 = null;
            }
            if (inputStream2 == null) {
                try {
                    URL resource = f().getClassLoader().getResource(str2);
                    if (resource == null) {
                        throw new FileNotFoundException("Classloader cannot access tz-repository: " + str2);
                    }
                    URLConnection uRLConnectionOpenConnection = resource.openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    uRLConnectionOpenConnection.connect();
                    inputStream2 = uRLConnectionOpenConnection.getInputStream();
                    string = resource.toString();
                } catch (IOException e11) {
                    e = e11;
                    inputStream = inputStream2;
                    IllegalStateException illegalStateException3 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    illegalStateException = illegalStateException3;
                    if (illegalStateException != null) {
                        throw illegalStateException;
                    }
                    this.f3389a = str;
                    this.f3390b = string;
                    this.f3391c = Collections.unmodifiableMap(map);
                    this.f3392d = Collections.unmodifiableMap(map2);
                    this.f3393e = x0VarZ;
                }
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream2);
                e(dataInputStream, string);
                String utf = dataInputStream.readUTF();
                int i7 = dataInputStream.readInt();
                ArrayList arrayList = new ArrayList(i7);
                int i10 = 0;
                while (i10 < i7) {
                    String utf2 = dataInputStream.readUTF();
                    int i11 = dataInputStream.readInt();
                    byte[] bArr = new byte[i11];
                    String str3 = string;
                    String str4 = utf;
                    int i12 = 0;
                    do {
                        try {
                            i12 += dataInputStream.read(bArr, i12, i11 - i12);
                            if (i12 == -1) {
                                throw new EOFException("Incomplete data: " + utf2);
                            }
                        } catch (IOException e12) {
                            e = e12;
                            inputStream = inputStream2;
                            string = str3;
                            IllegalStateException illegalStateException4 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            illegalStateException = illegalStateException4;
                            if (illegalStateException != null) {
                                throw illegalStateException;
                            }
                            this.f3389a = str;
                            this.f3390b = string;
                            this.f3391c = Collections.unmodifiableMap(map);
                            this.f3392d = Collections.unmodifiableMap(map2);
                            this.f3393e = x0VarZ;
                        }
                    } while (i11 > i12);
                    arrayList.add(utf2);
                    map.put(utf2, bArr);
                    i10++;
                    string = str3;
                    utf = str4;
                }
                String str5 = string;
                String str6 = utf;
                short s2 = dataInputStream.readShort();
                for (int i13 = 0; i13 < s2; i13++) {
                    map2.put(dataInputStream.readUTF(), (String) arrayList.get(dataInputStream.readShort()));
                }
                if (!z5) {
                    short s5 = dataInputStream.readShort();
                    for (int i14 = 0; i14 < s5; i14++) {
                        this.f3394f.put(x0.z(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte(), true), Integer.valueOf(dataInputStream.readByte()));
                    }
                    x0VarZ = x0.z(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte(), true);
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                string = str5;
                str = str6;
                illegalStateException = null;
            } catch (IOException e13) {
                e = e13;
                inputStream = inputStream2;
                IllegalStateException illegalStateException5 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                if (inputStream != null) {
                    inputStream.close();
                }
                illegalStateException = illegalStateException5;
                if (illegalStateException != null) {
                    throw illegalStateException;
                }
                this.f3389a = str;
                this.f3390b = string;
                this.f3391c = Collections.unmodifiableMap(map);
                this.f3392d = Collections.unmodifiableMap(map2);
                this.f3393e = x0VarZ;
            }
        } catch (IOException e14) {
            e = e14;
            string = "";
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
        if (illegalStateException != null) {
            throw illegalStateException;
        }
        this.f3389a = str;
        this.f3390b = string;
        this.f3391c = Collections.unmodifiableMap(map);
        this.f3392d = Collections.unmodifiableMap(map2);
        this.f3393e = x0VarZ;
    }

    public static void e(DataInputStream dataInputStream, String str) throws IOException {
        byte b10 = dataInputStream.readByte();
        byte b11 = dataInputStream.readByte();
        byte b12 = dataInputStream.readByte();
        byte b13 = dataInputStream.readByte();
        byte b14 = dataInputStream.readByte();
        byte b15 = dataInputStream.readByte();
        if (b10 != 116 || b11 != 122 || b12 != 114 || b13 != 101 || b14 != 112 || b15 != 111) {
            throw new IOException(e.l("Invalid tz-repository: ", str));
        }
    }

    public static Class f() {
        if (!Boolean.getBoolean("test.environment")) {
            return a.class;
        }
        try {
            return Class.forName("net.time4j.tz.spi.RepositoryTest");
        } catch (ClassNotFoundException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // net.time4j.tz.o
    public final Set a() {
        return this.f3391c.keySet();
    }

    @Override // net.time4j.tz.o
    public final Map b() {
        return this.f3392d;
    }

    @Override // net.time4j.tz.o
    public final String c() {
        return this.f3389a;
    }

    @Override // net.time4j.tz.o
    public final String d() {
        return this.f3390b;
    }

    @Override // net.time4j.tz.o
    public final String getName() {
        return "TZDB";
    }

    @Override // net.time4j.tz.o
    public final j load(String str) {
        try {
            byte[] bArr = (byte[]) this.f3391c.get(str);
            if (bArr != null) {
                return (j) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.k(new StringBuilder("TZ-REPOSITORY("), this.f3389a, ")");
    }
}
