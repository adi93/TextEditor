package site.orakem.dao.entry;


import site.orakem.dao.EntryDao;
import site.orakem.dao.InMemoryDao;
import site.orakem.model.Entry;

import java.util.HashMap;

public class InMemoryEntityDao extends InMemoryDao<Entry> implements EntryDao {
  public InMemoryEntityDao() {
    this.data = new HashMap<>();
  }
}
