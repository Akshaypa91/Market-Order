package Market.Order2.Order.common.api;


import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode(callSuper = false)
public final class ApiResumeUser extends ApiCommand {

    public final long uid;

    @Override
    public String toString() {
        return "[RESUME_USER " + uid + "]";
    }
}
