package br.com.caelum.garasesharing.event;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class DeletedUnavailabilityEvent extends Event {
    private String garageId;
    private LocalDateTime start;
    private LocalDateTime end;

    /**
     * @deprecated frameworks only
     */
    @Deprecated
    private DeletedUnavailabilityEvent() {
    }

    public DeletedUnavailabilityEvent(String garageId, LocalDateTime start, LocalDateTime end) {
        this.garageId = garageId;
        this.start = start;
        this.end = end;
    }

    public String getGarageId() {
        return garageId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DeletedUnavailabilityEvent.class.getSimpleName() + "[", "]")
            .add("garageId='" + garageId + "'")
            .add("start=" + start)
            .add("end=" + end)
            .toString();
    }
}
