package e5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.discord.media_player.HttpEngineFactoryResolver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import ga.l;
import he.s;
import java.util.HashMap;
import java.util.Map;
import je.e0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DataSource.Factory f8038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.discord.avatar.react.a f8039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f8040c;

    public static DataSource.Factory a(ReactContext reactContext, s sVar, Map map, String str) {
        String str2;
        com.discord.avatar.react.a aVar;
        DataSource.Factory factoryInit$lambda$0;
        if (str != null && (aVar = f8039b) != null && (factoryInit$lambda$0 = HttpEngineFactoryResolver.init$lambda$0((Context) aVar.f3966b, str)) != null) {
            return factoryInit$lambda$0;
        }
        if (f8038a == null || (map != null && !map.isEmpty())) {
            OkHttpClient okHttpClient = OkHttpClientProvider.getOkHttpClient();
            ((CookieJarContainer) okHttpClient.G).setCookieJar(new l(new ForwardingCookieHandler(reactContext)));
            if (f8040c == null) {
                int i7 = e0.f13788a;
                try {
                    str2 = reactContext.getPackageManager().getPackageInfo(reactContext.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str2 = "?";
                }
                f8040c = com.discord.chat.presentation.list.a.k(com.discord.chat.presentation.list.a.n("ReactNativeVideo/", str2, " (Linux;Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.19.1");
            }
            oc.b bVar = new oc.b(okHttpClient, f8040c, sVar);
            if (map != null) {
                e4.l lVar = (e4.l) bVar.f9357e;
                synchronized (lVar) {
                    lVar.f7990i = null;
                    ((HashMap) lVar.f7989e).clear();
                    ((HashMap) lVar.f7989e).putAll(map);
                }
            }
            f8038a = new com.google.android.exoplayer2.upstream.a(reactContext, sVar, bVar);
        }
        return f8038a;
    }
}
