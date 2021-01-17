package site.orakem.dao;

import site.orakem.model.Identifiable;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

public abstract class InMemoryDao<T extends Identifiable> implements Dao<T>{
  protected Map<UUID, T> data;

  @Override
  public Optional<T> getEntity(UUID entityId) {
    return Optional.ofNullable(data.get(entityId));
  }

  @Override
  public UUID addEntity(T entity) {
    UUID uuid = UUID.randomUUID();
    data.put(uuid, entity);
    return uuid;
  }

  @Override
  public void deleteEntity(UUID entityId) {
    data.remove(entityId);
  }

  @Override
  public void updateEntity(UUID entityId, T newEntity) {
    if (!data.containsKey(entityId)) {
      throw new NoSuchElementException(entityId + " does not exist");
    }
    data.put(entityId, newEntity);
  }
}
