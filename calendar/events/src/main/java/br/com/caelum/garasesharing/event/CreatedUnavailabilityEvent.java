package br.com.caelum.garasesharing.event;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class CreatedUnavailabilityEvent extends Event {

    private Long id;
    private LocalDateTime start;
    private LocalDateTime end;
    private String garageId;

    /**
     * @deprecated frameworks only
     */
    @Deprecated
    private CreatedUnavailabilityEvent() {
    }

    public CreatedUnavailabilityEvent(Long id, LocalDateTime start, LocalDateTime end, String garageId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.garageId = garageId;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public String getGarageId() {
        return garageId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CreatedUnavailabilityEvent.class.getSimpleName() + "[", "]")
            .add("id=" + id)
            .add("start=" + start)
            .add("end=" + end)
            .add("garageId='" + garageId + "'")
            .toString();
    }
}
