package com.example.androidproject.database.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CurrentUserDao _currentUserDao;

  private volatile OtherUserDao _otherUserDao;

  private volatile LibraryPostDao _libraryPostDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `posts` (`id` TEXT NOT NULL, `owner` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `image` TEXT NOT NULL, `version` REAL NOT NULL, `postedAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `links` TEXT NOT NULL, `tags` TEXT NOT NULL, `ratings` TEXT NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `current_user` (`id` TEXT NOT NULL, `email` TEXT NOT NULL, `fullName` TEXT NOT NULL, `image` TEXT NOT NULL, `yearsOfExperience` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `posts` TEXT NOT NULL, `favoritePosts` TEXT NOT NULL, `ratedPosts` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `other_user` (`id` TEXT NOT NULL, `email` TEXT NOT NULL, `fullName` TEXT NOT NULL, `image` TEXT NOT NULL, `yearsOfExperience` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `posts` TEXT NOT NULL, `favoritePosts` TEXT NOT NULL, `ratedPosts` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '92e4412df31d9ed012477ee3807f1c60')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `posts`");
        db.execSQL("DROP TABLE IF EXISTS `current_user`");
        db.execSQL("DROP TABLE IF EXISTS `other_user`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsPosts = new HashMap<String, TableInfo.Column>(12);
        _columnsPosts.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("owner", new TableInfo.Column("owner", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("version", new TableInfo.Column("version", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("postedAt", new TableInfo.Column("postedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("links", new TableInfo.Column("links", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("ratings", new TableInfo.Column("ratings", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosts.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPosts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPosts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPosts = new TableInfo("posts", _columnsPosts, _foreignKeysPosts, _indicesPosts);
        final TableInfo _existingPosts = TableInfo.read(db, "posts");
        if (!_infoPosts.equals(_existingPosts)) {
          return new RoomOpenHelper.ValidationResult(false, "posts(com.example.androidproject.models.LibraryPost).\n"
                  + " Expected:\n" + _infoPosts + "\n"
                  + " Found:\n" + _existingPosts);
        }
        final HashMap<String, TableInfo.Column> _columnsCurrentUser = new HashMap<String, TableInfo.Column>(9);
        _columnsCurrentUser.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("yearsOfExperience", new TableInfo.Column("yearsOfExperience", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("posts", new TableInfo.Column("posts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("favoritePosts", new TableInfo.Column("favoritePosts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentUser.put("ratedPosts", new TableInfo.Column("ratedPosts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentUser = new TableInfo("current_user", _columnsCurrentUser, _foreignKeysCurrentUser, _indicesCurrentUser);
        final TableInfo _existingCurrentUser = TableInfo.read(db, "current_user");
        if (!_infoCurrentUser.equals(_existingCurrentUser)) {
          return new RoomOpenHelper.ValidationResult(false, "current_user(com.example.androidproject.models.User).\n"
                  + " Expected:\n" + _infoCurrentUser + "\n"
                  + " Found:\n" + _existingCurrentUser);
        }
        final HashMap<String, TableInfo.Column> _columnsOtherUser = new HashMap<String, TableInfo.Column>(9);
        _columnsOtherUser.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("yearsOfExperience", new TableInfo.Column("yearsOfExperience", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("posts", new TableInfo.Column("posts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("favoritePosts", new TableInfo.Column("favoritePosts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOtherUser.put("ratedPosts", new TableInfo.Column("ratedPosts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOtherUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOtherUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOtherUser = new TableInfo("other_user", _columnsOtherUser, _foreignKeysOtherUser, _indicesOtherUser);
        final TableInfo _existingOtherUser = TableInfo.read(db, "other_user");
        if (!_infoOtherUser.equals(_existingOtherUser)) {
          return new RoomOpenHelper.ValidationResult(false, "other_user(com.example.androidproject.models.OtherUser).\n"
                  + " Expected:\n" + _infoOtherUser + "\n"
                  + " Found:\n" + _existingOtherUser);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "92e4412df31d9ed012477ee3807f1c60", "e80299dca86965d6ae2bb943c78d72eb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "posts","current_user","other_user");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `posts`");
      _db.execSQL("DELETE FROM `current_user`");
      _db.execSQL("DELETE FROM `other_user`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentUserDao.class, CurrentUserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OtherUserDao.class, OtherUserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LibraryPostDao.class, LibraryPostDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CurrentUserDao currentUserDao() {
    if (_currentUserDao != null) {
      return _currentUserDao;
    } else {
      synchronized(this) {
        if(_currentUserDao == null) {
          _currentUserDao = new CurrentUserDao_Impl(this);
        }
        return _currentUserDao;
      }
    }
  }

  @Override
  public OtherUserDao otherUserDao() {
    if (_otherUserDao != null) {
      return _otherUserDao;
    } else {
      synchronized(this) {
        if(_otherUserDao == null) {
          _otherUserDao = new OtherUserDao_Impl(this);
        }
        return _otherUserDao;
      }
    }
  }

  @Override
  public LibraryPostDao libraryPostsDao() {
    if (_libraryPostDao != null) {
      return _libraryPostDao;
    } else {
      synchronized(this) {
        if(_libraryPostDao == null) {
          _libraryPostDao = new LibraryPostDao_Impl(this);
        }
        return _libraryPostDao;
      }
    }
  }
}
