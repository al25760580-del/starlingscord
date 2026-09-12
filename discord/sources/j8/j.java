package j8;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m8.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f13703v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static j f13704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f13705x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13707e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f13708i;

    public /* synthetic */ j() {
        this.f13706d = 0;
    }

    public static j b() {
        synchronized (f13703v) {
            try {
                j jVar = f13704w;
                if (jVar == null) {
                    return new j();
                }
                f13704w = (j) jVar.f13708i;
                jVar.f13708i = null;
                f13705x--;
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m8.a
    public void a(File file) {
        j jVarH = b.h((b) this.f13708i, file);
        if (jVarH == null || ((String) jVarH.f13707e) != ".cnt") {
            return;
        }
        ((ArrayList) this.f13707e).add(new a(file, (String) jVarH.f13708i));
    }

    public void d() {
        synchronized (f13703v) {
            try {
                int i7 = f13705x;
                if (i7 < 5) {
                    f13705x = i7 + 1;
                    j jVar = f13704w;
                    if (jVar != null) {
                        this.f13708i = jVar;
                    }
                    f13704w = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f13706d) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f13707e);
                sb2.append("(");
                return com.discord.chat.presentation.list.a.k(sb2, (String) this.f13708i, ")");
            default:
                return super.toString();
        }
    }

    public j(b bVar, File file) {
        this.f13706d = 3;
        this.f13707e = bVar;
        this.f13708i = file;
    }

    public j(b bVar) {
        this.f13706d = 1;
        this.f13708i = bVar;
        this.f13707e = new ArrayList();
    }

    public j(String str, String str2) {
        this.f13706d = 2;
        this.f13707e = str;
        this.f13708i = str2;
    }

    @Override // m8.a
    public void c(File file) {
    }

    @Override // m8.a
    public void e(File file) {
    }
}
