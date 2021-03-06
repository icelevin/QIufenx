package com.hb.utils.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hb.utils.modle.CacheModle;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CACHE_MODLE".
*/
public class CacheModleDao extends AbstractDao<CacheModle, String> {

    public static final String TABLENAME = "CACHE_MODLE";

    /**
     * Properties of entity CacheModle.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Url = new Property(0, String.class, "url", true, "URL");
        public final static Property Response = new Property(1, String.class, "response", false, "RESPONSE");
    }


    public CacheModleDao(DaoConfig config) {
        super(config);
    }
    
    public CacheModleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CACHE_MODLE\" (" + //
                "\"URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: url
                "\"RESPONSE\" TEXT);"); // 1: response
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CACHE_MODLE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CacheModle entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
 
        String response = entity.getResponse();
        if (response != null) {
            stmt.bindString(2, response);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CacheModle entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
 
        String response = entity.getResponse();
        if (response != null) {
            stmt.bindString(2, response);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public CacheModle readEntity(Cursor cursor, int offset) {
        CacheModle entity = new CacheModle( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // url
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // response
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CacheModle entity, int offset) {
        entity.setUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setResponse(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final String updateKeyAfterInsert(CacheModle entity, long rowId) {
        return entity.getUrl();
    }
    
    @Override
    public String getKey(CacheModle entity) {
        if(entity != null) {
            return entity.getUrl();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CacheModle entity) {
        return entity.getUrl() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
