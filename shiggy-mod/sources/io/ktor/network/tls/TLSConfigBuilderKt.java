package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TLSConfigBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/network/tls/TLSConfigBuilder;", "other", "", "takeFrom", "(Lio/ktor/network/tls/TLSConfigBuilder;Lio/ktor/network/tls/TLSConfigBuilder;)V", "", "Ljava/security/cert/X509Certificate;", "chain", "Ljava/security/PrivateKey;", "key", "addCertificateChain", "(Lio/ktor/network/tls/TLSConfigBuilder;[Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;)V", "Ljava/security/KeyStore;", "store", "", "password", "", "alias", "addKeyStoreNullablePassword", "(Lio/ktor/network/tls/TLSConfigBuilder;Ljava/security/KeyStore;[CLjava/lang/String;)V", "addKeyStore", "Ljavax/net/ssl/X509TrustManager;", "findTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSConfigBuilderKt {
    public static final void takeFrom(TLSConfigBuilder tLSConfigBuilder, TLSConfigBuilder other) {
        Intrinsics.checkNotNullParameter(tLSConfigBuilder, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        CollectionsKt.addAll(tLSConfigBuilder.getCertificates(), other.getCertificates());
        tLSConfigBuilder.setRandom(other.getRandom());
        tLSConfigBuilder.setCipherSuites(other.getCipherSuites());
        tLSConfigBuilder.setServerName(other.getServerName());
        tLSConfigBuilder.setTrustManager(other.getTrustManager());
    }

    public static final void addCertificateChain(TLSConfigBuilder tLSConfigBuilder, X509Certificate[] chain, PrivateKey key) {
        Intrinsics.checkNotNullParameter(tLSConfigBuilder, "<this>");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(key, "key");
        tLSConfigBuilder.getCertificates().add(new CertificateAndKey(chain, key));
    }

    public static /* synthetic */ void addKeyStoreNullablePassword$default(TLSConfigBuilder tLSConfigBuilder, KeyStore keyStore, char[] cArr, String str, int i, Object obj) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        if ((i & 4) != 0) {
            str = null;
        }
        addKeyStoreNullablePassword(tLSConfigBuilder, keyStore, cArr, str);
    }

    public static final void addKeyStoreNullablePassword(TLSConfigBuilder tLSConfigBuilder, KeyStore store, char[] cArr, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        List<String> listListOf;
        PrivateKey privateKey;
        Intrinsics.checkNotNullParameter(tLSConfigBuilder, "<this>");
        Intrinsics.checkNotNullParameter(store, "store");
        String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
        Intrinsics.checkNotNull(defaultAlgorithm);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
        Intrinsics.checkNotNull(keyManagerFactory);
        keyManagerFactory.init(store, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        Intrinsics.checkNotNullExpressionValue(keyManagers, "getKeyManagers(...)");
        ArrayList arrayList = new ArrayList();
        for (KeyManager keyManager : keyManagers) {
            if (keyManager instanceof X509KeyManager) {
                arrayList.add(keyManager);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (str == null || (listListOf = CollectionsKt.listOf(str)) == null) {
            Enumeration<String> enumerationAliases = store.aliases();
            Intrinsics.checkNotNull(enumerationAliases);
            ArrayList list = Collections.list(enumerationAliases);
            Intrinsics.checkNotNullExpressionValue(list, "list(...)");
            listListOf = list;
        }
        for (String str2 : listListOf) {
            Certificate[] certificateChain = store.getCertificateChain(str2);
            if (certificateChain == null) {
                throw new IllegalStateException(("Fail to get the certificate chain for this alias: " + str2).toString());
            }
            for (Certificate certificate : certificateChain) {
                if (!(certificate instanceof X509Certificate)) {
                    throw new IllegalStateException(("Fail to add key store " + store + ". Only X509 certificate format supported.").toString());
                }
            }
            Iterator it = arrayList2.iterator();
            do {
                if (it.hasNext()) {
                    privateKey = ((X509KeyManager) it.next()).getPrivateKey(str2);
                } else {
                    throw new NoPrivateKeyException(str2, store);
                }
            } while (privateKey == null);
            ArrayList arrayList3 = new ArrayList(certificateChain.length);
            for (Certificate certificate2 : certificateChain) {
                Intrinsics.checkNotNull(certificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList3.add((X509Certificate) certificate2);
            }
            addCertificateChain(tLSConfigBuilder, (X509Certificate[]) arrayList3.toArray(new X509Certificate[0]), privateKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X509TrustManager findTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        Intrinsics.checkNotNull(trustManagerFactory);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        return (X509TrustManager) CollectionsKt.first((List) arrayList);
    }
}
