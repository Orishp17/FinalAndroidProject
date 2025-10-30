package com.example.androidproject.database.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.androidproject.models.OtherUser;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OtherUserDao_Impl implements OtherUserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OtherUser> __insertionAdapterOfOtherUser;

  private final Converters __converters = new Converters();

  public OtherUserDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOtherUser = new EntityInsertionAdapter<OtherUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `other_user` (`id`,`email`,`fullName`,`image`,`yearsOfExperience`,`updatedAt`,`posts`,`favoritePosts`,`ratedPosts`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OtherUser entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEmail());
        }
        if (entity.getFullName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFullName());
        }
        if (entity.getImage() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getImage());
        }
        statement.bindLong(5, entity.getYearsOfExperience());
        statement.bindLong(6, entity.getUpdatedAt());
        final String _tmp = __converters.fromListOfStringsToString(entity.getPosts());
        if (_tmp == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp);
        }
        final String _tmp_1 = __converters.fromListOfStringsToString(entity.getFavoritePosts());
        if (_tmp_1 == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, _tmp_1);
        }
        final String _tmp_2 = __converters.fromListOfStringsToString(entity.getRatedPosts());
        if (_tmp_2 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_2);
        }
      }
    };
  }

  @Override
  public Object insert(final OtherUser[] user, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOtherUser.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insert(final List<OtherUser> users, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOtherUser.insert(users);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<OtherUser>> listenAllUsers() {
    final String _sql = "SELECT * from other_user ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"other_user"}, false, new Callable<List<OtherUser>>() {
      @Override
      @Nullable
      public List<OtherUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfYearsOfExperience = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfPosts = CursorUtil.getColumnIndexOrThrow(_cursor, "posts");
          final int _cursorIndexOfFavoritePosts = CursorUtil.getColumnIndexOrThrow(_cursor, "favoritePosts");
          final int _cursorIndexOfRatedPosts = CursorUtil.getColumnIndexOrThrow(_cursor, "ratedPosts");
          final List<OtherUser> _result = new ArrayList<OtherUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OtherUser _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpYearsOfExperience;
            _tmpYearsOfExperience = _cursor.getInt(_cursorIndexOfYearsOfExperience);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final List<String> _tmpPosts;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfPosts)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfPosts);
            }
            _tmpPosts = __converters.fromStringToListOfStrings(_tmp);
            final List<String> _tmpFavoritePosts;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfFavoritePosts)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfFavoritePosts);
            }
            _tmpFavoritePosts = __converters.fromStringToListOfStrings(_tmp_1);
            final List<String> _tmpRatedPosts;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfRatedPosts)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfRatedPosts);
            }
            _tmpRatedPosts = __converters.fromStringToListOfStrings(_tmp_2);
            _item = new OtherUser(_tmpId,_tmpEmail,_tmpFullName,_tmpImage,_tmpYearsOfExperience,_tmpUpdatedAt,_tmpPosts,_tmpFavoritePosts,_tmpRatedPosts);
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
