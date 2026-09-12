package pc;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17919c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17920a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17921b = -1;

    public final boolean a(String str) {
        Matcher matcher = f17919c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i7 = e0.f13788a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f17920a = i10;
            this.f17921b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i7 = 0;
        while (true) {
            cd.b[] bVarArr = metadata.f5693d;
            if (i7 >= bVarArr.length) {
                return;
            }
            cd.b bVar = bVarArr[i7];
            if (bVar instanceof hd.e) {
                hd.e eVar = (hd.e) bVar;
                if ("iTunSMPB".equals(eVar.f10559i) && a(eVar.f10560v)) {
                    return;
                }
            } else if (bVar instanceof hd.k) {
                hd.k kVar = (hd.k) bVar;
                if ("com.apple.iTunes".equals(kVar.f10571e) && "iTunSMPB".equals(kVar.f10572i) && a(kVar.f10573v)) {
                    return;
                }
            } else {
                continue;
            }
            i7++;
        }
    }
}
