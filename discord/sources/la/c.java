package la;

import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import n8.i;
import pa.n;
import q8.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f14997h;

    public c(n nVar) {
        nVar.getClass();
        this.f14997h = nVar;
        this.f14992c = 0;
        this.f14991b = 0;
        this.f14993d = 0;
        this.f14995f = 0;
        this.f14994e = 0;
        this.f14990a = 0;
    }

    public final boolean a(e eVar) throws Throwable {
        int i7;
        int i10 = this.f14994e;
        while (this.f14990a != 6 && (i7 = eVar.read()) != -1) {
            try {
                int i11 = this.f14992c;
                this.f14992c = i11 + 1;
                if (this.f14996g) {
                    this.f14990a = 6;
                    this.f14996g = false;
                    return false;
                }
                int i12 = this.f14990a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f14990a = 5;
                                } else if (i12 != 5) {
                                    i.e(false);
                                } else {
                                    int i13 = ((this.f14991b << 8) + i7) - 2;
                                    ib.a.J(eVar, i13);
                                    this.f14992c += i13;
                                    this.f14990a = 2;
                                }
                            } else if (i7 == 255) {
                                this.f14990a = 3;
                            } else if (i7 == 0) {
                                this.f14990a = 2;
                            } else if (i7 == 217) {
                                this.f14996g = true;
                                int i14 = i11 - 1;
                                int i15 = this.f14993d;
                                if (i15 > 0) {
                                    this.f14995f = i14;
                                }
                                this.f14993d = i15 + 1;
                                this.f14994e = i15;
                                this.f14990a = 2;
                            } else {
                                if (i7 == 218) {
                                    int i16 = i11 - 1;
                                    int i17 = this.f14993d;
                                    if (i17 > 0) {
                                        this.f14995f = i16;
                                    }
                                    this.f14993d = i17 + 1;
                                    this.f14994e = i17;
                                }
                                if (i7 == 1 || ((i7 >= 208 && i7 <= 215) || i7 == 217 || i7 == 216)) {
                                    this.f14990a = 2;
                                } else {
                                    this.f14990a = 4;
                                }
                            }
                        } else if (i7 == 255) {
                            this.f14990a = 3;
                        }
                    } else if (i7 == 216) {
                        this.f14990a = 2;
                    } else {
                        this.f14990a = 6;
                    }
                } else if (i7 == 255) {
                    this.f14990a = 1;
                } else {
                    this.f14990a = 6;
                }
                this.f14991b = i7;
            } catch (IOException e10) {
                i.h(e10);
                throw null;
            }
        }
        return (this.f14990a == 6 || this.f14994e == i10) ? false : true;
    }

    public final boolean b(EncodedImage encodedImage) {
        if (this.f14990a == 6 || encodedImage.getSize() <= this.f14992c) {
            return false;
        }
        InputStream inputStreamOrThrow = encodedImage.getInputStreamOrThrow();
        n nVar = this.f14997h;
        e eVar = new e(inputStreamOrThrow, (byte[]) nVar.get(16384), nVar);
        try {
            try {
                ib.a.J(eVar, this.f14992c);
                boolean zA = a(eVar);
                n8.a.b(eVar);
                return zA;
            } catch (IOException e10) {
                i.h(e10);
                throw null;
            }
        } catch (Throwable th2) {
            n8.a.b(eVar);
            throw th2;
        }
    }
}
