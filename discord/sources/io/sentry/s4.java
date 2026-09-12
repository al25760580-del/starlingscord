package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13150f;

    public final boolean a() {
        return this.f13147c;
    }

    public final boolean b() {
        return this.f13145a;
    }

    public final boolean c() {
        return this.f13150f;
    }

    public final boolean d() {
        return this.f13148d;
    }

    public final boolean e() {
        return this.f13146b;
    }

    public final boolean f() {
        return this.f13149e;
    }

    public final void g(boolean z5) {
        this.f13147c = z5;
    }

    public final void h(boolean z5) {
        this.f13145a = z5;
    }

    public final void i(boolean z5) {
        this.f13150f = z5;
    }

    public final void j(boolean z5) {
        this.f13148d = z5;
    }

    public final void k(boolean z5) {
        this.f13146b = z5;
    }

    public final void l(boolean z5) {
        this.f13149e = z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb2.append(this.f13145a);
        sb2.append(", showName=");
        sb2.append(this.f13146b);
        sb2.append(", isEmailRequired=");
        sb2.append(this.f13147c);
        sb2.append(", showEmail=");
        sb2.append(this.f13148d);
        sb2.append(", useSentryUser=");
        sb2.append(this.f13149e);
        sb2.append(", showBranding=");
        return com.discord.chat.presentation.list.a.m(sb2, this.f13150f, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
    }
}
