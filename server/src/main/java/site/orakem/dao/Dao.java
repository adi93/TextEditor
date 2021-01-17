package site.orakem.dao;

import site.orakem.model.Identifiable;

import java.util.Optional;
import java.util.UUID;

public interface Dao<T extends Identifiable> {
  Optional<T> getEntity(UUID entityId);
  UUID addEntity(final T entity);
  void deleteEntity(UUID entityId);
  void updateEntity(UUID entityId, T newEntity);
}
