package co;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f3757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f3760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f3760f = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    @Override // co.j
    public final File a() {
        File[] fileArr;
        Function1 function1;
        int i7;
        k kVar = this.f3760f.f3767v;
        boolean z5 = this.f3759e;
        File file = this.f3768a;
        if (z5 || this.f3757c != null) {
            fileArr = this.f3757c;
            if (fileArr != null) {
                i7 = this.f3758d;
                Intrinsics.checkNotNull(fileArr);
                if (i7 < fileArr.length) {
                    File[] fileArr2 = this.f3757c;
                    Intrinsics.checkNotNull(fileArr2);
                    int i10 = this.f3758d;
                    this.f3758d = i10 + 1;
                    return fileArr2[i10];
                }
            }
            if (!this.f3756b) {
                this.f3756b = true;
                return file;
            }
            function1 = kVar.f3772d;
            if (function1 != null) {
                function1.invoke(file);
            }
        } else {
            Function1 function2 = kVar.f3771c;
            if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
                File[] fileArrListFiles = file.listFiles();
                this.f3757c = fileArrListFiles;
                if (fileArrListFiles == null) {
                    Function2 function3 = kVar.f3773e;
                    if (function3 != null) {
                        function3.invoke(file, new a(this.f3768a, null, "Cannot list files in a directory", 2, null));
                    }
                    this.f3759e = true;
                }
                fileArr = this.f3757c;
                if (fileArr != null) {
                    i7 = this.f3758d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i7 < fileArr.length) {
                        File[] fileArr3 = this.f3757c;
                        Intrinsics.checkNotNull(fileArr3);
                        int i11 = this.f3758d;
                        this.f3758d = i11 + 1;
                        return fileArr3[i11];
                    }
                }
                if (!this.f3756b) {
                    this.f3756b = true;
                    return file;
                }
                function1 = kVar.f3772d;
                if (function1 != null) {
                    function1.invoke(file);
                }
            }
        }
        return null;
    }
}
