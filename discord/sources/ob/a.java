package ob;

import a5.o;
import java.io.File;
import java.io.FilenameFilter;
import sh.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17198b;

    public /* synthetic */ a(String str, int i7) {
        this.f17197a = i7;
        this.f17198b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i7 = this.f17197a;
        String str2 = this.f17198b;
        switch (i7) {
            case 0:
                return str.startsWith(str2);
            default:
                o oVar = x0.f20229h;
                return str.startsWith(String.valueOf(str2).concat("-")) && str.endsWith(".apk");
        }
    }
}
