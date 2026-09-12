package pd;

import android.net.Uri;
import android.text.TextUtils;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import gc.h1;
import he.m0;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17965d = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // he.m0
    public final Object j(Uri uri, he.n nVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(nVar, di.d.f7631c)).readLine();
        try {
            Matcher matcher = f17965d.matcher(line);
            if (!matcher.matches()) {
                throw h1.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j5 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j5 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw h1.b(null, e10);
        }
    }
}
