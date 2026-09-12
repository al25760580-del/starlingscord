package com.discord.chat.input.views;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"KEYBOARD_CLOSE_BLUR_DELAY", "", "INVALID_HINT_TERMS", "Lkotlin/text/Regex;", "getINVALID_HINT_TERMS", "()Lkotlin/text/Regex;", "isScreenReaderOn", "", "Landroid/content/Context;", "chat_input_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ChatInputRootViewKt {

    @NotNull
    private static final Regex INVALID_HINT_TERMS = new Regex("MFA|OTP", p.IGNORE_CASE);
    public static final long KEYBOARD_CLOSE_BLUR_DELAY = 100;

    @NotNull
    public static final Regex getINVALID_HINT_TERMS() {
        return INVALID_HINT_TERMS;
    }

    public static final boolean isScreenReaderOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        Intrinsics.checkNotNull(enabledAccessibilityServiceList);
        return !enabledAccessibilityServiceList.isEmpty();
    }
}
