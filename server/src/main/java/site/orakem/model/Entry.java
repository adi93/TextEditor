package site.orakem.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Entry is the basic journal entry. An entry is uniquely identified by its title, and date of creation. (Two entries
 * on same date cannot have the same title).
 */
public class Entry implements Identifiable {
  private UUID id;
  /**
   * Title of the entry
   */
  private String title;
  /**
   * Creation date of entry. Only store the date, not the timestamp. (But what about timezones, bitch?)
   */
  private Date created;
  /**
   * Tags are... well, <i>tags</i> of the entry. Entries and tags have many-to-many relationship.
   */
  private List<Tag> tags;
  /**
   * A new class is needed for content, since I have not yet decided how to store it. Should it be in md format? Json?
   * Simple text?
   */
  private Content content;

  Entry() {
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    return this == o || o instanceof Entry entry && id.equals(entry.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public void setId(UUID id) {
    this.id = id;
  }
}
