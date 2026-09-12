package l4;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f14878e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f14879i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f14880v;

    public /* synthetic */ j(Context context, String str, String str2, int i7) {
        this.f14877d = i7;
        this.f14878e = context;
        this.f14879i = str;
        this.f14880v = str2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        i iVar;
        a0 a0Var;
        boolean z5;
        i iVar2;
        Pair pair;
        a0 a0VarF;
        u4.b bVar;
        switch (this.f14877d) {
            case 0:
                Context context = this.f14878e;
                String str = this.f14879i;
                String str2 = this.f14880v;
                u4.c cVar = sa.a.f19814b;
                if (cVar == null) {
                    synchronized (u4.c.class) {
                        try {
                            cVar = sa.a.f19814b;
                            if (cVar == null) {
                                Context applicationContext = context.getApplicationContext();
                                u4.b bVar2 = sa.a.f19815c;
                                if (bVar2 == null) {
                                    synchronized (u4.b.class) {
                                        try {
                                            bVar = sa.a.f19815c;
                                            if (bVar == null) {
                                                bVar = new u4.b(0, new com.discord.chat.input.views.d(applicationContext, 8));
                                                sa.a.f19815c = bVar;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    bVar2 = bVar;
                                }
                                cVar = new u4.c(bVar2, new io.sentry.hints.j(17));
                                sa.a.f19814b = cVar;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                u4.c cVar2 = cVar;
                io.sentry.android.core.internal.tombstone.a aVarA = null;
                if (str2 != null) {
                    try {
                        File fileD0 = ((u4.b) cVar2.f20946d).d0(str);
                        if (fileD0 == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileD0);
                            u4.a aVar = fileD0.getAbsolutePath().endsWith(".zip") ? u4.a.ZIP : fileD0.getAbsolutePath().endsWith(".gz") ? u4.a.GZIP : u4.a.JSON;
                            fileD0.getAbsolutePath();
                            x4.c.a();
                            pair = new Pair(aVar, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        iVar = null;
                    } else {
                        u4.a aVar2 = (u4.a) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 1) {
                            a0VarF = m.f(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            a0VarF = m.c(inputStream, str2);
                        } else {
                            try {
                                a0VarF = m.c(new GZIPInputStream(inputStream), str2);
                            } catch (IOException e10) {
                                a0VarF = new a0(e10);
                            }
                        }
                        iVar = a0VarF.f14820a;
                        if (iVar == null) {
                            iVar = null;
                        }
                    }
                    break;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    a0Var = new a0(iVar);
                } else {
                    x4.c.a();
                    x4.c.a();
                    try {
                        try {
                            aVarA = io.sentry.hints.j.A(str);
                            HttpURLConnection httpURLConnection = (HttpURLConnection) aVarA.f12265e;
                            try {
                                z5 = httpURLConnection.getResponseCode() / 100 == 2;
                            } catch (IOException unused2) {
                            }
                            if (z5) {
                                a0Var = cVar2.i(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                                i iVar3 = a0Var.f14820a;
                                x4.c.a();
                            } else {
                                a0Var = new a0(new IllegalArgumentException(aVarA.c()));
                            }
                        } catch (Exception e11) {
                            a0Var = new a0(e11);
                            if (0 != 0) {
                            }
                            if (str2 != null) {
                                q4.g.f18624b.f18625a.b(str2, iVar2);
                            }
                            return a0Var;
                        }
                        try {
                            aVarA.close();
                        } catch (IOException e12) {
                            x4.c.c("LottieFetchResult close failed ", e12);
                        }
                        break;
                    } catch (Throwable th4) {
                        if (0 == 0) {
                            throw th4;
                        }
                        try {
                            aVarA.close();
                            throw th4;
                        } catch (IOException e13) {
                            x4.c.c("LottieFetchResult close failed ", e13);
                            throw th4;
                        }
                    }
                }
                if (str2 != null && (iVar2 = a0Var.f14820a) != null) {
                    q4.g.f18624b.f18625a.b(str2, iVar2);
                }
                return a0Var;
            default:
                return m.b(this.f14878e, this.f14879i, this.f14880v);
        }
    }
}
