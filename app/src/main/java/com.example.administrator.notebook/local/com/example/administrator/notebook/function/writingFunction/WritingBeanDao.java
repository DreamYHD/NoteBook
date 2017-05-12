package com.example.administrator.notebook.function.writingFunction;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WRITING_BEAN".
*/
public class WritingBeanDao extends AbstractDao<WritingBean, Long> {

    public static final String TABLENAME = "WRITING_BEAN";

    /**
     * Properties of entity WritingBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property WritingContentMD = new Property(1, String.class, "writingContentMD", false, "WRITING_CONTENT_MD");
        public final static Property Time = new Property(2, String.class, "time", false, "TIME");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
    }


    public WritingBeanDao(DaoConfig config) {
        super(config);
    }
    
    public WritingBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WRITING_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"WRITING_CONTENT_MD\" TEXT," + // 1: writingContentMD
                "\"TIME\" TEXT," + // 2: time
                "\"TITLE\" TEXT);"); // 3: title
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WRITING_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WritingBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String writingContentMD = entity.getWritingContentMD();
        if (writingContentMD != null) {
            stmt.bindString(2, writingContentMD);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(3, time);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WritingBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String writingContentMD = entity.getWritingContentMD();
        if (writingContentMD != null) {
            stmt.bindString(2, writingContentMD);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(3, time);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public WritingBean readEntity(Cursor cursor, int offset) {
        WritingBean entity = new WritingBean( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // writingContentMD
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // time
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // title
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WritingBean entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setWritingContentMD(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WritingBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WritingBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WritingBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}