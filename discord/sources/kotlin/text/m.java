package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f14734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f14735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.collections.k f14736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1 f14737d;

    public m(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f14734a = matcher;
        this.f14735b = input;
        this.f14736c = new kotlin.collections.k(1, this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.f14737d == null) {
            this.f14737d = new a1(this);
        }
        a1 a1Var = this.f14737d;
        Intrinsics.checkNotNull(a1Var);
        return a1Var;
    }

    @Override // kotlin.text.MatchResult
    public final kotlin.collections.k b() {
        return this.f14736c;
    }

    public final IntRange c() {
        Matcher matcher = this.f14734a;
        return lo.j.i(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f14734a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final m next() {
        Matcher matcher = this.f14734a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f14735b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new m(matcher2, charSequence);
        }
        return null;
    }
}
