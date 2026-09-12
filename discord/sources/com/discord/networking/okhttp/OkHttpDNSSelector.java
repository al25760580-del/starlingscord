package com.discord.networking.okhttp;

import com.facebook.imagepipeline.nativecode.b;
import cs.n;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import tn.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/discord/networking/okhttp/OkHttpDNSSelector;", "Lcs/n;", "Lcom/discord/networking/okhttp/OkHttpDNSSelector$IPvMode;", "mode", "<init>", "(Lcom/discord/networking/okhttp/OkHttpDNSSelector$IPvMode;)V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/discord/networking/okhttp/OkHttpDNSSelector$IPvMode;", "IPvMode", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpDNSSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1056#2:36\n1056#2:37\n774#2:38\n865#2,2:39\n774#2:41\n865#2,2:42\n*S KotlinDebug\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n*L\n25#1:36\n26#1:37\n27#1:38\n27#1:39,2\n28#1:41\n28#1:42,2\n*E\n"})
public final class OkHttpDNSSelector implements n {

    @NotNull
    private final IPvMode mode;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/discord/networking/okhttp/OkHttpDNSSelector$IPvMode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "SYSTEM", "IPV6_FIRST", "IPV4_FIRST", "IPV6_ONLY", "IPV4_ONLY", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum IPvMode {
        SYSTEM("system"),
        IPV6_FIRST("ipv6"),
        IPV4_FIRST("ipv4"),
        IPV6_ONLY("ipv6only"),
        IPV4_ONLY("ipv4only");

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        private final String code;

        IPvMode(String str) {
            this.code = str;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IPvMode.values().length];
            try {
                iArr[IPvMode.IPV6_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IPvMode.IPV4_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IPvMode.IPV6_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IPvMode.IPV4_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IPvMode.SYSTEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OkHttpDNSSelector(@NotNull IPvMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    @Override // cs.n
    @NotNull
    public List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
            List<InetAddress> listH = y.H(allByName);
            int i7 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
            if (i7 == 1) {
                return CollectionsKt.e0(listH, new Comparator() { // from class: com.discord.networking.okhttp.OkHttpDNSSelector$lookup$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return a.a(Boolean.valueOf(Inet4Address.class.isInstance((InetAddress) t5)), Boolean.valueOf(Inet4Address.class.isInstance((InetAddress) t10)));
                    }
                });
            }
            if (i7 == 2) {
                return CollectionsKt.e0(listH, new Comparator() { // from class: com.discord.networking.okhttp.OkHttpDNSSelector$lookup$$inlined$sortedBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return a.a(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) t5)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) t10)));
                    }
                });
            }
            if (i7 == 3) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (Inet6Address.class.isInstance((InetAddress) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            if (i7 != 4) {
                if (i7 == 5) {
                    return listH;
                }
                throw new rn.n();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listH) {
                if (Inet4Address.class.isInstance((InetAddress) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
