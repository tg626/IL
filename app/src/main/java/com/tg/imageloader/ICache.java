package com.tg.imageloader;

/**
 * 缓存协议
 * Created by tg on 2016/2/11.
 */
public interface ICache {
    /*
        读取缓存
    */
    public void getCache();

    /*
        保存缓存
     */
    public void setCache();
}
