package com.morefun.common.constant;

import com.morefun.common.util.DrawUtil;

/**
 * @author Song
 * @date 2022/3/10 17:05
 * @Version 1.0
 */
public class RedisKeyConstant {
    /**
     * 默认的奖池  如果不指定将使用此键初始化奖池
     */
    public static String DEFAULT_PRICE_POOL = "DEFAULT_PRICE_POOL";

    /**
     * 进行到第几轮了
     */
    private static String CURRENT_ROUND = "CURRENT_ROUND";


    public static String buildCurrentDrawRecordKey(String openId) {

        Integer currentRound = DrawUtil.getCurrentRound();
        return currentRound.toString()+"" + ":" + openId;
    }

    public static String buildPreDrawRecordKey(String openId) {
        return 1+"" + ":" + openId;
    }
}
