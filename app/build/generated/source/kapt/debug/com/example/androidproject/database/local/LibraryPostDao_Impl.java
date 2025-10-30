package com.example.androidproject.database.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.androidproject.models.LibraryPost;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LibraryPostDao_Impl implements LibraryPostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LibraryPost> __insertionAdapterOfLibraryPost;

  private final Converters __converters = new Converters();

  public LibraryPostDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLibraryPost = new EntityInsertionAdapter<LibraryPost>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `posts` (`id`,`owner`,`title`,`content`,`image`,`version`,`postedAt`,`updatedAt`,`links`,`tags`,`ratings`,`deleted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LibraryPost entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getOwner() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getOwner());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getContent());
        }
        if (entity.getImage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getImage());
        }
        statement.bindDouble(6, entity.getVersion());
        statement.bindLong(7, entity.getPostedAt());
        statement.bindLong(8, entity.getUpdatedAt());
        final String _tmp = __converters.fromListOfStringsToString(entity.getLinks());
        if (_tmp == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp);
        }
        final String _tmp_1 = __converters.fromListOfStringsToString(entity.getTags());
        if (_tmp_1 == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, _tmp_1);
        }
        final String _tmp_2 = __converters.fromListOfFloatsToString(entity.getRatings());
        if (_tmp_2 == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, _tmp_2);
        }
        final int _tmp_3 = entity.getDeleted() ? 1 : 0;
        statement.bindLong(12, _tmp_3);
      }
    };
  }

  @Override
  public void insert(final List<LibraryPost> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLibraryPost.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final LibraryPost post) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLibraryPost.insert(post);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<LibraryPost>> listenAllPosts() {
    final String _sql = "SELECT * from posts order by updatedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"posts"}, false, new Callable<List<LibraryPost>>() {
      @Override
      @Nullable
      public List<LibraryPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfPostedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "postedAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfLinks = CursorUtil.getColumnIndexOrThrow(_cursor, "links");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "ratings");
          final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
          final List<LibraryPost> _result = new ArrayList<LibraryPost>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LibraryPost _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOwner;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmpOwner = null;
            } else {
              _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final double _tmpVersion;
            _tmpVersion = _cursor.getDouble(_cursorIndexOfVersion);
            final long _tmpPostedAt;
            _tmpPostedAt = _cursor.getLong(_cursorIndexOfPostedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final List<String> _tmpLinks;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfLinks)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfLinks);
            }
            _tmpLinks = __converters.fromStringToListOfStrings(_tmp);
            final List<String> _tmpTags;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTags);
            }
            _tmpTags = __converters.fromStringToListOfStrings(_tmp_1);
            final List<Float> _tmpRatings;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfRatings)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfRatings);
            }
            _tmpRatings = __converters.fromStringToListOfFloats(_tmp_2);
            final boolean _tmpDeleted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfDeleted);
            _tmpDeleted = _tmp_3 != 0;
            _item = new LibraryPost(_tmpId,_tmpOwner,_tmpTitle,_tmpContent,_tmpImage,_tmpVersion,_tmpPostedAt,_tmpUpdatedAt,_tmpLinks,_tmpTags,_tmpRatings,_tmpDeleted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<LibraryPost>> listenMyPosts(final String uid) {
    final String _sql = "SELECT * from posts where owner = ? order by updatedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"posts"}, false, new Callable<List<LibraryPost>>() {
      @Override
      @Nullable
      public List<LibraryPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfPostedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "postedAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfLinks = CursorUtil.getColumnIndexOrThrow(_cursor, "links");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "ratings");
          final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
          final List<LibraryPost> _result = new ArrayList<LibraryPost>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LibraryPost _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOwner;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmpOwner = null;
            } else {
              _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final double _tmpVersion;
            _tmpVersion = _cursor.getDouble(_cursorIndexOfVersion);
            final long _tmpPostedAt;
            _tmpPostedAt = _cursor.getLong(_cursorIndexOfPostedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final List<String> _tmpLinks;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfLinks)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfLinks);
            }
            _tmpLinks = __converters.fromStringToListOfStrings(_tmp);
            final List<String> _tmpTags;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTags);
            }
            _tmpTags = __converters.fromStringToListOfStrings(_tmp_1);
            final List<Float> _tmpRatings;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfRatings)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfRatings);
            }
            _tmpRatings = __converters.fromStringToListOfFloats(_tmp_2);
            final boolean _tmpDeleted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfDeleted);
            _tmpDeleted = _tmp_3 != 0;
            _item = new LibraryPost(_tmpId,_tmpOwner,_tmpTitle,_tmpContent,_tmpImage,_tmpVersion,_tmpPostedAt,_tmpUpdatedAt,_tmpLinks,_tmpTags,_tmpRatings,_tmpDeleted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
