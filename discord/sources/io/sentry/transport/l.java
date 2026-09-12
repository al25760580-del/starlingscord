package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13190b;

    public l(String str, String str2) {
        this.f13189a = str;
        this.f13190b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f13189a, this.f13190b.toCharArray());
    }
}
