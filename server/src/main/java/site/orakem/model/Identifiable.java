package site.orakem.model;

import java.util.UUID;

public interface Identifiable {

  UUID getId();
  void setId(UUID id);
}
