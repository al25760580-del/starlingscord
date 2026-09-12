package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.EmbedType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4057d;

    public /* synthetic */ a(int i7) {
        this.f4057d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4057d) {
            case 0:
                return BulletListContentNode._childSerializers$_anonymous_();
            case 1:
                return ChannelMentionContentNode._childSerializers$_anonymous_();
            case 2:
                return ChannelMentionContentNode._childSerializers$_anonymous_$0();
            case 3:
                return ChannelNameContentNode._childSerializers$_anonymous_();
            case 4:
                return CommandMentionContentNode._childSerializers$_anonymous_();
            case 5:
                return EmojiContentNode._init_$_anonymous_();
            case 6:
                return EmphasisContentNode._childSerializers$_anonymous_();
            case 7:
                return GameMentionContentNode._childSerializers$_anonymous_();
            case 8:
                return HeadingContentNode._childSerializers$_anonymous_();
            case 9:
                return LHeadingContentNode._childSerializers$_anonymous_();
            case 10:
                return LinkContentNode._childSerializers$_anonymous_();
            case 11:
                return LinkContextData.LinkContext._init_$_anonymous_();
            case 12:
                return MentionContentNode._init_$_anonymous_();
            case 13:
                return ParagraphContentNode._childSerializers$_anonymous_();
            case 14:
                return SpoilerContentNode._childSerializers$_anonymous_();
            case 15:
                return StaticChannelMentionContentNode._childSerializers$_anonymous_();
            case 16:
                return StrikethroughContentNode._childSerializers$_anonymous_();
            case 17:
                return StrongContentNode._childSerializers$_anonymous_();
            case 18:
                return SubtextContentNode._childSerializers$_anonymous_();
            case 19:
                return UnderlineContentNode._childSerializers$_anonymous_();
            case 20:
                return UserOrRoleMentionContentNode._childSerializers$_anonymous_();
            case 21:
                return Embed._childSerializers$_anonymous_();
            case 22:
                return Embed._childSerializers$_anonymous_$6();
            case 23:
                return Embed._childSerializers$_anonymous_$7();
            case 24:
                return Embed._childSerializers$_anonymous_$8();
            case 25:
                return EmbedType._init_$_anonymous_();
            case 26:
                return Unit.f14616a;
            case 27:
                return Unit.f14616a;
            case 28:
                return Unit.f14616a;
            default:
                return Unit.f14616a;
        }
    }
}
