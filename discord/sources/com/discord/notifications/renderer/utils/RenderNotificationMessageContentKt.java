package com.discord.notifications.renderer.utils;

import android.text.format.DateUtils;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.m;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"renderNotificationMessageContent", "", "content", "notification_renderer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RenderNotificationMessageContentKt {
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    @NotNull
    public static final String renderNotificationMessageContent(@NotNull String content) {
        DateFormat dateTimeInstance;
        CharSequence relativeTimeSpanString;
        Intrinsics.checkNotNullParameter(content, "content");
        Regex regex = new Regex("(```(?:([a-z0-9_+\\-.]+?)\\n)?\\n*([^\\n].*?)\\n*```)");
        Regex regex2 = new Regex("((`+)([\\s\\S]*?[^`])\\2(?!`))");
        Regex regex3 = new Regex("<t:(-?\\d{1,17})(?::([tTdDfFsSR]))?>");
        String strE = regex2.e(regex.e(content, new com.discord.emoji.a(20)), new com.discord.emoji.a(21));
        while (true) {
            m mVarB = regex3.b(strE);
            if (mVarB == null) {
                return content;
            }
            k kVar = mVarB.f14736c;
            MatchGroup matchGroupB = kVar.b(1);
            Intrinsics.checkNotNull(matchGroupB);
            String str = matchGroupB.f14703a;
            MatchGroup matchGroupB2 = kVar.b(2);
            String str2 = matchGroupB2 != null ? matchGroupB2.f14703a : null;
            Date date = new Date(Long.parseLong(str) * ((long) 1000));
            if (Intrinsics.areEqual(str2, "R")) {
                relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(date.getTime());
            } else {
                if (str2 == null) {
                    dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                } else {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 68) {
                        if (iHashCode != 70) {
                            if (iHashCode != 100) {
                                if (iHashCode != 102) {
                                    if (iHashCode != 83) {
                                        if (iHashCode != 84) {
                                            if (iHashCode != 115) {
                                                if (iHashCode == 116 && str2.equals("t")) {
                                                    dateTimeInstance = DateFormat.getTimeInstance(3);
                                                } else {
                                                    dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                                }
                                            } else if (str2.equals("s")) {
                                                dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                                            } else {
                                                dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                            }
                                        } else if (str2.equals("T")) {
                                            dateTimeInstance = DateFormat.getTimeInstance(2);
                                        } else {
                                            dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                        }
                                    } else if (str2.equals("S")) {
                                        dateTimeInstance = DateFormat.getDateTimeInstance(3, 2);
                                    } else {
                                        dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                    }
                                } else if (str2.equals("f")) {
                                    dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                } else {
                                    dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                }
                            } else if (str2.equals("d")) {
                                dateTimeInstance = DateFormat.getDateInstance(3);
                            } else {
                                dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                            }
                        } else if (str2.equals("F")) {
                            dateTimeInstance = DateFormat.getDateTimeInstance(0, 3);
                        } else {
                            dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                        }
                    } else if (str2.equals("D")) {
                        dateTimeInstance = DateFormat.getDateInstance(1);
                    } else {
                        dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                    }
                }
                relativeTimeSpanString = dateTimeInstance.format(date);
            }
            int i7 = mVarB.c().f14688d;
            int i10 = mVarB.c().f14689e + 1;
            Intrinsics.checkNotNull(relativeTimeSpanString);
            content = StringsKt.Q(content, i7, i10, relativeTimeSpanString).toString();
            strE = StringsKt.Q(strE, mVarB.c().f14688d, mVarB.c().f14689e + 1, relativeTimeSpanString).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderNotificationMessageContent$lambda$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MatchGroup matchGroupB = it.b().b(1);
        Intrinsics.checkNotNull(matchGroupB);
        return x.k(matchGroupB.f14703a.length(), "X");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderNotificationMessageContent$lambda$1(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MatchGroup matchGroupB = it.b().b(1);
        Intrinsics.checkNotNull(matchGroupB);
        return x.k(matchGroupB.f14703a.length(), "X");
    }
}
