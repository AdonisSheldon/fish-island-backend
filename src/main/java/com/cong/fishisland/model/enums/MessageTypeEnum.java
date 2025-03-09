package com.cong.fishisland.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description: 消息状态
 *
 * @author cong
 * @date 2024/02/18
 */
@AllArgsConstructor
@Getter
public enum MessageTypeEnum {
    ERROR("error", "错误提示"),
    CREATE_CHESS_ROOM("createChessRoom", "创建五子棋房间"),
    JOIN_ROOM("joinRoom", "加入房间"),
    MOVE_CHESS("moveChess", "对方落子"),
    JOIN_SUCCESS("joinSuccess", "成功加入房间"),
    CHAT("chat", "群聊天消息"),
    USER_ONLINE("userOnline", "用户上线"),
    USER_OFFLINE("userOffline", "用户下单");

    private final String type;
    private final String desc;

    private static final Map<String, MessageTypeEnum> CACHE;

    static {
        CACHE = Arrays.stream(MessageTypeEnum.values()).collect(Collectors.toMap(MessageTypeEnum::getType, Function.identity()));
    }

    public static MessageTypeEnum of(String type) {
        return CACHE.get(type);
    }
}
