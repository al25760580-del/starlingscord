package com.discord.chat.presentation.message;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/presentation/message/EnhancedRoleColorsSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "roleColors", "", "<init>", "([I)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnhancedRoleColorsSpan extends CharacterStyle implements UpdateAppearance {

    @NotNull
    private final int[] roleColors;

    public EnhancedRoleColorsSpan(@NotNull int[] roleColors) {
        Intrinsics.checkNotNullParameter(roleColors, "roleColors");
        this.roleColors = roleColors;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint tp2) {
        Intrinsics.checkNotNullParameter(tp2, "tp");
        tp2.setShader(new LinearGradient(0.0f, 0.0f, 150.0f, 0.0f, this.roleColors, (float[]) null, Shader.TileMode.MIRROR));
    }
}
