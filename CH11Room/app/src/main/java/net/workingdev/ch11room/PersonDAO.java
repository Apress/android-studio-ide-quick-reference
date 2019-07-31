package net.workingdev.ch11room;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
interface PersonDAO {
  @Insert
  void insertPerson(Person person);

  @Update
  void updatePerson(Person person);

  @Delete
  void deletePerson(Person person);

  @Query("SELECT * FROM person")
  public List<Person> listPeople();
}
