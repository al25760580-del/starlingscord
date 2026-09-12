package j1;

import a5.i0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f13603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13605e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13606a;

    static {
        i0 i0Var = d.f13610c;
        f13602b = Character.toString((char) 8206);
        f13603c = Character.toString((char) 8207);
        f13604d = new b(false);
        f13605e = new b(true);
    }

    public b(boolean z5) {
        i0 i0Var = d.f13608a;
        this.f13606a = z5;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f13600c = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = aVar.f13600c;
            if (i12 < aVar.f13599b && i7 == 0) {
                CharSequence charSequence2 = aVar.f13598a;
                char cCharAt = charSequence2.charAt(i12);
                aVar.f13601d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f13600c);
                    aVar.f13600c = Character.charCount(iCodePointAt) + aVar.f13600c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f13600c++;
                    char c8 = aVar.f13601d;
                    directionality = c8 < 1792 ? a.f13597e[c8] : Character.getDirectionality(c8);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                    return -1;
                }
                i7 = i11;
            }
        }
        if (i7 != 0) {
            if (i10 == 0) {
                while (aVar.f13600c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i7 == i11) {
                                return -1;
                            }
                            i11--;
                            break;
                        case 16:
                        case 17:
                            if (i7 == i11) {
                                return 1;
                            }
                            i11--;
                            break;
                        case 18:
                            i11++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i10;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f13600c = aVar.f13599b;
        int i7 = 0;
        while (true) {
            int i10 = i7;
            while (aVar.f13600c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i7 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i7 == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i10 == i7) {
                                return -1;
                            }
                            i7--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i7) {
                                return 1;
                            }
                            i7--;
                            break;
                        case 18:
                            i7++;
                            break;
                        default:
                            if (i10 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static b c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f13605e : f13604d;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        i0 i0Var = d.f13610c;
        if (charSequence == null) {
            return null;
        }
        boolean zN = i0Var.n(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zN2 = (zN ? d.f13609b : d.f13608a).n(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f13603c;
        String str4 = f13602b;
        boolean z5 = this.f13606a;
        if (z5 || !(zN2 || a(charSequence) == 1)) {
            str = (!z5 || (zN2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zN != z5) {
            spannableStringBuilder.append(zN ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zN3 = (zN ? d.f13609b : d.f13608a).n(charSequence.length(), charSequence);
        if (!z5 && (zN3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z5 && (!zN3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
