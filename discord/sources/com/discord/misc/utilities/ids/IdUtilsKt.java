package com.discord.misc.utilities.ids;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0010\r\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"convertToId", "", "", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdUtils.kt\ncom/discord/misc/utilities/ids/IdUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1179#2,2:26\n*S KotlinDebug\n*F\n+ 1 IdUtils.kt\ncom/discord/misc/utilities/ids/IdUtilsKt\n*L\n18#1:26,2\n*E\n"})
public final class IdUtilsKt {
    public static final long convertToId(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long jCharAt = -3750763034362895579L;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            jCharAt = (jCharAt ^ ((long) charSequence.charAt(i7))) * 1099511628211L;
        }
        return jCharAt;
    }
}
