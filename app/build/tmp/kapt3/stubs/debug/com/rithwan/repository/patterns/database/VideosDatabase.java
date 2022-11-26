package com.rithwan.repository.patterns.database;

import java.lang.System;

@androidx.room.Database(entities = {com.rithwan.repository.patterns.database.DatabaseVideo.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/rithwan/repository/patterns/database/VideosDatabase;", "Landroidx/room/RoomDatabase;", "()V", "videoDao", "Lcom/rithwan/repository/patterns/database/VideoDao;", "getVideoDao", "()Lcom/rithwan/repository/patterns/database/VideoDao;", "app_debug"})
public abstract class VideosDatabase extends androidx.room.RoomDatabase {
    
    public VideosDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rithwan.repository.patterns.database.VideoDao getVideoDao();
}