package hello.advanced.trace;

import lombok.Getter;

@Getter
public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs;
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeNs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeNs;
        this.message = message;
    }
}
