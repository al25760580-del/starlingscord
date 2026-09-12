package ie;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f11762y = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern E = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern F = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
      0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static t b(File file, long j, long j5, af.c cVar) {
        File file2;
        long j7;
        String strGroup;
        File fileC;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = E.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                int i7 = e0.f13788a;
                int length = strGroup.length();
                int iEnd = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (strGroup.charAt(i11) == '%') {
                        i10++;
                    }
                }
                if (i10 != 0) {
                    int i12 = length - (i10 * 2);
                    StringBuilder sb2 = new StringBuilder(i12);
                    Matcher matcher2 = e0.f13796i.matcher(strGroup);
                    while (i10 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c8 = (char) Integer.parseInt(strGroup2, 16);
                        sb2.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb2.append(c8);
                        iEnd = matcher2.end();
                        i10--;
                    }
                    if (iEnd < length) {
                        sb2.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb2.length() != i12) {
                        strGroup = null;
                    } else {
                        strGroup = sb2.toString();
                    }
                }
            } else {
                matcher = f11762y.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileC = null;
            } else {
                File parentFile = file.getParentFile();
                je.b.l(parentFile);
                int i13 = cVar.A(strGroup).f11744a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j10 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileC = c(parentFile, i13, j10, Long.parseLong(strGroup4));
                if (!file.renameTo(fileC)) {
                    fileC = null;
                }
            }
            if (fileC != null) {
                file2 = fileC;
                name = fileC.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = F.matcher(name);
        if (matcher3.matches()) {
            String strGroup5 = matcher3.group(1);
            strGroup5.getClass();
            String str = (String) ((SparseArray) cVar.f394e).get(Integer.parseInt(strGroup5));
            if (str != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String strGroup6 = matcher3.group(2);
                    strGroup6.getClass();
                    long j11 = Long.parseLong(strGroup6);
                    if (j5 == -9223372036854775807L) {
                        String strGroup7 = matcher3.group(3);
                        strGroup7.getClass();
                        j7 = Long.parseLong(strGroup7);
                    } else {
                        j7 = j5;
                    }
                    return new t(str, j11, length2, j7, file2);
                }
            }
        }
        return null;
    }

    public static File c(File file, int i7, long j, long j5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7);
        sb2.append(".");
        sb2.append(j);
        sb2.append(".");
        return new File(file, a3.e.n(sb2, j5, ".v3.exo"));
    }
}
